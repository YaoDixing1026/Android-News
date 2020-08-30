package com.and.news.bean.request.user;

/**
 * Created by ydx on 17-1-12.
 */

public class BindDeviceReq {

    /**
     * deviceId : string
     * deviceType : and
     * pushToken : string
     */

    private String deviceId;
    private String deviceType;
    private String pushToken;

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

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    @Override
    public String toString() {
        return "BindDeviceReq{" +
                "deviceId='" + deviceId + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", pushToken='" + pushToken + '\'' +
                '}';
    }
}
