package com.and.news.bean.entity.order;

import java.io.Serializable;

/**
 * Created by ydx on 17-9-22.
 */

public class OrderCommentBean implements Serializable {

    /**
     * userId : 5951b64b526dcd5f90043a5d
     * username : 网友c4fb9
     * userAvatarUrl : http://x-test.oss-cn-shenzhen.aliyuncs.com/user%403x.png
     * content : not bad
     * createAt : 2017-09-22T06:05:36Z
     */

    private String userId;
    private String username;
    private String userAvatarUrl;
    private String content;
    private String createAt;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserAvatarUrl() {
        return userAvatarUrl;
    }

    public void setUserAvatarUrl(String userAvatarUrl) {
        this.userAvatarUrl = userAvatarUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
}
