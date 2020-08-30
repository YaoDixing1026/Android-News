package com.and.news.bean.entity;

import android.graphics.Bitmap;

/**
 * Created by ydx on 17-5-27.
 */

public class UploadImgBean {
    String name;
    String imgUrl;
    String imgLocalPath;
    Bitmap bitmap;
    byte[] bytes;
    boolean uploadSuccess;
    int index;
    boolean ossServerHasProblem;
    boolean uploadFailNeedReTry;
    boolean isOriginalData;

    public boolean isOriginalData() {
        return isOriginalData;
    }

    public void setOriginalData(boolean originalData) {
        isOriginalData = originalData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOssServerHasProblem() {
        return ossServerHasProblem;
    }

    public void setOssServerHasProblem(boolean ossServerHasProblem) {
        this.ossServerHasProblem = ossServerHasProblem;
    }

    public boolean isUploadFailNeedReTry() {
        return uploadFailNeedReTry;
    }

    public void setUploadFailNeedReTry(boolean uploadFailNeedReTry) {
        this.uploadFailNeedReTry = uploadFailNeedReTry;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgLocalPath() {
        return imgLocalPath;
    }

    public void setImgLocalPath(String imgLocalPath) {
        this.imgLocalPath = imgLocalPath;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public boolean isUploadSuccess() {
        return uploadSuccess;
    }

    public void setUploadSuccess(boolean uploadSuccess) {
        this.uploadSuccess = uploadSuccess;
    }
}
