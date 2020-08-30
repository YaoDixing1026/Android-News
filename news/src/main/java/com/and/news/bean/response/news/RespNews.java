package com.and.news.bean.response.news;

import java.util.List;

/**
 * Created by ydx on 17-2-3.
 */

public class RespNews {


    /**
     * anonymous : true
     * authorId : string
     * authorName : string
     * channelId : string
     * channelName : string
     * content : string
     * contentPics : ["string"]
     * createAt : 2017-02-03T07:03:54.693Z
     * editorId : string
     * editorName : string
     * id : string
     * read : 0
     * recommend : true
     * recommendTop : true
     * recommendTopWeight : 0
     * status : string
     * tag : ["string"]
     * thumb : ["string"]
     * title : string
     * top : true
     * topWeight : 0
     * type : string
     * updateAt : 2017-02-03T07:03:54.693Z
     * weight : 0
     */

    private boolean anonymous;
    private String authorId;
    private String authorName;
    private String channelId;
    private String channelName;
    private String content;
    private String createAt;
    private String editorId;
    private String editorName;
    private String id;
    private int read;
    private boolean recommend;
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

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
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
