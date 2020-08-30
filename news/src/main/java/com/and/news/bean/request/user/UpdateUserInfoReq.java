package com.and.news.bean.request.user;

/**
 * Created by ydx on 17-1-12.
 */

public class UpdateUserInfoReq {

    /**
     * avatarUrl : string
     * birthday : 2017-01-12T01:17:32.333Z
     * gender : string
     * username : string
     */

    private String avatarUrl;
    private String birthday;
    private String gender;
    private String username;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UpdateUserInfoReq{" +
                "avatarUrl='" + avatarUrl + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
