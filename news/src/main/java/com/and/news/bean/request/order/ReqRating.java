package com.and.news.bean.request.order;

/**
 * Created by ydx on 17-9-18.
 */

public class ReqRating {

    /**
     * content : string
     * id : string
     * rating : 0
     */

    private String content;
    private String id;
    private float rating;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
