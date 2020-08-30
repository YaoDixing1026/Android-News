package com.and.news.bean.entity;

import java.util.Date;


public class AppVersion {


    private String id;

    //    设备类型 device
    private String device;
    //api url
    private String apiUrl;
    //    版本 version
    private String version;
    // 内部版本 1.1.0 => 110
    private Integer internalVersion;
    //    版本标题 title（显示通知时少量内容）
    private String title;
    //    更新内容 content
    private String content;
    //    更新地址 url
    private String url;
    //    强制更新 forceUpdate
    private Boolean forceUpdate;
    private String status;
    // isChecking
    // release

    //    时间 time
    private Date createAt;

    public AppVersion() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getForceUpdate() {
        return forceUpdate;
    }

    public void setForceUpdate(Boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getInternalVersion() {
        return internalVersion;
    }

    public void setInternalVersion(Integer internalVersion) {
        this.internalVersion = internalVersion;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
