package com.and.news.bean.entity;

import java.util.List;

/**
 * Created by ydx on 17-3-2.
 */

public class ListChannel {
    List<Channel> myChannelList;
    List<Channel> otherChannelList;

    public List<Channel> getMyChannelList() {
        return myChannelList;
    }

    public void setMyChannelList(List<Channel> myChannelList) {
        this.myChannelList = myChannelList;
    }

    public List<Channel> getOtherChannelList() {
        return otherChannelList;
    }

    public void setOtherChannelList(List<Channel> otherChannelList) {
        this.otherChannelList = otherChannelList;
    }
}
