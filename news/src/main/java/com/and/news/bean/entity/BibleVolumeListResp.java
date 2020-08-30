package com.and.news.bean.entity;


/**
 * Created by ydx on 17-2-17.
 */


public class BibleVolumeListResp {
    String resultJson;

    public BibleVolumeListResp(String resultJson) {
        this.resultJson = resultJson;
    }

    public BibleVolumeListResp() {
    }

    public String getResultJson() {
        return this.resultJson;
    }

    public void setResultJson(String resultJson) {
        this.resultJson = resultJson;
    }
}
