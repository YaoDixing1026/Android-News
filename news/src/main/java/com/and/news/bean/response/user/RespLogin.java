package com.and.news.bean.response.user;

/**
 * Created by ydx on 17-1-10.
 */

public class RespLogin {

    private String token;

    private String loginType;

    private RespUserInfo user;

    public RespLogin() {
    }

    public RespLogin(String token, RespUserInfo user) {
        this.token = token;
        this.user = user;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public RespUserInfo getUser() {
        return user;
    }

    public void setUser(RespUserInfo user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "RespLogin{" +
                "token='" + token + '\'' +
                ", user=" + user.toString() +
                '}';
    }
}
