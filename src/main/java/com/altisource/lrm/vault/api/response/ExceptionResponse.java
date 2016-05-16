/**
 *
 */
package com.altisource.lrm.vault.api.response;

import java.io.Serializable;

import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * @author pandapur
 *
 */
@JsonRootName(value = "exceptionResponse")
public class ExceptionResponse implements Serializable {

    private static final long serialVersionUID = 7672049833119103039L;

    private String status;
    private int statusCode;
    private String errorCode;
    private String errorMessage;
    private String moreInfo;

    public ExceptionResponse() {
        super();
    }

    /**
     * @param status
     * @param code
     * @param message
     * @param moreInfo
     */
    public ExceptionResponse(String status, int statusCode, String errorCode, String errorMssage, String moreInfo) {
        super();
        this.status = status;
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMssage;
        //this.moreInfo = moreInfo;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * @param statusCode
     *            the statusCode to set
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * @return the errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode
     *            the errorCode to set
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage
     *            the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * @return the moreInfo
     */
    public String getMoreInfo() {
        return moreInfo;
    }

    /**
     * @param moreInfo
     *            the moreInfo to set
     */
    public void setMoreInfo(String moreInfo) {
        //this.moreInfo = moreInfo;
    }

}