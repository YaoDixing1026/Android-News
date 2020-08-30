package com.and.news.bean.request.favorite;

/**
 * Created by ydx on 17-2-9.
 */

public class ReqFavorite {

    /**
     * referenceId : string
     * referenceType : string
     */

    private String referenceId;
    private String referenceType;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }
}
