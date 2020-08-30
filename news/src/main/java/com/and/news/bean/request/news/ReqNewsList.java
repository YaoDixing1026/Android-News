package com.and.news.bean.request.news;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ydx on 17-2-4.
 */

public class ReqNewsList {
    Map map;
    private String channelId;
    private int page;
    private int size;

    public ReqNewsList() {
        map = new HashMap();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
        map.put("channelId",channelId);
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
        map.put("page",page);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        map.put("size",size);
    }

    public Map getMap(){
        return map;
    }
}
