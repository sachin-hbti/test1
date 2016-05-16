package com.altisource.lrm.vault.api.request;


import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
    "requestorSystemId",
    "userId",
    "tenantId",
    "deptId"
    })
public class AbstractRequest implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 6941847368174058992L;

    @JsonProperty("requestId")
    String requestId;
    
    @JsonProperty("requestorSystemId")
    String requestorSystemId;

    @JsonProperty("userId")
    String userId;

    @JsonProperty("tenantId")
    String tenantId;

    @JsonProperty("deptId")
    String deptId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestorSystemId() {
        return requestorSystemId;
    }

    public void setRequestorSystemId(String requestorSystemId) {
        this.requestorSystemId = requestorSystemId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
    
    
    


}
