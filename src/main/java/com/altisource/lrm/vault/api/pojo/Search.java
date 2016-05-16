package com.altisource.lrm.vault.api.pojo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
"businessKey",
"businessKeyType",
"documentStatus",
"typeId",
"titleId",
"createdStartDate",
"createdEndDate",
"createdBy",
"modifiedBy",
"sourceChannelId",
"additionalParam",
"excludeSoftDeleted"
})
public class Search {


@JsonProperty("businessKey")
private List<String> businessKey = new ArrayList<String>();

@JsonProperty("businessKeyType")
private Integer businessKeyType;
@JsonProperty("documentStatus")
private DocumentStatus documentStatus;
@JsonProperty("typeId")
private List<Integer> typeId = new ArrayList<Integer>();
@JsonProperty("titleId")
private List<Integer> titleId = new ArrayList<Integer>();
@JsonProperty("createdStartDate")
private String createdStartDate;
@JsonProperty("createdEndDate")
private String createdEndDate;
@JsonProperty("createdBy")
private String createdBy;
@JsonProperty("modifiedBy")
private String modifiedBy;
@JsonProperty("sourceChannelId")
private Object sourceChannelId;
@JsonProperty("additionalParam")
private AdditionalParam additionalParam;
@JsonProperty("excludeSoftDeleted")
private Boolean excludeSoftDeleted;

/**
* 
* @return
* The businessKey
*/

public List<String> getBusinessKey() {
return businessKey;
}

/**
* 
* @param businessKey
* The businessKey
*/

public void setBusinessKey(List<String> businessKey) {
this.businessKey = businessKey;
}

/**
* 
* @return
* The businessKeyType
*/

public Integer getBusinessKeyType() {
return businessKeyType;
}

/**
* 
* @param businessKeyType
* The businessKeyType
*/

public void setBusinessKeyType(Integer businessKeyType) {
this.businessKeyType = businessKeyType;
}

/**
* 
* @return
* The documentStatus
*/

public DocumentStatus getDocumentStatus() {
return documentStatus;
}

/**
* 
* @param documentStatus
* The documentStatus
*/

public void setDocumentStatus(DocumentStatus documentStatus) {
this.documentStatus = documentStatus;
}

/**
* 
* @return
* The typeId
*/

public List<Integer> getTypeId() {
return typeId;
}

/**
* 
* @param typeId
* The typeId
*/

public void setTypeId(List<Integer> typeId) {
Set<Integer> typeSet = new HashSet<Integer>(typeId);
this.typeId.addAll(typeSet);
}

/**
* 
* @return
* The titleId
*/

public List<Integer> getTitleId() {
return titleId;
}

/**
* 
* @param titleId
* The titleId
*/

public void setTitleId(List<Integer> titleId) {
Set<Integer> titleSet = new HashSet<Integer>(titleId);
this.titleId.addAll(titleSet);
}

/**
* 
* @return
* The createdStartDate
*/

public String getCreatedStartDate() {
return createdStartDate;
}

/**
* 
* @param createdStartDate
* The createdStartDate
*/

public void setCreatedStartDate(String createdStartDate) {
this.createdStartDate = createdStartDate;
}

/**
* 
* @return
* The createdEndDate
*/
public String getCreatedEndDate() {
return createdEndDate;
}

/**
* 
* @param createdEndDate
* The createdEndDate
*/

public void setCreatedEndDate(String createdEndDate) {
this.createdEndDate = createdEndDate;
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
* The additionalParam
*/

public AdditionalParam getAdditionalParam() {
return additionalParam;
}

/**
* 
* @param additionalParam
* The additionalParam
*/

public void setAdditionalParam(AdditionalParam additionalParam) {
this.additionalParam = additionalParam;
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

}