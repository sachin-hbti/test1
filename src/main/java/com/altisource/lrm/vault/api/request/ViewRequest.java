package com.altisource.lrm.vault.api.request;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder({
"requestorSystemId",
"userId",
"tenantId",
"deptId",
"docId",
"fileSet",
"fileNumber",
"responseFileType",
"isBase64Encoded",
"excludeSoftDeleted",
"isThumbnailReqd"
})
public class ViewRequest extends AbstractRequest{ 

/*@JsonProperty("requestorSystemId")
private String requestorSystemId;
@JsonProperty("userId")
private String userId;
@JsonProperty("tenantId")
private String tenantId;
@JsonProperty("deptId")
private String deptId;
*/

    
/**
     * 
     */
    private static final long serialVersionUID = -5465342279594645843L;
    
@JsonProperty("docId")
private Long docId;
@JsonProperty("fileSet")
private Integer fileSet;
@JsonProperty("fileNumber")
private List<Integer> fileNumber = new ArrayList<Integer>();
@JsonProperty("responseFileType")
private Integer responseFileType;
@JsonProperty("isBase64Encoded")
private Boolean isBase64Encoded;
@JsonProperty("excludeSoftDeleted")
private Boolean excludeSoftDeleted;
@JsonProperty("isThumbnailReqd")
private Boolean isThumbnailReqd;


/**
* 
* @return
* The requestorSystemId
*/
/*
public String getRequestorSystemId() {
return requestorSystemId;
}
*/

/**
* 
* @param requestorSystemId
* The requestorSystemId
*/
/*
public void setRequestorSystemId(String requestorSystemId) {
this.requestorSystemId = requestorSystemId;
}
*/
/**
* 
* @return
* The userId
*/
/*
public String getUserId() {
return userId;
}
*/
/**
* 
* @param userId
* The userId
*/
/*
public void setUserId(String userId) {
this.userId = userId;
}
*/
/**
* 
* @return
* The tenantId
*/
/*
public String getTenantId() {
return tenantId;
}
*/
/**
* 
* @param tenantId
* The tenantId
*/
/*
public void setTenantId(String tenantId) {
this.tenantId = tenantId;
}
*/

/**
* 
* @return
* The deptId
*/
/*
public String getDeptId() {
return deptId;
}
*/
/**
* 
* @param deptId
* The deptId
*/
/*
public void setDeptId(String deptId) {
this.deptId = deptId;
}
*/
/**
* 
* @return
* The docId
*/

public Long getDocId() {
return docId;
}

/**
* 
* @param docId
* The docId
*/
public void setDocId(Long docId) {
this.docId = docId;
}

/**
* 
* @return
* The fileSet
*/
public Integer getFileSet() {
return fileSet;
}

/**
* 
* @param fileSet
* The fileSet
*/
public void setFileSet(Integer fileSet) {
this.fileSet = fileSet;
}

/**
* 
* @return
* The fileNumber
*/
public List<Integer> getFileNumber() {
return fileNumber;
}

/**
* 
* @param fileNumber
* The fileNumber
*/
public void setFileNumber(List<Integer> fileNumber) {
this.fileNumber = fileNumber;
}

/**
* 
* @return
* The responseFileType
*/
public Integer getResponseFileType() {
return responseFileType;
}

/**
* 
* @param responseFileType
* The responseFileType
*/
public void setResponseFileType(Integer responseFileType) {
this.responseFileType = responseFileType;
}

/**
* 
* @return
* The isBase64Encoded
*/
public Boolean getIsBase64Encoded() {
return isBase64Encoded;
}

/**
* 
* @param isBase64Encoded
* The isBase64Encoded
*/
public void setIsBase64Encoded(Boolean isBase64Encoded) {
this.isBase64Encoded = isBase64Encoded;
}

/**
* 
* @return
* The excludeSoftDeleted
*/
public Boolean getExcludeSoftDeleted() {
return excludeSoftDeleted;
}

/**
* 
* @param excludeSoftDeleted
* The excludeSoftDeleted
*/
public void setExcludeSoftDeleted(Boolean excludeSoftDeleted) {
this.excludeSoftDeleted = excludeSoftDeleted;
}

/**
* 
* @return
* The isThumbnailReqd
*/
public Boolean getIsThumbnailReqd() {
return isThumbnailReqd;
}

/**
* 
* @param isThumbnailReqd
* The isThumbnailReqd
*/
public void setIsThumbnailReqd(Boolean isThumbnailReqd) {
this.isThumbnailReqd = isThumbnailReqd;
}


}