package com.and.news.bean.entity;

/**
 * Created by ydx on 17-3-17.
 */

public class LinkBean{
    int start;
    int end;
    String linkUrl;

    public LinkBean() {
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
}

