package com.altisource.lrm.vault.api.response;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
"errorCode",
"errorDescription",
"detail"
})
public class ErrorResponse {

@JsonProperty("errorCode")
private String errorCode;
@JsonProperty("errorDescription")
private String errorDescription;
@JsonProperty("detail")
private List<String> detail;

/**
* 
* @return
* The ErrorCode
*/
public String getErrorCode() {
return errorCode;
}

/**
* 
* @param ErrorCode
* The ErrorCode
*/
public void setErrorCode(String errorCode) {
this.errorCode = errorCode;
}

/**
* 
* @return
* The ErrorDescription
*/
public String getErrorDescription() {
return errorDescription;
}

/**
* 
* @param ErrorDescription
* The ErrorDescription
*/
public void setErrorDescription(String errorDescription) {
this.errorDescription = errorDescription;
}

/**
* 
* @return
* The detail
*/
public List<String> getDetail() {
return detail;
}

/**
* 
* @param detail
* The detail
*/
public void setDetail(List<String> detail) {
this.detail = detail;
}

}