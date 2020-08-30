package com.and.news.bean.entity;


import java.util.List;

public class Sms {


    private String id;

//    private String code;
//    private String mobile;
//    private String type;

    public String to;
    //必选	短信接收端手机号码集合，用英文逗号分开，每批发送的手机号数量不得超过200个
    public String appId;
    //必选	应用Id
    public String templateId;
    //必选	模板Id
    public List<String> datas;

    public Sms() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public List<String> getDatas() {
        return datas;
    }

    public void setDatas(List<String> datas) {
        this.datas = datas;
    }
}
