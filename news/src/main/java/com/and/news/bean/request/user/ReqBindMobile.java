package com.and.news.bean.request.user;

/**
 * Created by ydx on 17-6-6.
 */

public class ReqBindMobile {

    /**
     * code : string
     * mobile : string
     * password : string
     */

    private String code;
    private String mobile;
    private String password;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
