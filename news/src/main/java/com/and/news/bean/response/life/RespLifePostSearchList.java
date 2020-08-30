package com.and.news.bean.response.life;

import java.util.List;

/**
 * Created by ydx on 17-6-5.
 */

public class RespLifePostSearchList {


    /**
     * content : [{"id":"592787fc526dcd01aa5cb08b","title":"溜肉段","userId":"58d8c64d526dcd60816bd4ac","userName":"永远的灵魂哥","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58d8c64d526dcd60816bd4ac.png","photos":["http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495762929825.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495762929891.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495762929975.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495762929757.png"],"hasPrice":true,"price":521,"monetaryUnit":"￥","countryName":"中国","cityName":"北京","category":"美食","read":9,"createAt":"2017-05-26T01:42:20Z","detail":"香","commentCount":0,"like":0,"status":"online"},{"id":"59278874526dcd01aa5cb08c","title":"溜肉段","userId":"58d8c64d526dcd60816bd4ac","userName":"永远的灵魂哥","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58d8c64d526dcd60816bd4ac.png","photos":["http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495763054342.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495763054406.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495763054547.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495763054480.png"],"hasPrice":true,"price":521,"monetaryUnit":"￥","countryName":"中国","cityName":"北京","category":"美食","read":14,"createAt":"2017-05-26T01:44:20Z","detail":"香","commentCount":0,"like":0,"status":"online"}]
     * totalPages : 1
     * totalElements : 2
     * last : true
     * numberOfElements : 2
     * first : true
     * size : 0
     * number : 0
     */

    private int totalPages;
    private int totalElements;
    private boolean last;
    private int numberOfElements;
    private boolean first;
    private int size;
    private int number;
    private List<ContentBean> content;

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<ContentBean> getContent() {
        return content;
    }

    public void setContent(List<ContentBean> content) {
        this.content = content;
    }

    public static class ContentBean {
        /**
         * id : 592787fc526dcd01aa5cb08b
         * title : 溜肉段
         * userId : 58d8c64d526dcd60816bd4ac
         * userName : 永远的灵魂哥
         * userAvatarUrl : http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58d8c64d526dcd60816bd4ac.png
         * photos : ["http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495762929825.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495762929891.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495762929975.png","http://x-test.oss-cn-shenzhen.aliyuncs.com/post/1495762929757.png"]
         * hasPrice : true
         * price : 521
         * monetaryUnit : ￥
         * countryName : 中国
         * cityName : 北京
         * category : 美食
         * read : 9
         * createAt : 2017-05-26T01:42:20Z
         * detail : 香
         * commentCount : 0
         * like : 0
         * status : online
         */

        private String id;
        private String title;
        private String userId;
        private String userName;
        private String userAvatarUrl;
        private boolean hasPrice;
        private int price;
        private String monetaryUnit;
        private String countryName;
        private String cityName;
        private String category;
        private int read;
        private String createAt;
        private String detail;
        private int commentCount;
        private int like;
        private String status;
        private List<String> photos;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserAvatarUrl() {
            return userAvatarUrl;
        }

        public void setUserAvatarUrl(String userAvatarUrl) {
            this.userAvatarUrl = userAvatarUrl;
        }

        public boolean isHasPrice() {
            return hasPrice;
        }

        public void setHasPrice(boolean hasPrice) {
            this.hasPrice = hasPrice;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getMonetaryUnit() {
            return monetaryUnit;
        }

        public void setMonetaryUnit(String monetaryUnit) {
            this.monetaryUnit = monetaryUnit;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getRead() {
            return read;
        }

        public void setRead(int read) {
            this.read = read;
        }

        public String getCreateAt() {
            return createAt;
        }

        public void setCreateAt(String createAt) {
            this.createAt = createAt;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public int getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(int commentCount) {
            this.commentCount = commentCount;
        }

        public int getLike() {
            return like;
        }

        public void setLike(int like) {
            this.like = like;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<String> getPhotos() {
            return photos;
        }

        public void setPhotos(List<String> photos) {
            this.photos = photos;
        }
    }
}
