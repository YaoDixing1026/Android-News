package com.and.news.bean.entity;

/**
 * Created by ydx on 17-2-9.
 */

public class Favorite {

    /**
     * createAt : 2017-02-08T01:30:38.282Z
     * id : string
     * referenceId : string
     * referenceType : string
     * status : true
     * title : string
     * userId : string
     */

    private String createAt;
    private String id;
    private String referenceId;
    private String referenceType;
    private boolean status;
    private String title;
    private String userId;

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
