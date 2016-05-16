package com.altisource.lrm.vault.client;

public interface VaultRestClientConstants {
	
	String PARAM_USER_ID = "USER_ID";
	String PARAM_REQUESTOR_SYSTEM_ID = "REQUESTOR_SYSTEM_ID";
	String PARAM_REQUESTOR_SYSTEM_PASSWORD = "REQUESTOR_SYSTEM_PASSWORD";
	String PARAM_TENANT_ID = "TENANT_ID";
	String PARAM_DEPT_ID = "DEPT_ID";
	String PARAM_DOCUMENT_URI = "DOCUMENT_URI";
	String PARAM_SEARCH_URI = "SEARCH_URI";

	
	String HEADER_USER_ID = "userId";
	String HEADER_REQUESTOR_SYSTEM_ID = "requestorSystemId";
	String HEADER_AUTHORIZATION = "Authorization";
	String HEADER_REQUEST_ID = "requestId";
	String HEADER_TENANT_ID = "tenantId";
	String HEADER_DEPT_ID = "deptId";
	String HEADER_REQUEST_VERSION = "requestVersion";
	String HEADER_REQUEST_CHANNEL = "requestChannel";
	
	String APPLICATION_PDF = "application/pdf";
	
	String ERROR_RESPONSE_TYPE = "2"; 
	String VAULT_REQUEST_VERSION = "0.1";
	Integer VAULT_REQUEST_CHANNEL = 1;
}
