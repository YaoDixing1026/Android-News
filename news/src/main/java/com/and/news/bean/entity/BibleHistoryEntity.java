package com.and.news.bean.entity;


import java.util.Date;

/**
 * Created by ydx on 17-2-24.
 */

public class BibleHistoryEntity  {

    boolean isNew;
    int volumeSN;
    int chapterSN;
    int chapterContentPosition;
    int chapterCount;
    String showTime;
    Date time;
    boolean isTab;
    String volumeName;
    String content;
    boolean isReadFinish;
    public BibleHistoryEntity(boolean isNew, int volumeSN, int chapterSN,
                              int chapterContentPosition, int chapterCount, String showTime,
                              Date time, boolean isTab, String volumeName, String content,
                              boolean isReadFinish) {
        this.isNew = isNew;
        this.volumeSN = volumeSN;
        this.chapterSN = chapterSN;
        this.chapterContentPosition = chapterContentPosition;
        this.chapterCount = chapterCount;
        this.showTime = showTime;
        this.time = time;
        this.isTab = isTab;
        this.volumeName = volumeName;
        this.content = content;
        this.isReadFinish = isReadFinish;
    }
    public BibleHistoryEntity() {
    }
    public boolean getIsNew() {
        return this.isNew;
    }
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
    public int getVolumeSN() {
        return this.volumeSN;
    }
    public void setVolumeSN(int volumeSN) {
        this.volumeSN = volumeSN;
    }
    public int getChapterSN() {
        return this.chapterSN;
    }
    public void setChapterSN(int chapterSN) {
        this.chapterSN = chapterSN;
    }
    public int getChapterContentPosition() {
        return this.chapterContentPosition;
    }
    public void setChapterContentPosition(int chapterContentPosition) {
        this.chapterContentPosition = chapterContentPosition;
    }
    public String getShowTime() {
        return this.showTime;
    }
    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }
    public Date getTime() {
        return this.time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public boolean getIsTab() {
        return this.isTab;
    }
    public void setIsTab(boolean isTab) {
        this.isTab = isTab;
    }
    public String getVolumeName() {
        return this.volumeName;
    }
    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public boolean getIsReadFinish() {
        return this.isReadFinish;
    }
    public void setIsReadFinish(boolean isReadFinish) {
        this.isReadFinish = isReadFinish;
    }
    public int getChapterCount() {
        return this.chapterCount;
    }
    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }
  
   
}
