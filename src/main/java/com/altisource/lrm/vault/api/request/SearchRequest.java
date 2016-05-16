package com.altisource.lrm.vault.api.request;


import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import com.altisource.lrm.vault.api.pojo.*;


@JsonPropertyOrder({
"requestorSystemId",
"userId",
"tenantId",
"deptId",
"sortBy",
"offset",
"limit",
"resultType",
"search"
})
public class SearchRequest extends AbstractRequest{

/**
     * 
     */
private static final long serialVersionUID = 2560484802224728064L;

/*
@JsonProperty("requestorSystemId")
private String requestorSystemId;


@JsonProperty("userId")
private String userId;

@JsonProperty("tenantId")
private String tenantId;

@JsonProperty("deptId")
private String deptId;
*/
@JsonProperty("sortBy")
private SortBy sortBy;
@JsonProperty("offset")
private Integer offset;
@JsonProperty("limit")
private Integer limit;
@JsonProperty("resultType")
private Integer resultType;
@JsonProperty("search")
private Search search;

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
* The sortBy
*/

public SortBy getSortBy() {
return sortBy;
}

/**
* 
* @param sortBy
* The sortBy
*/

public void setSortBy(SortBy sortBy) {
this.sortBy = sortBy;
}

/**
* 
* @return
* The offset
*/

public Integer getOffset() {
return offset;
}

/**
* 
* @param offset
* The offset
*/

public void setOffset(Integer offset) {
this.offset = offset;
}

/**
* 
* @return
* The limit
*/

public Integer getLimit() {
return limit;
}

/**
* 
* @param limit
* The limit
*/

public void setLimit(Integer limit) {
this.limit = limit;
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

public void setResultType(Integer resultType) {
this.resultType = resultType;
}

/**
* 
* @return
* The search
*/

public Search getSearch() {
return search;
}

/**
* 
* @param search
* The search
*/

public void setSearch(Search search) {
this.search = search;
}

}