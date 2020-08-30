package com.and.news.bean.response.channel;


import com.and.news.bean.entity.Channel;

import java.util.List;

/**
 * Created by ydx on 17-2-3.
 */

public class RespChannelList {


    private List<Channel> myList;
    private List<Channel> other;

    public List<Channel> getMyList() {
        return myList;
    }

    public void setMyList(List<Channel> myList) {
        this.myList = myList;
    }

    public List<Channel> getOther() {
        return other;
    }

    public void setOther(List<Channel> other) {
        this.other = other;
    }


}
