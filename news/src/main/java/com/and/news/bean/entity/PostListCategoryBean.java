package com.and.news.bean.entity;

import java.io.Serializable;

/**
 * Created by ydx on 17-6-14.
 */

public class PostListCategoryBean implements Serializable {


    String country;
    String city;
    String categoty;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCategoty() {
        return categoty;
    }

    public void setCategoty(String categoty) {
        this.categoty = categoty;
    }
}
