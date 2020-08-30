package com.and.news.bean.entity;

import java.util.Date;

public class Carousel {


    private String id;

//    轮播图 carousel
//    标题 title
    private String title;
//    所属频道 channel
    private String channel;
    private String channelId;

//    跳转url url
    private String photoUrl;
//    显示图片url photoUrl
//    排序位置 position
    private Integer position;
//    引用资源类型 referenceType
    private String referenceType;
    private String referenceId;
//    referenceId
    private Boolean status;
//    状态 status
//    已过期 false
//    正常 true
//    创建时间 createAt
    private Date createAt;

    //    修改时间 updateAt
    private Date updateAt;

    public Carousel() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
