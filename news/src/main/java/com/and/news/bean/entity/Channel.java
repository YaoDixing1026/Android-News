package com.and.news.bean.entity;

import java.io.Serializable;

/**
 * Created by ydx on 17-2-8.
 */

public class Channel implements Serializable {


    /**
     * id : 59f97cb5526dcd1e7f5fc874
     * name : 推荐视频
     * defaultChannel : true
     * topChannel : false
     * position : 2
     * status : true
     * overseas : false
     * overseasDefault : true
     * overseasPosition : 2
     * baiduFeed : true
     * feedUrl : https://cpu.baidu.com/1057/a9bad984
     */

    private String id;
    private String name;
    private boolean defaultChannel;
    private boolean topChannel;
    private int position;
    private boolean status;
    private boolean overseas;
    private boolean overseasDefault;
    private int overseasPosition;
    private boolean baiduFeed;
    private String feedUrl;
    private boolean isSelected; //控制是否选中 ui

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDefaultChannel() {
        return defaultChannel;
    }

    public void setDefaultChannel(boolean defaultChannel) {
        this.defaultChannel = defaultChannel;
    }

    public boolean isTopChannel() {
        return topChannel;
    }

    public void setTopChannel(boolean topChannel) {
        this.topChannel = topChannel;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isOverseas() {
        return overseas;
    }

    public void setOverseas(boolean overseas) {
        this.overseas = overseas;
    }

    public boolean isOverseasDefault() {
        return overseasDefault;
    }

    public void setOverseasDefault(boolean overseasDefault) {
        this.overseasDefault = overseasDefault;
    }

    public int getOverseasPosition() {
        return overseasPosition;
    }

    public void setOverseasPosition(int overseasPosition) {
        this.overseasPosition = overseasPosition;
    }

    public boolean isBaiduFeed() {
        return baiduFeed;
    }

    public void setBaiduFeed(boolean baiduFeed) {
        this.baiduFeed = baiduFeed;
    }

    public String getFeedUrl() {
        return feedUrl;
    }

    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
    }
}
