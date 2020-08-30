package com.and.news.bean.entity;

import java.util.Date;


public class News {


    private String id;
    //标题 title

    private String title;
    //    发布人 author

    private String author;

    //    修改人 editor
    private String editor;
    //    缩略图 thumb
    private String thumb;
    //    新闻类型 type
//    private Enum<NewsType> type;

    private String type;
    //    频道 channel
    private String channel;
    private String channelId;

    //            名称
//    阅读数 read
    private Long read;
    //    发布时间 createAt
    private Date createAt;
    //    修改时间 updateAt
    private Date updateAt;
    //    新闻正文 content
    private String content;
    //    标签 tag
    private String tag;
    //    置顶 top
    private Boolean top;
    //    是否推荐到推荐频道 recommend
    private Boolean recommend;
    //    相关新闻 related
    private String related;
    //    权重 weight
    private Integer weight;
    //    新闻状态 status
//    private Enum<NewsStatus> status;
    private String status;

    public News() {
    }

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Long getRead() {
        return read;
    }

    public void setRead(Long read) {
        this.read = read;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Boolean getTop() {
        return top;
    }

    public void setTop(Boolean top) {
        this.top = top;
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }
}
