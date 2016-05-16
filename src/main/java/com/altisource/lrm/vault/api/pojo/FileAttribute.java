package com.altisource.lrm.vault.api.pojo;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"fileNumber",
"pageCount",
"titleId",
"title",
"status",
"fileSize",
"groupId",
"retrievalStatus"
})
public class FileAttribute {

@JsonProperty("fileNumber")
private Integer fileNumber;
@JsonProperty("pageCount")
private Integer pageCount;
@JsonProperty("titleId")
private Integer titleId;
@JsonProperty("title")
private String title;
@JsonProperty("status")
private Integer status;
@JsonProperty("fileSize")
private Long fileSize;
@JsonProperty("groupId")
private String groupId;
@JsonProperty("retrievalStatus")
private Integer retrievalStatus;

/**
* 
* @return
* The fileNumber
*/
public Integer getFileNumber() {
return fileNumber;
}

/**
* 
* @param fileNumber
* The fileNumber
*/
public void setFileNumber(Integer fileNumber) {
this.fileNumber = fileNumber;
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
* The titleId
*/

public Integer getTitleId() {
return titleId;
}

/**
* 
* @param titleId
* The titleId
*/

public void setTitleId(Integer titleId) {
this.titleId = titleId;
}

/**
* 
* @return
* The title
*/

public String getTitle() {
return title;
}

/**
* 
* @param title
* The title
*/

public void setTitle(String title) {
this.title = title;
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
* The fileSize
*/

public Long getFileSize() {
return fileSize;
}

/**
* 
* @param fileSize
* The fileSize
*/

public void setFileSize(Long fileSize) {
this.fileSize = fileSize;
}

/**
* 
* @return
* The groupId
*/

public String getGroupId() {
return groupId;
}

/**
* 
* @param groupId
* The groupId
*/

public void setGroupId(String groupId) {
this.groupId = groupId;
}

/**
* 
* @return
* The retrievalStatus
*/

public Integer getRetrievalStatus() {
return retrievalStatus;
}

/**
* 
* @param retrievalStatus
* The retrievalStatus
*/

public void setRetrievalStatus(Integer retrievalStatus) {
this.retrievalStatus = retrievalStatus;
}

}