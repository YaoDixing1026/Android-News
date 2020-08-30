package com.and.news.bean.entity;


/**
 * Created by ydx on 17-1-19.
 */


public class ImageCacheBean {


    String eTag;

    String url;

    public ImageCacheBean(String eTag, String url) {
        this.eTag = eTag;
        this.url = url;
    }

    public ImageCacheBean() {
    }

    public String getETag() {
        return this.eTag;
    }

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

  
}
