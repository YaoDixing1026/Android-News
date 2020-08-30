package com.and.news.bean.response.user;


import com.and.news.bean.entity.Channel;

import java.util.List;

/**
 * Created by ydx on 17-1-12.
 */

public class RespUserInfo {


    /**
     * avatarUrl : string
     * birthday : 2017-01-16T01:35:16.542Z
     * channels : [{"id":"string","name":"string"}]
     * createAt : 2017-01-16T01:35:16.542Z
     * gender : string
     * id : string
     * introduction : string
     * mobile : string
     * status : true
     * type : string
     * updateAt : 2017-01-16T01:35:16.542Z
     * username : string
     */

    private String avatarUrl;
    private String birthday;
    private String createAt;
    private String gender;
    private String id;
    private String introduction;
    private String mobile;
    private boolean status;
    private String type;
    private String updateAt;
    private String username;
    private List<Channel> channels;

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }


}
