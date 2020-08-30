package com.and.news.bean.entity;


/**
 * Created by ydx on 17-3-10.
 */

public class BaseVersion {
    String version;

    public BaseVersion(String version) {
        this.version = version;
    }

    public BaseVersion() {
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
