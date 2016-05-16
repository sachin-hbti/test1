package com.altisource.lrm.vault.api.response;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import com.altisource.lrm.vault.api.pojo.*;

@JsonPropertyOrder({
"businessKey",
"docId",
"typeId",
"type",
"documentSize",
"mimeType",
"sourceChannelId",
"createdBy",
"createdDate",
"lastModifiedBy",
"lastModifiedDate",
"pageCount",
"fileAttributes"
})
public class ViewResponse {

@JsonProperty("businessKey")
private String businessKey;
@JsonProperty("docId")
private Long docId;
@JsonProperty("typeId")
private Integer typeId;
@JsonProperty("type")
private String type;
@JsonProperty("documentSize")
private Integer documentSize;
@JsonProperty("mimeType")
private String mimeType;
@JsonProperty("sourceChannelId")
private Object sourceChannelId;
@JsonProperty("createdBy")
private String createdBy;
@JsonProperty("createdDate")
private Long createdDate;
@JsonProperty("lastModifiedBy")
private Object lastModifiedBy;
@JsonProperty("lastModifiedDate")
private Long lastModifiedDate;
@JsonProperty("pageCount")
private Integer pageCount;
@JsonProperty("fileAttributes")
private List<FileAttribute> fileAttributes = new ArrayList<FileAttribute>();


/**
* 
* @return
* The businessKey
*/
public String getBusinessKey() {
return businessKey;
}

/**
* 
* @param businessKey
* The businessKey
*/
public void setBusinessKey(String businessKey) {
this.businessKey = businessKey;
}

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
* The typeId
*/
public Integer getTypeId() {
return typeId;
}

/**
* 
* @param typeId
* The typeId
*/
public void setTypeId(Integer typeId) {
this.typeId = typeId;
}

/**
* 
* @return
* The type
*/
public String getType() {
return type;
}

/**
* 
* @param type
* The type
*/
public void setType(String type) {
this.type = type;
}

/**
* 
* @return
* The documentSize
*/
public Integer getDocumentSize() {
return documentSize;
}

/**
* 
* @param documentSize
* The documentSize
*/
public void setDocumentSize(Integer documentSize) {
this.documentSize = documentSize;
}

/**
* 
* @return
* The mimeType
*/
public String getMimeType() {
return mimeType;
}

/**
* 
* @param mimeType
* The mimeType
*/
public void setMimeType(String mimeType) {
this.mimeType = mimeType;
}

/**
* 
* @return
* The sourceChannelId
*/
public Object getSourceChannelId() {
return sourceChannelId;
}

/**
* 
* @param sourceChannelId
* The sourceChannelId
*/
public void setSourceChannelId(Object sourceChannelId) {
this.sourceChannelId = sourceChannelId;
}

/**
* 
* @return
* The createdDate
*/
public Long getCreatedDate() {
return createdDate;
}

/**
* 
* @return
* The createdBy
*/
public String getCreatedBy() {
    return createdBy;
}

/**
* 
* @param createdBy
* The createdBy
*/
public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
}

/**
* 
* @param createdDate
* The createdDate
*/
public void setCreatedDate(Long createdDate) {
this.createdDate = createdDate;
}

/**
* 
* @return
* The lastModifiedBy
*/
public Object getLastModifiedBy() {
return lastModifiedBy;
}

/**
* 
* @param lastModifiedBy
* The lastModifiedBy
*/
public void setLastModifiedBy(Object lastModifiedBy) {
this.lastModifiedBy = lastModifiedBy;
}

/**
* 
* @return
* The lastModifiedDate
*/
public Long getLastModifiedDate() {
return lastModifiedDate;
}

/**
* 
* @param lastModifiedDate
* The lastModifiedDate
*/
public void setLastModifiedDate(Long lastModifiedDate) {
this.lastModifiedDate = lastModifiedDate;
}

/**
* 
* @return
* The pageCount
*/
public Integer getPageCount() {
return pageCount;
}

/**
* 
* @param pageCount
* The pageCount
*/
public void setPageCount(Integer pageCount) {
this.pageCount = pageCount;
}

/**
* 
* @return
* The fileAttributes
*/
public List<FileAttribute> getFileAttributes() {
return fileAttributes;
}

/**
* 
* @param fileAttributes
* The fileAttributes
*/
public void setFileAttributes(List<FileAttribute> fileAttributes) {
this.fileAttributes = fileAttributes;
}

}