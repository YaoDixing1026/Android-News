package com.and.news.bean.request.user;

/**
 * Created by ydx on 17-1-12.
 */

public class ChangePwdReq {


    /**
     * newPass : string
     * oldPass : string
     */

    private String newPass;
    private String oldPass;

    public String getNewPass() {
        return newPass;
    }

    public void setNewPass(String newPass) {
        this.newPass = newPass;
    }

    public String getOldPass() {
        return oldPass;
    }

    public void setOldPass(String oldPass) {
        this.oldPass = oldPass;
    }

    @Override
    public String toString() {
        return "ChangePwdReq{" +
                "newPass='" + newPass + '\'' +
                ", oldPass='" + oldPass + '\'' +
                '}';
    }
}
