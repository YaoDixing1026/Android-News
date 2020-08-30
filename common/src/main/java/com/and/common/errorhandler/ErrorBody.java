package com.and.common.errorhandler;

/**
 * Created by ydx on 17-1-11.
 */

public class ErrorBody {

    /**
     * timestamp : 2017-06-12T01:23:25Z
     * status : 400
     * error : Bad Request
     * exception : com.xinwenhd.common.utils.BadReqExcption
     * message : Bad Request
     * path : /app_version/check
     * errorMassage : 当前版本不存在
     * errorCode : CURRENT_VERSION_NOT_EXIST
     */

    private String timestamp;
    private int status;
    private String error;
    private String exception;
    private String message;
    private String path;
    private String errorMassage;
    private String errorCode;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getErrorMassage() {
        return errorMassage;
    }

    public void setErrorMassage(String errorMassage) {
        this.errorMassage = errorMassage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
