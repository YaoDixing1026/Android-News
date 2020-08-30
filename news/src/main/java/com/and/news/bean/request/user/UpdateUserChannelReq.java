package com.and.news.bean.request.user;


import com.and.news.bean.entity.Channel;

import java.util.List;

/**
 * Created by ydx on 17-1-12.
 */

public class UpdateUserChannelReq {

    private List<Channel> channelList;

    public List<Channel> getChannelList() {
        return channelList;
    }

    public void setChannelList(List<Channel> channelList) {
        this.channelList = channelList;
    }


}
