package com.altisource.lrm.vault.api.response;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import com.altisource.lrm.vault.api.pojo.*;

@JsonPropertyOrder({
"docCount",
"resultType",
"data"
})
public class SearchResponse {

@JsonProperty("docCount")
private Integer docCount;
@JsonProperty("resultType")
private Integer resultType;
@JsonProperty("data")
private Data data;

/**
* 
* @return
* The docCount
*/
@JsonProperty("docCount")
public Integer getDocCount() {
return docCount;
}

/**
* 
* @param docCount
* The docCount
*/
@JsonProperty("docCount")
public void setDocCount(Integer docCount) {
this.docCount = docCount;
}

/**
* 
* @return
* The resultType
*/
@JsonProperty("resultType")
public Integer getResultType() {
return resultType;
}

/**
* 
* @param resultType
* The resultType
*/
@JsonProperty("resultType")
public void setResultType(Integer resultType) {
this.resultType = resultType;
}

/**
* 
* @return
* The data
*/
@JsonProperty("data")
public Data getData() {
return data;
}

/**
* 
* @param data
* The data
*/
@JsonProperty("data")
public void setData(Data data) {
this.data = data;
}

}