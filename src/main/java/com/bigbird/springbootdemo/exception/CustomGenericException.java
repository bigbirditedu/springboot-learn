package com.bigbird.springbootdemo.exception;

public class CustomGenericException extends RuntimeException {

    private static final long serialVersionUID = 542673311652976823L;
    private String errorCode;
    private String errorMsg;

    public CustomGenericException(String errCode, String errMsg) {
        this.errorCode = errCode;
        this.errorMsg = errMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}