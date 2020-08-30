package com.and.news.bean.request.report;

/**
 * Created by ydx on 17-7-19.
 */

public class ReqComplain {

    /**
     * content : string
     * tag : string
     * title : string
     * topicId : string
     * topicType : string
     */

    private String content;
    private String tag;
    private String title;
    private String topicId;
    private String topicType;

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
}
