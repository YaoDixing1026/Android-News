package com.and.news.bean.entity;


import java.util.Date;


public class VerificationCode {

    private String id;

    // 手机号 mobile
    private String mobile;
    // code
    private String code;
    // 时间 createAt
    private Date createAt;

    public VerificationCode() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
