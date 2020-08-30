package com.and.news.bean.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ydx on 18-1-30.
 */

public class Restaurant implements Serializable {


    /**
     * address : string
     * location : {"lat":0,"lon":0}
     * mobile : string
     * openTime : string
     * photo : ["string"]
     * style : string
     */

    private String address;
    private LocationBean location;
    private String mobile;
    private String openTime;
    private String style;
    private List<String> photo;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocationBean getLocation() {
        return location;
    }

    public void setLocation(LocationBean location) {
        this.location = location;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public List<String> getPhoto() {
        return photo;
    }

    public void setPhoto(List<String> photo) {
        this.photo = photo;
    }

    public static class LocationBean {
        /**
         * lat : 0
         * lon : 0
         */

        private int lat;
        private int lon;

        public int getLat() {
            return lat;
        }

        public void setLat(int lat) {
            this.lat = lat;
        }

        public int getLon() {
            return lon;
        }

        public void setLon(int lon) {
            this.lon = lon;
        }
    }
}
