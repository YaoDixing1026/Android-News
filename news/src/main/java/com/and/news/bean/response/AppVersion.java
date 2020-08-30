package com.and.news.bean.response;

import java.io.Serializable;

/**
 * Created by ydx on 17-1-5.
 */

public class AppVersion implements Serializable {

    /**
     * isLastVersion : false
     * forceUpdate : true
     * apiUrl : null
     * updateUrl : localhost
     * lastVersion : 2.0.0
     * lastVersionTitle : 2.0.0更新
     * lastVersionContent : 2.0.0更新
     */

    private boolean isLastVersion;
    private boolean forceUpdate;
    private String apiUrl;
    private String updateUrl;
    private String lastVersion;
    private String lastVersionTitle;
    private String lastVersionContent;

    public boolean isIsLastVersion() {
        return isLastVersion;
    }

    public void setIsLastVersion(boolean isLastVersion) {
        this.isLastVersion = isLastVersion;
    }

    public boolean isForceUpdate() {
        return forceUpdate;
    }

    public void setForceUpdate(boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getUpdateUrl() {
        return updateUrl;
    }

    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
    }

    public String getLastVersion() {
        return lastVersion;
    }

    public void setLastVersion(String lastVersion) {
        this.lastVersion = lastVersion;
    }

    public String getLastVersionTitle() {
        return lastVersionTitle;
    }

    public void setLastVersionTitle(String lastVersionTitle) {
        this.lastVersionTitle = lastVersionTitle;
    }

    public String getLastVersionContent() {
        return lastVersionContent;
    }

    public void setLastVersionContent(String lastVersionContent) {
        this.lastVersionContent = lastVersionContent;
    }
}
