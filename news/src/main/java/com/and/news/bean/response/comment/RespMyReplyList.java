package com.and.news.bean.response.comment;

import java.util.List;

/**
 * Created by ydx on 17-2-23.
 */

public class RespMyReplyList {


    /**
     * content : [{"id":"58a57790526dcd45c288e16e","title":null,"topicId":"58784ad58905b4305f25c86d","topicType":"news","userId":"58a40874526dcd3db9abecdf","userAvatarUrl":null,"username":"哈哈哈哈","content":"了了来来来","like":0,"status":true,"replyCommentId":null,"replyCommentUserId":"5881c6b2526dcd2763ddcb34","replyCommentUserAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","replyCommentUsername":"体育馆","replyCommentContent":"评论下自己","replyCommentStatus":true,"replyCommentCreateAt":"2017-02-15T07:07:53Z","createAt":"2017-02-16T09:57:36Z","reply":true},{"id":"58a568fa526dcd45c288e16b","title":null,"topicId":"58784ad58905b4305f25c86d","topicType":"news","userId":"58817870526dcd1fea5dbd37","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58817870526dcd1fea5dbd37/20170122230422.png","username":"ggg","content":"京津冀","like":5,"status":true,"replyCommentId":null,"replyCommentUserId":"5881c6b2526dcd2763ddcb34","replyCommentUserAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","replyCommentUsername":"体育馆","replyCommentContent":"评论下自己","replyCommentStatus":true,"replyCommentCreateAt":"2017-02-15T07:07:53Z","createAt":"2017-02-16T08:55:22Z","reply":true},{"id":"58a5674e526dcd45c288e16a","title":null,"topicId":"58784ad58905b4305f25c86d","topicType":"news","userId":"58817870526dcd1fea5dbd37","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58817870526dcd1fea5dbd37/20170122230422.png","username":"ggg","content":"哈哈哈","like":3,"status":true,"replyCommentId":null,"replyCommentUserId":"5881c6b2526dcd2763ddcb34","replyCommentUserAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","replyCommentUsername":"体育馆","replyCommentContent":"g哈哈哈哈","replyCommentStatus":true,"replyCommentCreateAt":"2017-02-15T02:25:02Z","createAt":"2017-02-16T08:48:14Z","reply":true},{"id":"58a41a7c526dcd3f89f2725d","title":null,"topicId":"58784ad58905b4305f25c86d","topicType":"news","userId":"58a40874526dcd3db9abecdf","userAvatarUrl":null,"username":"哈哈哈哈","content":"你好呀","like":0,"status":true,"replyCommentId":null,"replyCommentUserId":"5881c6b2526dcd2763ddcb34","replyCommentUserAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","replyCommentUsername":"体育馆","replyCommentContent":"评论下自己","replyCommentStatus":true,"replyCommentCreateAt":"2017-02-15T07:07:53Z","createAt":"2017-02-15T09:08:12Z","reply":true},{"id":"58a3fe49526dcd3db9abecdc","title":null,"topicId":"58784ad58905b4305f25c86d","topicType":"news","userId":"5881c6b2526dcd2763ddcb34","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","username":"体育馆","content":"评论下自己","like":28,"status":true,"replyCommentId":null,"replyCommentUserId":"5881c6b2526dcd2763ddcb34","replyCommentUserAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","replyCommentUsername":"体育馆","replyCommentContent":"g哈哈哈哈","replyCommentStatus":true,"replyCommentCreateAt":"2017-02-15T02:25:02Z","createAt":"2017-02-15T07:07:53Z","reply":true}]
     * totalElements : 5
     * totalPages : 1
     * last : true
     * first : true
     * sort : null
     * numberOfElements : 5
     * size : 20
     * number : 0
     */

    private int totalElements;
    private int totalPages;
    private boolean last;
    private boolean first;
    private Object sort;
    private int numberOfElements;
    private int size;
    private int number;
    private List<ContentBean> content;

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public Object getSort() {
        return sort;
    }

    public void setSort(Object sort) {
        this.sort = sort;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<ContentBean> getContent() {
        return content;
    }

    public void setContent(List<ContentBean> content) {
        this.content = content;
    }

    public static class ContentBean {
        /**
         * id : 58a57790526dcd45c288e16e
         * title : null
         * topicId : 58784ad58905b4305f25c86d
         * topicType : news
         * userId : 58a40874526dcd3db9abecdf
         * userAvatarUrl : null
         * username : 哈哈哈哈
         * content : 了了来来来
         * like : 0
         * status : true
         * replyCommentId : null
         * replyCommentUserId : 5881c6b2526dcd2763ddcb34
         * replyCommentUserAvatarUrl : http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png
         * replyCommentUsername : 体育馆
         * replyCommentContent : 评论下自己
         * replyCommentStatus : true
         * replyCommentCreateAt : 2017-02-15T07:07:53Z
         * createAt : 2017-02-16T09:57:36Z
         * reply : true
         */

        private String id;
        private String title;
        private String topicId;
        private String topicType;
        private String userId;
        private String userAvatarUrl;
        private String username;
        private String content;
        private int like;
        private boolean status;
        private String replyCommentId;
        private String replyCommentUserId;
        private String replyCommentUserAvatarUrl;
        private String replyCommentUsername;
        private String replyCommentContent;
        private boolean replyCommentStatus;
        private String replyCommentCreateAt;
        private String createAt;
        private boolean reply;

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

        public String getTopicId() {
            return topicId;
        }

        public void setTopicId(String topicId) {
            this.topicId = topicId;
        }

        public String getTopicType() {
            return topicType;
        }

        public void setTopicType(String topicType) {
            this.topicType = topicType;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserAvatarUrl() {
            return userAvatarUrl;
        }

        public void setUserAvatarUrl(String userAvatarUrl) {
            this.userAvatarUrl = userAvatarUrl;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getLike() {
            return like;
        }

        public void setLike(int like) {
            this.like = like;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public String getReplyCommentId() {
            return replyCommentId;
        }

        public void setReplyCommentId(String replyCommentId) {
            this.replyCommentId = replyCommentId;
        }

        public String getReplyCommentUserId() {
            return replyCommentUserId;
        }

        public void setReplyCommentUserId(String replyCommentUserId) {
            this.replyCommentUserId = replyCommentUserId;
        }

        public String getReplyCommentUserAvatarUrl() {
            return replyCommentUserAvatarUrl;
        }

        public void setReplyCommentUserAvatarUrl(String replyCommentUserAvatarUrl) {
            this.replyCommentUserAvatarUrl = replyCommentUserAvatarUrl;
        }

        public String getReplyCommentUsername() {
            return replyCommentUsername;
        }

        public void setReplyCommentUsername(String replyCommentUsername) {
            this.replyCommentUsername = replyCommentUsername;
        }

        public String getReplyCommentContent() {
            return replyCommentContent;
        }

        public void setReplyCommentContent(String replyCommentContent) {
            this.replyCommentContent = replyCommentContent;
        }

        public boolean isReplyCommentStatus() {
            return replyCommentStatus;
        }

        public void setReplyCommentStatus(boolean replyCommentStatus) {
            this.replyCommentStatus = replyCommentStatus;
        }

        public String getReplyCommentCreateAt() {
            return replyCommentCreateAt;
        }

        public void setReplyCommentCreateAt(String replyCommentCreateAt) {
            this.replyCommentCreateAt = replyCommentCreateAt;
        }

        public String getCreateAt() {
            return createAt;
        }

        public void setCreateAt(String createAt) {
            this.createAt = createAt;
        }

        public boolean isReply() {
            return reply;
        }

        public void setReply(boolean reply) {
            this.reply = reply;
        }
    }
}
