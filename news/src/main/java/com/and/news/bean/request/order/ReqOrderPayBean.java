package com.and.news.bean.request.order;

/**
 * Created by ydx on 17-9-14.
 */

public class ReqOrderPayBean {


    /**
     * id : string
     * payChannel : string
     */

    private String id;
    private String payChannel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }
}
