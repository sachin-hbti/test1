package com.altisource.lrm.vault.client;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import com.altisource.lrm.vault.api.pojo.DocumentStatus;
import com.altisource.lrm.vault.api.pojo.Search;
import com.altisource.lrm.vault.api.request.SearchRequest;
import com.altisource.lrm.vault.api.request.ViewRequest;
import com.altisource.lrm.vault.api.response.SearchResponse;

public class VaultRestClientTest {

	private static final String OUT_FOLDER_PATH = "E:/temp";

	//@Test
	public void testSearchDocuments() {
		SearchRequest searchRequest = new SearchRequest();
		searchRequest.setRequestorSystemId("LRM");
		searchRequest.setUserId("subbarap");
		searchRequest.setTenantId("9");
		searchRequest.setDeptId("1");
		searchRequest.setResultType(1);
		
		Search search = new Search();
		search.setBusinessKey(Arrays.asList("20268702"));
		search.setBusinessKeyType(1);
		DocumentStatus documentStatus = new DocumentStatus();
		documentStatus.setClassficationStatus(Arrays.asList(1));
		search.setDocumentStatus(documentStatus);
		search.setExcludeSoftDeleted(true);
		searchRequest.setSearch(search);
		
		VaultRestClient multiPartClient = new VaultRestClient();
		SearchResponse response = multiPartClient.searchDocuments(searchRequest); 
		assertNotNull(response);
	}
	
	//@Test
	public void testSearchDocumentsThrowException() {
		SearchRequest searchRequest = new SearchRequest();
		searchRequest.setRequestorSystemId("LRM");
		searchRequest.setUserId("subbarap");
		searchRequest.setTenantId("9");
		searchRequest.setDeptId("1");
		searchRequest.setResultType(1);
		
		Search search = new Search();
		search.setBusinessKey(Arrays.asList("111111"));
		search.setBusinessKeyType(1);
		DocumentStatus documentStatus = new DocumentStatus();
		documentStatus.setClassficationStatus(Arrays.asList(1));
		search.setDocumentStatus(documentStatus);
		search.setExcludeSoftDeleted(true);
		searchRequest.setSearch(search);
		
		VaultRestClient multiPartClient = new VaultRestClient();
		SearchResponse response = multiPartClient.searchDocuments(searchRequest); 
		assertNotNull(response);
	}
	//@Test(expected=RuntimeException.class)
	public void testViewDocumentThrowException() {
		VaultRestClient multiPartClient = new VaultRestClient();
		ViewRequest docReq = new ViewRequest();
		docReq.setRequestorSystemId("LRM");
		docReq.setUserId("subbarap");
		docReq.setTenantId("9");
		docReq.setDeptId("1");
		docReq.setFileSet(1);
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		docReq.setFileNumber(list );
		docReq.setResponseFileType(1);
		/*docReq.setIsBase64Encoded(Boolean.FALSE);
		File pdfFile = multiPartClient.fetchDocument(docReq);
		assertNotNull(pdfFile);
		saveFile(pdfFile, "test.pdf");*/
	}
	
	@Test
	public void testViewDocument() {
		VaultRestClient multiPartClient = new VaultRestClient();
		ViewRequest docReq = new ViewRequest();
		docReq.setRequestorSystemId("LRM");
		docReq.setUserId("lrm");
		docReq.setTenantId("9");
		docReq.setDeptId("1");
		docReq.setFileSet(1);
		docReq.setDocId(1227465861L);
		docReq.setFileNumber(Arrays.asList(1) );
		docReq.setResponseFileType(1);
		docReq.setIsBase64Encoded(Boolean.FALSE);
		docReq.setExcludeSoftDeleted(Boolean.TRUE);
		File pdfFile = multiPartClient.fetchDocument(docReq);
		//multiPartClient.fetchDocument1(docReq);
		assertNotNull(pdfFile);
		saveFile(pdfFile, "test.pdf");
	}
	private void saveFile(File receivedFile, String FileName) {
		FileOutputStream fileOutStream = null;
		System.out.println("Saving file " + FileName + " in " + OUT_FOLDER_PATH);
		try {
			byte[] fileContent = IOUtils.toByteArray(new FileInputStream(receivedFile));
			fileOutStream = new FileOutputStream(
					new File(OUT_FOLDER_PATH + File.separatorChar + FileName));
			fileOutStream.write(fileContent);
		} catch (IOException ioe) {
			System.out.println("Exception occured while saving file " + ioe);
			ioe.printStackTrace();
		} finally {
			if (fileOutStream != null) {
				try {
					fileOutStream.close();
				} catch (IOException e) {
					System.out.println("Error closing file output stream");
					e.printStackTrace();
				}
			}
		}
	}

}
