package com.and.news.bean.entity;

import java.util.List;

/**
 * Created by ydx on 17-3-6.
 */

public class NewsDetailContent {
    String contentSb;
    boolean isPTag;
    boolean isVideo;
    boolean isImg;
    boolean isText;
    boolean isCenter;
    String text;
    String imgUrl;
    boolean hasLinkUrl;
    List<LinkBean> linkBeanList;


    public boolean isCenter() {
        return isCenter;
    }

    public void setCenter(boolean center) {
        isCenter = center;
    }

    public List<LinkBean> getLinkBeanList() {
        return linkBeanList;
    }

    public void setLinkBeanList(List<LinkBean> linkBeanList) {
        this.linkBeanList = linkBeanList;
    }

    public boolean isHasLinkUrl() {
        return hasLinkUrl;
    }

    public void setHasLinkUrl(boolean hasLinkUrl) {
        this.hasLinkUrl = hasLinkUrl;
    }

    public boolean isText() {
        return isText;
    }

    public void setText(boolean text) {
        isText = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public void setVideo(boolean video) {
        isVideo = video;
    }

    public boolean isImg() {
        return isImg;
    }

    public void setImg(boolean img) {
        isImg = img;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public boolean isPTag() {
        return isPTag;
    }

    public void setPTag(boolean PTag) {
        isPTag = PTag;
    }

    public String getContent() {
        return contentSb;
    }

    public void setContent(String contentSb) {
        this.contentSb = contentSb;
    }
}
