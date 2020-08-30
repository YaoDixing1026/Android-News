package com.and.news.bean.entity.order;

import java.io.Serializable;

/**
 * Created by ydx on 17-9-21.
 */

public class OrderPayBean implements Serializable {
    String orderId;
    int prices;
    int amount;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
