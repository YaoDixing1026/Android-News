package com.and.news.bean.response.news;

import java.util.List;

/**
 * Created by ydx on 17-5-16.
 */

public class RespSearchNewsBean {

    /**
     * content : [{"anonymous":true,"authorName":"string","channelId":"string","channelName":"string","channelNews":true,"check":true,"commentStatus":true,"content":"string","contentPics":["string"],"createAt":"2017-05-16T07:42:24.237Z","editorId":"string","editorName":"string","id":"string","like":0,"local":true,"pubId":"string","pubName":"string","pubNews":true,"read":0,"recommend":true,"recommendChannelId":"string","recommendTop":true,"recommendTopWeight":0,"status":"string","tag":["string"],"thumb":["string"],"title":"string","top":true,"topWeight":0,"type":"string","updateAt":"2017-05-16T07:42:24.237Z","weight":0}]
     * first : true
     * last : true
     * number : 0
     * numberOfElements : 0
     * size : 0
     * sort : {}
     * totalElements : 0
     * totalPages : 0
     */

    private boolean first;
    private boolean last;
    private int number;
    private int numberOfElements;
    private int size;
    private SortBean sort;
    private int totalElements;
    private int totalPages;
    private List<ContentBean> content;

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public SortBean getSort() {
        return sort;
    }

    public void setSort(SortBean sort) {
        this.sort = sort;
    }

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

    public List<ContentBean> getContent() {
        return content;
    }

    public void setContent(List<ContentBean> content) {
        this.content = content;
    }

    public static class SortBean {
    }

    public static class ContentBean {
        /**
         * anonymous : true
         * authorName : string
         * channelId : string
         * channelName : string
         * channelNews : true
         * check : true
         * commentStatus : true
         * content : string
         * contentPics : ["string"]
         * createAt : 2017-05-16T07:42:24.237Z
         * editorId : string
         * editorName : string
         * id : string
         * like : 0
         * local : true
         * pubId : string
         * pubName : string
         * pubNews : true
         * read : 0
         * recommend : true
         * recommendChannelId : string
         * recommendTop : true
         * recommendTopWeight : 0
         * status : string
         * tag : ["string"]
         * thumb : ["string"]
         * title : string
         * top : true
         * topWeight : 0
         * type : string
         * updateAt : 2017-05-16T07:42:24.237Z
         * weight : 0
         */

        private boolean anonymous;
        private String authorName;
        private String channelId;
        private String channelName;
        private boolean channelNews;
        private boolean check;
        private boolean commentStatus;
        private String content;
        private String createAt;
        private String editorId;
        private String editorName;
        private String id;
        private int like;
        private boolean local;
        private String pubId;
        private String pubName;
        private boolean pubNews;
        private int read;
        private boolean recommend;
        private String recommendChannelId;
        private boolean recommendTop;
        private int recommendTopWeight;
        private String status;
        private String title;
        private boolean top;
        private int topWeight;
        private String type;
        private String updateAt;
        private int weight;
        private List<String> contentPics;
        private List<String> tag;
        private List<String> thumb;

        public boolean isAnonymous() {
            return anonymous;
        }

        public void setAnonymous(boolean anonymous) {
            this.anonymous = anonymous;
        }

        public String getAuthorName() {
            return authorName;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public String getChannelId() {
            return channelId;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public String getChannelName() {
            return channelName;
        }

        public void setChannelName(String channelName) {
            this.channelName = channelName;
        }

        public boolean isChannelNews() {
            return channelNews;
        }

        public void setChannelNews(boolean channelNews) {
            this.channelNews = channelNews;
        }

        public boolean isCheck() {
            return check;
        }

        public void setCheck(boolean check) {
            this.check = check;
        }

        public boolean isCommentStatus() {
            return commentStatus;
        }

        public void setCommentStatus(boolean commentStatus) {
            this.commentStatus = commentStatus;
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

        public String getEditorId() {
            return editorId;
        }

        public void setEditorId(String editorId) {
            this.editorId = editorId;
        }

        public String getEditorName() {
            return editorName;
        }

        public void setEditorName(String editorName) {
            this.editorName = editorName;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getLike() {
            return like;
        }

        public void setLike(int like) {
            this.like = like;
        }

        public boolean isLocal() {
            return local;
        }

        public void setLocal(boolean local) {
            this.local = local;
        }

        public String getPubId() {
            return pubId;
        }

        public void setPubId(String pubId) {
            this.pubId = pubId;
        }

        public String getPubName() {
            return pubName;
        }

        public void setPubName(String pubName) {
            this.pubName = pubName;
        }

        public boolean isPubNews() {
            return pubNews;
        }

        public void setPubNews(boolean pubNews) {
            this.pubNews = pubNews;
        }

        public int getRead() {
            return read;
        }

        public void setRead(int read) {
            this.read = read;
        }

        public boolean isRecommend() {
            return recommend;
        }

        public void setRecommend(boolean recommend) {
            this.recommend = recommend;
        }

        public String getRecommendChannelId() {
            return recommendChannelId;
        }

        public void setRecommendChannelId(String recommendChannelId) {
            this.recommendChannelId = recommendChannelId;
        }

        public boolean isRecommendTop() {
            return recommendTop;
        }

        public void setRecommendTop(boolean recommendTop) {
            this.recommendTop = recommendTop;
        }

        public int getRecommendTopWeight() {
            return recommendTopWeight;
        }

        public void setRecommendTopWeight(int recommendTopWeight) {
            this.recommendTopWeight = recommendTopWeight;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isTop() {
            return top;
        }

        public void setTop(boolean top) {
            this.top = top;
        }

        public int getTopWeight() {
            return topWeight;
        }

        public void setTopWeight(int topWeight) {
            this.topWeight = topWeight;
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

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public List<String> getContentPics() {
            return contentPics;
        }

        public void setContentPics(List<String> contentPics) {
            this.contentPics = contentPics;
        }

        public List<String> getTag() {
            return tag;
        }

        public void setTag(List<String> tag) {
            this.tag = tag;
        }

        public List<String> getThumb() {
            return thumb;
        }

        public void setThumb(List<String> thumb) {
            this.thumb = thumb;
        }
    }
}
