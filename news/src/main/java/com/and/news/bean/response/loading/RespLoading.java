package com.and.news.bean.response.loading;

/**
 * Created by ydx on 17-3-27.
 */

public class RespLoading {

    /**
     * createAt : 2017-08-08T08:45:05.525Z
     * from : 2017-08-08T08:45:05.525Z
     * id : string
     * photoUrl : string
     * referenceId : string
     * referenceType : string
     * status : true
     * title : string
     * to : 2017-08-08T08:45:05.525Z
     * updateAt : 2017-08-08T08:45:05.525Z
     * useBaidu : true
     */

    private String createAt;
    private String from;
    private String id;
    private String photoUrl;
    private String referenceId;
    private String referenceType;
    private boolean status;
    private String title;
    private String to;
    private String updateAt;
    private boolean useBaidu;

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
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

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public boolean isUseBaidu() {
        return useBaidu;
    }

    public void setUseBaidu(boolean useBaidu) {
        this.useBaidu = useBaidu;
    }
}
