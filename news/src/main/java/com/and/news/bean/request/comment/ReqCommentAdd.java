package com.and.news.bean.request.comment;

/**
 * Created by ydx on 17-2-10.
 */

public class ReqCommentAdd {

    /**
     * comment : string
     * topicId : string
     * topicType : string
     */

    private String content;
    private String topicId;
    private String topicType;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
