package com.and.news.bean.response.comment;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ydx on 17-2-10.
 */

public class RespCommentList implements Serializable {

    /**
     * content : [{"id":"589d63cf526dcd2d738209ca","topicId":"58784ad58905b4305f25c86d","topicType":"news","userId":"5881c6b2526dcd2763ddcb34","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","username":"体育馆","content":"哈哈上海市","like":1,"status":true,"replyCommentId":null,"replyCommentUserId":null,"replyCommentUserAvatarUrl":null,"replyCommentUsername":null,"replyCommentContent":null,"replyCommentStatus":null,"replyCommentCreateAt":null,"createAt":"2017-02-10T06:55:11Z"},{"id":"589d3736526dcd2d738209c7","topicId":"58784ad58905b4305f25c86d","topicType":"news","userId":"5881c6b2526dcd2763ddcb34","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","username":"体育馆","content":"string","like":null,"status":true,"replyCommentId":null,"replyCommentUserId":null,"replyCommentUserAvatarUrl":null,"replyCommentUsername":null,"replyCommentContent":null,"replyCommentStatus":null,"replyCommentCreateAt":null,"createAt":"2017-02-10T03:44:54Z"},{"id":"589d3740526dcd2d738209c8","topicId":"58784ad58905b4305f25c86d","topicType":"news","userId":"5881c6b2526dcd2763ddcb34","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","username":"体育馆","content":"hello","like":null,"status":true,"replyCommentId":null,"replyCommentUserId":null,"replyCommentUserAvatarUrl":null,"replyCommentUsername":null,"replyCommentContent":null,"replyCommentStatus":null,"replyCommentCreateAt":null,"createAt":"2017-02-10T03:45:04Z"},{"id":"589d3747526dcd2d738209c9","topicId":"58784ad58905b4305f25c86d","topicType":"news","userId":"5881c6b2526dcd2763ddcb34","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","username":"体育馆","content":"hahahahaha","like":null,"status":true,"replyCommentId":null,"replyCommentUserId":null,"replyCommentUserAvatarUrl":null,"replyCommentUsername":null,"replyCommentContent":null,"replyCommentStatus":null,"replyCommentCreateAt":null,"createAt":"2017-02-10T03:45:11Z"},{"id":"589d64aa526dcd2d738209cb","topicId":"58784ad58905b4305f25c86d","topicType":"news","userId":"5881c6b2526dcd2763ddcb34","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","username":"体育馆","content":"就是时间就是","like":null,"status":true,"replyCommentId":null,"replyCommentUserId":null,"replyCommentUserAvatarUrl":null,"replyCommentUsername":null,"replyCommentContent":null,"replyCommentStatus":null,"replyCommentCreateAt":null,"createAt":"2017-02-10T06:58:50Z"},{"id":"589d6d55526dcd2d738209cd","topicId":"58784ad58905b4305f25c86d","topicType":"news","userId":"5881c6b2526dcd2763ddcb34","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png","username":"体育馆","content":"时间社会","like":null,"status":true,"replyCommentId":null,"replyCommentUserId":null,"replyCommentUserAvatarUrl":null,"replyCommentUsername":null,"replyCommentContent":null,"replyCommentStatus":null,"replyCommentCreateAt":null,"createAt":"2017-02-10T07:35:49Z"}]
     * totalPages : 1
     * totalElements : 6
     * last : true
     * first : true
     * numberOfElements : 6
     * sort : [{"direction":"DESC","property":"like","ignoreCase":false,"nullHandling":"NATIVE","ascending":false}]
     * size : 20
     * number : 0
     */

    private int totalPages;
    private int totalElements;
    private boolean last;
    private boolean first;
    private int numberOfElements;
    private int size;
    private int number;
    private List<ContentBean> content;
    private List<SortBean> sort;

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
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

    public List<SortBean> getSort() {
        return sort;
    }

    public void setSort(List<SortBean> sort) {
        this.sort = sort;
    }

    public static class ContentBean implements Serializable {
        /**
         * id : 589d63cf526dcd2d738209ca
         * topicId : 58784ad58905b4305f25c86d
         * topicType : news
         * userId : 5881c6b2526dcd2763ddcb34
         * userAvatarUrl : http://x-test.oss-cn-shenzhen.aliyuncs.com/header/5881c6b2526dcd2763ddcb34.png
         * username : 体育馆
         * content : 哈哈上海市
         * like : 1
         * status : true
         * replyCommentId : null
         * replyCommentUserId : null
         * replyCommentUserAvatarUrl : null
         * replyCommentUsername : null
         * replyCommentContent : null
         * replyCommentStatus : null
         * replyCommentCreateAt : null
         * createAt : 2017-02-10T06:55:11Z
         */

        private String id;
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
        private Object replyCommentStatus;
        private String replyCommentCreateAt;
        private String createAt;
        private boolean isGood; //用于控制点赞
        private boolean isHot;

        public boolean isHot() {
            return isHot;
        }

        public void setHot(boolean hot) {
            isHot = hot;
        }

        public boolean isGood() {
            return isGood;
        }

        public void setGood(boolean good) {
            isGood = good;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public Object getReplyCommentUserId() {
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

        public Object getReplyCommentStatus() {
            return replyCommentStatus;
        }

        public void setReplyCommentStatus(Object replyCommentStatus) {
            this.replyCommentStatus = replyCommentStatus;
        }

        public Object getReplyCommentCreateAt() {
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
    }

    public static class SortBean {
        /**
         * direction : DESC
         * property : like
         * ignoreCase : false
         * nullHandling : NATIVE
         * ascending : false
         */

        private String direction;
        private String property;
        private boolean ignoreCase;
        private String nullHandling;
        private boolean ascending;

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }

        public boolean isIgnoreCase() {
            return ignoreCase;
        }

        public void setIgnoreCase(boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
        }

        public String getNullHandling() {
            return nullHandling;
        }

        public void setNullHandling(String nullHandling) {
            this.nullHandling = nullHandling;
        }

        public boolean isAscending() {
            return ascending;
        }

        public void setAscending(boolean ascending) {
            this.ascending = ascending;
        }
    }
}
