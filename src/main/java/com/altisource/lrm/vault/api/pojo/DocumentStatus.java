package com.altisource.lrm.vault.api.pojo;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder({
"classficationStatus",
"accessClassification",
"status"
})
public class DocumentStatus {

@JsonProperty("classficationStatus")
private List<Integer> classficationStatus = new ArrayList<Integer>();
@JsonProperty("accessClassification")
private List<Object> accessClassification = new ArrayList<Object>();
@JsonProperty("status")
private List<Integer> status = new ArrayList<Integer>();


/**
* 
* @return
* The classficationStatus
*/
public List<Integer> getClassficationStatus() {
return classficationStatus;
}

/**
* 
* @param classficationStatus
* The classficationStatus
*/
public void setClassficationStatus(List<Integer> classficationStatus) {
this.classficationStatus = classficationStatus;
}

/**
* 
* @return
* The accessClassification
*/

public List<Object> getAccessClassification() {
return accessClassification;
}

/**
* 
* @param accessClassification
* The accessClassification
*/

public void setAccessClassification(List<Object> accessClassification) {
this.accessClassification = accessClassification;
}

/**
* 
* @return
* The status
*/

public List<Integer> getStatus() {
return status;
}

/**
* 
* @param status
* The status
*/
public void setStatus(List<Integer> status) {
this.status = status;
}

}