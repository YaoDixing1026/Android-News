package com.and.news.bean.request.life;

import java.util.List;

/**
 * Created by ydx on 17-5-25.
 */

public class ReqLifeCreate {


    /**
     * category : string
     * cityName : string
     * countryName : string
     * detail : string
     * hasPrice : true
     * monetaryUnit : string
     * photos : ["string"]
     * price : 0
     * tag : ["string"]
     * title : string
     */

    private String category;
    private String cityName;
    private String countryName;
    private String detail;
    private boolean hasPrice;
    private String monetaryUnit;
    private double price;
    private String title;
    private List<String> photos;
    private List<String> tag;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public boolean isHasPrice() {
        return hasPrice;
    }

    public void setHasPrice(boolean hasPrice) {
        this.hasPrice = hasPrice;
    }

    public String getMonetaryUnit() {
        return monetaryUnit;
    }

    public void setMonetaryUnit(String monetaryUnit) {
        this.monetaryUnit = monetaryUnit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }
}
