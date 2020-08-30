package com.and.news.bean.entity;


/**
 * Created by ydx on 17-1-9.
 */

public class UserResp {
    private String token;
    private String loginType;

    private String userJsonString;

    public UserResp(String token, String loginType, String userJsonString) {
        this.token = token;
        this.loginType = loginType;
        this.userJsonString = userJsonString;
    }

    public UserResp() {
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserJsonString() {
        return this.userJsonString;
    }

    public void setUserJsonString(String userJsonString) {
        this.userJsonString = userJsonString;
    }
    


}
