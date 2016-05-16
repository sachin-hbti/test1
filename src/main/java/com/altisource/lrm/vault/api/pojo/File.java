package com.altisource.lrm.vault.api.pojo;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
"fileNumber",
"pageCount",
"titleId",
"title",
"status",
"fileSize",
"groupId"
})
public class File {

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
* The titleDesc
*/

public String getTitle() {
return title;
}

/**
* 
* @param titleDesc
* The titleDesc
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
@JsonProperty("fileSize")
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

}