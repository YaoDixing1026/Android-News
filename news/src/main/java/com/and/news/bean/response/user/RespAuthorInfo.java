package com.and.news.bean.response.user;

import java.util.List;

/**
 * Created by ydx on 17-2-22.
 */

public class RespAuthorInfo {

    /**
     * avatarUrl : string
     * birthday : 2017-02-22T03:01:13.267Z
     * channels : [{"defaultChannel":true,"id":"string","name":"string","position":0,"status":true,"topChannel":true}]
     * createAt : 2017-02-22T03:01:13.267Z
     * editorInfo : {"avatarUrl":"string","channels":["string"],"createAt":"2017-02-22T03:01:13.268Z","mobile":"string","status":true,"updateAt":"2017-02-22T03:01:13.268Z","username":"string"}
     * gender : string
     * id : string
     * mobile : string
     * pubInfo : {}
     * signture : string
     * status : true
     * type : string
     * updateAt : 2017-02-22T03:01:13.268Z
     * username : string
     */

    private String avatarUrl;
    private String birthday;
    private String createAt;
    private EditorInfoBean editorInfo;
    private String gender;
    private String id;
    private String mobile;
    private PubInfoBean pubInfo;
    private String signture;
    private boolean status;
    private String type;
    private String updateAt;
    private String username;
    private List<ChannelsBean> channels;

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

    public EditorInfoBean getEditorInfo() {
        return editorInfo;
    }

    public void setEditorInfo(EditorInfoBean editorInfo) {
        this.editorInfo = editorInfo;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public PubInfoBean getPubInfo() {
        return pubInfo;
    }

    public void setPubInfo(PubInfoBean pubInfo) {
        this.pubInfo = pubInfo;
    }

    public String getSignture() {
        return signture;
    }

    public void setSignture(String signture) {
        this.signture = signture;
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

    public List<ChannelsBean> getChannels() {
        return channels;
    }

    public void setChannels(List<ChannelsBean> channels) {
        this.channels = channels;
    }

    public static class EditorInfoBean {
        /**
         * avatarUrl : string
         * channels : ["string"]
         * createAt : 2017-02-22T03:01:13.268Z
         * mobile : string
         * status : true
         * updateAt : 2017-02-22T03:01:13.268Z
         * username : string
         */

        private String avatarUrl;
        private String createAt;
        private String mobile;
        private boolean status;
        private String updateAt;
        private String username;
        private List<String> channels;

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getCreateAt() {
            return createAt;
        }

        public void setCreateAt(String createAt) {
            this.createAt = createAt;
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

        public List<String> getChannels() {
            return channels;
        }

        public void setChannels(List<String> channels) {
            this.channels = channels;
        }
    }

    public static class PubInfoBean {
    }

    public static class ChannelsBean {
        /**
         * defaultChannel : true
         * id : string
         * name : string
         * position : 0
         * status : true
         * topChannel : true
         */

        private boolean defaultChannel;
        private String id;
        private String name;
        private int position;
        private boolean status;
        private boolean topChannel;

        public boolean isDefaultChannel() {
            return defaultChannel;
        }

        public void setDefaultChannel(boolean defaultChannel) {
            this.defaultChannel = defaultChannel;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public boolean isTopChannel() {
            return topChannel;
        }

        public void setTopChannel(boolean topChannel) {
            this.topChannel = topChannel;
        }
    }
}
