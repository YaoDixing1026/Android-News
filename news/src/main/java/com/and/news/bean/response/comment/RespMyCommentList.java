package com.and.news.bean.response.comment;

import java.util.List;

/**
 * Created by ydx on 17-2-23.
 */

public class RespMyCommentList {

    /**
     * content : [{"id":"58a510b6526dcd40cd194c7a","title":null,"topicId":"58784ad58905b4305f25c86d","topicType":"news","userId":"5881c6b2526dcd2763ddcb34","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","username":"体育馆","content":"还是上世纪就是计算机","like":0,"status":true,"replyCommentId":null,"replyCommentUserId":"58a40874526dcd3db9abecdf","replyCommentUserAvatarUrl":null,"replyCommentUsername":"网友e5222fc2037772c896fd7e56203521eb","replyCommentContent":"规划局具备","replyCommentStatus":true,"replyCommentCreateAt":"2017-02-15T08:29:44Z","createAt":"2017-02-16T02:38:46Z","reply":true},{"id":"58a3fe49526dcd3db9abecdc","title":null,"topicId":"58784ad58905b4305f25c86d","topicType":"news","userId":"5881c6b2526dcd2763ddcb34","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","username":"体育馆","content":"评论下自己","like":28,"status":true,"replyCommentId":null,"replyCommentUserId":"5881c6b2526dcd2763ddcb34","replyCommentUserAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","replyCommentUsername":"体育馆","replyCommentContent":"g哈哈哈哈","replyCommentStatus":true,"replyCommentCreateAt":"2017-02-15T02:25:02Z","createAt":"2017-02-15T07:07:53Z","reply":true},{"id":"58a3bbfe526dcd3c07139c1c","title":null,"topicId":"58784ad58905b4305f25c86d","topicType":"news","userId":"5881c6b2526dcd2763ddcb34","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","username":"体育馆","content":"g哈哈哈哈","like":63,"status":true,"replyCommentId":null,"replyCommentUserId":null,"replyCommentUserAvatarUrl":null,"replyCommentUsername":null,"replyCommentContent":null,"replyCommentStatus":null,"replyCommentCreateAt":null,"createAt":"2017-02-15T02:25:02Z","reply":false}]
     * totalElements : 3
     * totalPages : 1
     * last : true
     * first : true
     * sort : null
     * numberOfElements : 3
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
         * id : 58a510b6526dcd40cd194c7a
         * title : null
         * topicId : 58784ad58905b4305f25c86d
         * topicType : news
         * userId : 5881c6b2526dcd2763ddcb34
         * userAvatarUrl : http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png
         * username : 体育馆
         * content : 还是上世纪就是计算机
         * like : 0
         * status : true
         * replyCommentId : null
         * replyCommentUserId : 58a40874526dcd3db9abecdf
         * replyCommentUserAvatarUrl : null
         * replyCommentUsername : 网友e5222fc2037772c896fd7e56203521eb
         * replyCommentContent : 规划局具备
         * replyCommentStatus : true
         * replyCommentCreateAt : 2017-02-15T08:29:44Z
         * createAt : 2017-02-16T02:38:46Z
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

        public Object getReplyCommentId() {
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

        public Object getReplyCommentUserAvatarUrl() {
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
