package com.and.news.bean.response.merchant;

import java.io.Serializable;

/**
 * Created by ydx on 17-9-18.
 */

public class MerchantInfoBean implements Serializable {


    /**
     * id : 59b74fe2526dcd63a559c082
     * name : 我是测试商家
     * image : http://x-test.oss-cn-shenzhen.aliyuncs.com/temp/%E9%B2%9C%E6%9E%9C%E5%85%83%E7%B4%A0.jpg
     * info : 鲜果元素专注做新鲜水果30年，致力为消费者提供品质
     鲜果。
     商家地址：火星

     * phone : +8601053383152
     * address : 火星
     * sold : 10
     * rating : 1.5
     * status : true
     */

    private String id;
    private String name;
    private String image;
    private String info;
    private String phone;
    private String address;
    private int sold;
    private double rating;
    private boolean status;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
