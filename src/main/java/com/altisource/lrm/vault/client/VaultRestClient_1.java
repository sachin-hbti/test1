
package com.altisource.lrm.vault.client;

import static com.altisource.lrm.vault.client.VaultRestClientConstants.ERROR_RESPONSE_TYPE;
import static com.altisource.lrm.vault.client.VaultRestClientConstants.PARAM_DOCUMENT_URI;
import static com.altisource.lrm.vault.client.VaultRestClientConstants.PARAM_SEARCH_URI;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.io.File;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.media.multipart.BodyPart;
import org.glassfish.jersey.media.multipart.MultiPart;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.altisource.lrm.vault.api.request.SearchRequest;
import com.altisource.lrm.vault.api.request.ViewRequest;
import com.altisource.lrm.vault.api.response.ErrorResponse;
import com.altisource.lrm.vault.api.response.SearchResponse;
import com.altisource.lrm.vault.util.ClientUtils;
import com.altisource.lrm.vault.util.PropertyFileReader;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class VaultRestClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(VaultRestClient.class);
	
	Map<String, String> keyValue = PropertyFileReader.readProperties("rest-client.properties");
	
	
	//This method didnot have comment before sometime back, now it has comments
	private String getErrorMessage(ErrorResponse errorResponse) {
		String msg = "ErrorCode:" + errorResponse.getErrorCode() + ",ErrorDescription:"
				+ errorResponse.getErrorDescription() + ", Details: " + errorResponse.getDetail();
		return msg;
	}

	private Response sendRequest(String requestJson, String requestURI)
			throws KeyManagementException, NoSuchAlgorithmException, JsonProcessingException {
		// Build the client and get the target for URI
		ClientBuilder clientBuilder = ClientBuilder.newBuilder();
		Client client = clientBuilder.sslContext(ClientUtils.getSSLContext()).build();
		client.register(MultiPartFeature.class);
		WebTarget documentAPITarget = client.target(requestURI);

		// Prepare the request headers
		MultivaluedHashMap<String, Object> reqHeaders = ClientUtils.prepareRequestHeaders();
		LOGGER.debug("Request headers :{}", reqHeaders);
		
		Response response = documentAPITarget.request().headers(reqHeaders)
				.post(Entity.entity(requestJson, APPLICATION_JSON), Response.class);
		
		LOGGER.debug("Response :{}", response);
		return response;
	}

	public SearchResponse searchDocuments(SearchRequest searchRequest) {
		try {
			String searchURI = keyValue.get(PARAM_SEARCH_URI);
			ObjectMapper mapper = new ObjectMapper();
			String searchJSON = mapper.writeValueAsString(searchRequest);
			
			LOGGER.info("Search document request URI :{}", searchURI);
			LOGGER.debug("Search document request JSON :{}", searchJSON);
			Response response = sendRequest(searchJSON, searchURI);
			
			String searchResponseStr = response.readEntity(String.class);
			LOGGER.debug("Search document response JSON :{}", searchResponseStr);
			
			if (ERROR_RESPONSE_TYPE.equals(response.getHeaderString("responseType"))) {
				ErrorResponse errorResponse = mapper.readValue(searchResponseStr, ErrorResponse.class);
				String msg = getErrorMessage(errorResponse);
				LOGGER.error("Search documents error response :{}", msg);
				throw new RuntimeException(msg);
			}

			SearchResponse searchResponse = mapper.readValue(searchResponseStr, SearchResponse.class);
			return searchResponse;
		} catch (Exception e) {
			LOGGER.error("Error while searching documents :{}", e);
			throw new RuntimeException("Error while searching documents", e);
		}
	}
	public File fetchDocument(ViewRequest viewRequest) {
		//Adding the comment to do a git commit
		File pdfFile = null;
		try {

			ObjectMapper mapper = new ObjectMapper();

			String requestURI = keyValue.get(PARAM_DOCUMENT_URI);
			String viewReqJSON = mapper.writeValueAsString(viewRequest);
			
			LOGGER.info("Fetch document request URI :{}", requestURI);
			LOGGER.debug("Fetch document request JSON :{}", viewReqJSON);
			Response response = sendRequest(viewReqJSON, requestURI);

			// document API will be a multipart response
			MultiPart multiPart = response.readEntity(MultiPart.class);

			if (ERROR_RESPONSE_TYPE.equals(response.getHeaderString("responseType"))) {
				ErrorResponse errorResponse = getErrorResponse(multiPart, mapper);
				String msg = getErrorMessage(errorResponse);
				LOGGER.error("Fetch document error response :{}", msg);
				throw new RuntimeException(msg);
			}

			for (BodyPart eachBodyPart : multiPart.getBodyParts()) {
				if (eachBodyPart.getMediaType().toString().equals(VaultRestClientConstants.APPLICATION_PDF))
					pdfFile = eachBodyPart.getEntityAs(File.class);
			}
		} catch (Exception e) {
			LOGGER.error("Error while fetching document :{}", e);
			throw new RuntimeException("Error while fetching document", e);
		}
		
		LOGGER.debug("Fetch document response pdf file :{}", pdfFile);
		return pdfFile;
	}
	
	private ErrorResponse getErrorResponse(MultiPart multiPart, ObjectMapper mapper) throws Exception {
		ErrorResponse errorResponse = null;
		for (BodyPart eachBodyPart : multiPart.getBodyParts()) {
			if (eachBodyPart.getMediaType().toString().equals(APPLICATION_JSON)) {
				errorResponse = mapper.readValue(eachBodyPart.getEntityAs(String.class), ErrorResponse.class);
			}
		}
		return errorResponse;
	}
	//Added newMethod to test git revert command
	private String newMethodPre(){
		return  null;
	}

}