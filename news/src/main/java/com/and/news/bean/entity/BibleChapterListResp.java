package com.and.news.bean.entity;


/**
 * Created by ydx on 17-2-17.
 */


public class BibleChapterListResp {
    String resultJson;

    public BibleChapterListResp(String resultJson) {
        this.resultJson = resultJson;
    }

    public BibleChapterListResp() {
    }

    public String getResultJson() {
        return this.resultJson;
    }

    public void setResultJson(String resultJson) {
        this.resultJson = resultJson;
    }
}
