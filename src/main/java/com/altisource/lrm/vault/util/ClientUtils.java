package com.altisource.lrm.vault.util;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Base64;
import java.util.Map;
import java.util.UUID;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.core.MultivaluedHashMap;

import static com.altisource.lrm.vault.client.VaultRestClientConstants.*;

public class ClientUtils {

	static Map<String, String> keyValue = PropertyFileReader.readProperties("rest-client.properties");

	public static SSLContext getSSLContext() throws KeyManagementException, NoSuchAlgorithmException {
		SSLContext sslContext = SSLContext.getInstance("TLS");
		sslContext.init(null, new TrustManager[] { new X509TrustManager() {
			public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
			}

			public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
			}

			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return new X509Certificate[0];
			}

		} }, new java.security.SecureRandom());
		return sslContext;
	}

	public static MultivaluedHashMap<String, Object> prepareRequestHeaders() {
		MultivaluedHashMap<String, Object> reqHeaders = new MultivaluedHashMap<String, Object>();
		reqHeaders.add(HEADER_USER_ID, keyValue.get(PARAM_USER_ID));
		String requestorSystemId = keyValue.get(PARAM_REQUESTOR_SYSTEM_ID);
		reqHeaders.add(HEADER_REQUESTOR_SYSTEM_ID, requestorSystemId);
		reqHeaders.add(HEADER_AUTHORIZATION,
				getAuthorization(requestorSystemId, keyValue.get(PARAM_REQUESTOR_SYSTEM_PASSWORD)));
		reqHeaders.add(HEADER_REQUEST_ID, UUID.randomUUID().toString());
		reqHeaders.add(HEADER_TENANT_ID, keyValue.get(PARAM_TENANT_ID));
		reqHeaders.add(HEADER_DEPT_ID, keyValue.get(PARAM_DEPT_ID));
		reqHeaders.add(HEADER_REQUEST_VERSION, VAULT_REQUEST_VERSION);
		reqHeaders.add(HEADER_REQUEST_CHANNEL, VAULT_REQUEST_CHANNEL);

		return reqHeaders;
	}

	private static String getAuthorization(String requestorSystemId, String reqSystemIdPwd) {
		String tempAuthHeader = requestorSystemId + ":" + reqSystemIdPwd;
		return "Basic " + Base64.getEncoder().encodeToString(tempAuthHeader.getBytes());
	}
}
