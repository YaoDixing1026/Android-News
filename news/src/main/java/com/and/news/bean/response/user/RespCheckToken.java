package com.and.news.bean.response.user;

/**
 * Created by ydx on 17-1-12.
 */

public class RespCheckToken {

    /**
     * createAt : 2017-01-12T03:15:45.052Z
     * deviceId : string
     * deviceType : string
     * expireAt : 2017-01-12T03:15:45.052Z
     * id : string
     * pushToken : string
     * status : true
     * token : string
     * updateAt : 2017-01-12T03:15:45.052Z
     * userId : string
     */

    private String createAt;
    private String deviceId;
    private String deviceType;
    private String expireAt;
    private String id;
    private String pushToken;
    private boolean status;
    private String token;
    private String updateAt;
    private String userId;

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(String expireAt) {
        this.expireAt = expireAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "RespCheckToken{" +
                "createAt='" + createAt + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", expireAt='" + expireAt + '\'' +
                ", id='" + id + '\'' +
                ", pushToken='" + pushToken + '\'' +
                ", status=" + status +
                ", token='" + token + '\'' +
                ", updateAt='" + updateAt + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
