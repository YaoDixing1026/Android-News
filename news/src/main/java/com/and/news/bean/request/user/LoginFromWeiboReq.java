package com.and.news.bean.request.user;

/**
 * Created by ydx on 17-1-12.
 */

public class LoginFromWeiboReq {

    /**
     * avatarUrl : string
     * deviceId : string
     * deviceType : string
     * name : string
     * openId : string
     * origin : string
     * token : string
     */

    private String avatarUrl;
    private String deviceId;
    private String deviceType;
    private String name;
    private String openId;
    private String origin;
    private String token;

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "LoginFromWeiboReq{" +
                "avatarUrl='" + avatarUrl + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", name='" + name + '\'' +
                ", openId='" + openId + '\'' +
                ", origin='" + origin + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
