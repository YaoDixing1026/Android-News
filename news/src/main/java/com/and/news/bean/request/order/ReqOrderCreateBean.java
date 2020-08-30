package com.and.news.bean.request.order;

/**
 * Created by ydx on 17-9-14.
 */

public class ReqOrderCreateBean {

    /**
     * amount : 0
     * buyerMobile : string
     * buyerName : string
     * productId : string
     */

    private int amount;
    private String buyerMobile;
    private String buyerName;
    private String productId;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBuyerMobile() {
        return buyerMobile;
    }

    public void setBuyerMobile(String buyerMobile) {
        this.buyerMobile = buyerMobile;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
