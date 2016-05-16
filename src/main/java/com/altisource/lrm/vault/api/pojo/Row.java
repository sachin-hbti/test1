package com.altisource.lrm.vault.api.pojo;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
"businessKey",
"docId",
"parentDocId",
"categoryId",
"category",
"typeId",
"type",
"fileCount",
"releaseDate",
"modifiedBy",
"modifiedDate",
"createdBy",
"createdDate",
"status",
"state",
"priorServicerName",
"classficationStatus",
"accessLevel",
"extendedMetadata",
"files"
})
public class Row {

@JsonProperty("businessKey")
private String businessKey;
@JsonProperty("docId")
private Long docId;
@JsonProperty("parentDocId")
private List<Long> parentDocId = new ArrayList<Long>();
@JsonProperty("categoryId")
private Integer categoryId;
@JsonProperty("category")
private String category;
@JsonProperty("typeId")
private Integer typeId;
@JsonProperty("type")
private String type;
@JsonProperty("fileCount")
private Integer fileCount;
@JsonProperty("releaseDate")
private Long releaseDate;
@JsonProperty("modifiedBy")
private String modifiedBy;
@JsonProperty("modifiedDate")
private Long modifiedDate;
@JsonProperty("createdBy")
private String createdBy;
@JsonProperty("createdDate")
private Long createdDate;
@JsonProperty("status")
private Integer status;
@JsonProperty("state")
private Integer state;
@JsonProperty("priorServicerName")
private String priorServicerName;
@JsonProperty("classficationStatus")
private Integer classficationStatus;
@JsonProperty("accessLevel")
private Object accessLevel;
@JsonProperty("extendedMetadata")
private ExtendedMetadata extendedMetadata;
@JsonProperty("files")
private List<File> files = new ArrayList<File>();

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
* The parentDocId
*/

public List<Long> getParentDocId() {
return parentDocId;
}

/**
* 
* @param parentDocId
* The parentDocId
*/

public void setParentDocId(List<Long> parentDocId) {
this.parentDocId = parentDocId;
}

/**
* 
* @return
* The categoryId
*/

public Integer getCategoryId() {
return categoryId;
}

/**
* 
* @param categoryId
* The categoryId
*/

public void setCategoryId(Integer categoryId) {
this.categoryId = categoryId;
}

/**
* 
* @return
* The category
*/

public String getCategory() {
return category;
}

/**
* 
* @param category
* The category
*/

public void setCategory(String category) {
this.category = category;
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
* The fileCount
*/

public Integer getFileCount() {
return fileCount;
}

/**
* 
* @param fileCount
* The fileCount
*/

public void setFileCount(Integer fileCount) {
this.fileCount = fileCount;
}

/**
* 
* @return
* The releaseDate
*/

public Long getReleaseDate() {
return releaseDate;
}

/**
* 
* @param releaseDate
* The releaseDate
*/

public void setReleaseDate(Long releaseDate) {
this.releaseDate = releaseDate;
}

/**
* 
* @return
* The modifiedBy
*/

public String getModifiedBy() {
return modifiedBy;
}

/**
* 
* @param modifiedBy
* The modifiedBy
*/

public void setModifiedBy(String modifiedBy) {
this.modifiedBy = modifiedBy;
}

/**
* 
* @return
* The modifiedDate
*/
public Long getModifiedDate() {
return modifiedDate;
}

/**
* 
* @param modifiedDate
* The modifiedDate
*/

public void setModifiedDate(Long modifiedDate) {
this.modifiedDate = modifiedDate;
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
* @return
* The createdDate
*/

public Long getCreatedDate() {
return createdDate;
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
* The status
*/

public Integer getStatus() {
return status;
}

/**
* 
* @param status
* The status
*/
public void setStatus(Integer status) {
this.status = status;
}

/**
* 
* @return
* The state
*/

public Integer getState() {
return state;
}

/**
* 
* @param state
* The state
*/

public void setState(Integer state) {
this.state = state;
}

/**
* 
* @return
* The priorServicerName
*/

public String getPriorServicerName() {
return priorServicerName;
}

/**
* 
* @param priorServicerName
* The priorServicerName
*/

public void setPriorServicerName(String priorServicerName) {
this.priorServicerName = priorServicerName;
}

/**
* 
* @return
* The classficationStatus
*/

public Integer getClassficationStatus() {
return classficationStatus;
}

/**
* 
* @param classficationStatus
* The classficationStatus
*/
public void setClassficationStatus(Integer classficationStatus) {
this.classficationStatus = classficationStatus;
}

/**
* 
* @return
* The accessLevel
*/

public Object getAccessLevel() {
return accessLevel;
}

/**
* 
* @param accessLevel
* The accessLevel
*/
public void setAccessLevel(Object accessLevel) {
this.accessLevel = accessLevel;
}

/**
* 
* @return
* The extendedMetadata
*/

public ExtendedMetadata getExtendedMetadata() {
return extendedMetadata;
}

/**
* 
* @param extendedMetadata
* The extendedMetadata
*/
public void setExtendedMetadata(ExtendedMetadata extendedMetadata) {
this.extendedMetadata = extendedMetadata;
}

/**
* 
* @return
* The files
*/
public List<File> getFiles() {
return files;
}

/**
* 
* @param files
* The files
*/
public void setFiles(List<File> files) {
this.files = files;
}

}