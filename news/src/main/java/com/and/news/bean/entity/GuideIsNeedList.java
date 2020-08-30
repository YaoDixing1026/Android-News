package com.and.news.bean.entity;

/**
 * Created by ydx on 17-3-2.
 */

public class GuideIsNeedList {
    boolean needChannelGuide;
    boolean needDetailGuide;
    boolean needFollowGuide;
    boolean needHomeGuide;
    boolean needPersonalGuide;
    boolean needReadGuide;


    public boolean isNeedChannelGuide() {
        return needChannelGuide;
    }

    public void setNeedChannelGuide(boolean needChannelGuide) {
        this.needChannelGuide = needChannelGuide;
    }

    public boolean isNeedDetailGuide() {
        return needDetailGuide;
    }

    public void setNeedDetailGuide(boolean needDetailGuide) {
        this.needDetailGuide = needDetailGuide;
    }

    public boolean isNeedFollowGuide() {
        return needFollowGuide;
    }

    public void setNeedFollowGuide(boolean needFollowGuide) {
        this.needFollowGuide = needFollowGuide;
    }

    public boolean isNeedHomeGuide() {
        return needHomeGuide;
    }

    public void setNeedHomeGuide(boolean needHomeGuide) {
        this.needHomeGuide = needHomeGuide;
    }

    public boolean isNeedPersonalGuide() {
        return needPersonalGuide;
    }

    public void setNeedPersonalGuide(boolean needPersonalGuide) {
        this.needPersonalGuide = needPersonalGuide;
    }

    public boolean isNeedReadGuide() {
        return needReadGuide;
    }

    public void setNeedReadGuide(boolean needReadGuide) {
        this.needReadGuide = needReadGuide;
    }

    public void setAll(boolean flag){
        needChannelGuide = flag;
        needDetailGuide = flag;
        needFollowGuide = flag;
        needHomeGuide = flag;
        needPersonalGuide = flag;
        needReadGuide = flag;
    }
}
