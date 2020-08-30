package com.and.news.bean.request.user;

/**
 * Created by ydx on 17-1-12.
 */

public class LoginFromTokenReq {

    /**
     * deviceId : string
     * deviceType : string
     */

    private String deviceId;
    private String deviceType;

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

    @Override
    public String toString() {
        return "LoginFromTokenReq{" +
                "deviceId='" + deviceId + '\'' +
                ", deviceType='" + deviceType + '\'' +
                '}';
    }
}
