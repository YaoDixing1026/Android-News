package com.and.news.bean.entity;

import java.util.Date;

/**
 * Created by ydx on 17-2-24.
 */

public class PubInfo {

    private String name;
    private String introduction;
    private String tag;
    private String avatarUrl;
    private String channel;
    private String mediaType;
    //推荐状态
    private Boolean recommend;
    private Integer recommendWeight;
    private String recommendInfo;
    //负责人
    private String leaderName;
    private String leaderIdNumber;
    private String leaderIdPhoto;
    private String leaderEmail;
    private String address;
    private String phoneNumber;
    //企业
    private String companyName;
    private String businessLicence;

    private String website;

    //    账户状态 status (类型)
    private String status;
    //    正常 online
    //    禁用 ban
    //    待审核 waiting
    private Date createAt;
    private Date updateAt;

    public PubInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public Integer getRecommendWeight() {
        return recommendWeight;
    }

    public void setRecommendWeight(Integer recommendWeight) {
        this.recommendWeight = recommendWeight;
    }

    public String getRecommendInfo() {
        return recommendInfo;
    }

    public void setRecommendInfo(String recommendInfo) {
        this.recommendInfo = recommendInfo;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getLeaderIdNumber() {
        return leaderIdNumber;
    }

    public void setLeaderIdNumber(String leaderIdNumber) {
        this.leaderIdNumber = leaderIdNumber;
    }

    public String getLeaderIdPhoto() {
        return leaderIdPhoto;
    }

    public void setLeaderIdPhoto(String leaderIdPhoto) {
        this.leaderIdPhoto = leaderIdPhoto;
    }

    public String getLeaderEmail() {
        return leaderEmail;
    }

    public void setLeaderEmail(String leaderEmail) {
        this.leaderEmail = leaderEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBusinessLicence() {
        return businessLicence;
    }

    public void setBusinessLicence(String businessLicence) {
        this.businessLicence = businessLicence;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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
