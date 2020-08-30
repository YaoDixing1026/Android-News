package com.and.news.bean.response.life;


import com.and.news.bean.entity.Merchant;

import java.util.List;

/**
 * Created by ydx on 17-5-31.
 */

public class RespPostDetail {


    /**
     * comments : {"content":[{"content":"string","createAt":"2018-01-23T04:42:21.899Z","id":"string","like":0,"reply":true,"replyCommentContent":"string","replyCommentCreateAt":"2018-01-23T04:42:21.899Z","replyCommentId":"string","replyCommentStatus":true,"replyCommentUserAvatarUrl":"string","replyCommentUserId":"string","replyCommentUsername":"string","status":true,"title":"string","topicId":"string","topicType":"string","userAvatarUrl":"string","userId":"string","username":"string"}],"first":true,"last":true,"number":0,"numberOfElements":0,"size":0,"sort":{},"totalElements":0,"totalPages":0}
     * merchant : {"address":"string","id":"string","image":"string","info":"string","name":"string","phone":"string","rating":0,"sold":0,"status":"string"}
     * myFavourite : true
     * post : {"category":"string","cityName":"string","commentCount":0,"commentStatus":true,"countryName":"string","createAt":"2018-01-23T04:42:21.899Z","detail":"string","hasPrice":true,"house":{"address":"string","buildDate":"2018-01-23T04:42:21.899Z","category":"string","cityName":"string","countryName":"string","daily":true,"detail":"string","hasPrice":true,"houseArea":0,"houseType":"string","location":{"lat":0,"lon":0},"mobile":"string","monetaryUnit":"string","monthly":true,"parking":true,"photos":["string"],"price":0,"saleType":"string","tag":["string"],"title":"string","type":0,"weekly":true},"id":"string","like":0,"modelType":"string","monetaryUnit":"string","photos":["string"],"positionedCity":true,"price":0,"read":0,"recommend":true,"recommendChannelId":"string","secondHand":{"category":"string","cityName":"string","countryName":"string","detail":"string","hasPrice":true,"monetaryUnit":"string","photos":["string"],"price":0,"secondHandCategory":"string","tag":["string"],"title":"string"},"status":"string","tag":["string"],"title":"string","updateAt":"2018-01-23T04:42:21.899Z","useModel":true,"usedCar":{"address":"string","brand":"string","category":"string","cityName":"string","color":"string","countryName":"string","detail":"string","hasPrice":true,"insurance":"string","mileage":0,"mobile":"string","monetaryUnit":"string","photos":["string"],"price":0,"registrationDate":"2018-01-23T04:42:21.899Z","series":"string","tag":["string"],"title":"string","tradeTimes":0},"userAvatarUrl":"string","userId":"string","userName":"string"}
     * related : {"content":[{"category":"string","cityName":"string","commentCount":0,"commentStatus":true,"countryName":"string","createAt":"2018-01-23T04:42:21.899Z","detail":"string","hasPrice":true,"house":{"address":"string","buildDate":"2018-01-23T04:42:21.899Z","category":"string","cityName":"string","countryName":"string","daily":true,"detail":"string","hasPrice":true,"houseArea":0,"houseType":"string","location":{"lat":0,"lon":0},"mobile":"string","monetaryUnit":"string","monthly":true,"parking":true,"photos":["string"],"price":0,"saleType":"string","tag":["string"],"title":"string","type":0,"weekly":true},"id":"string","like":0,"modelType":"string","monetaryUnit":"string","photos":["string"],"positionedCity":true,"price":0,"read":0,"recommend":true,"recommendChannelId":"string","secondHand":{"category":"string","cityName":"string","countryName":"string","detail":"string","hasPrice":true,"monetaryUnit":"string","photos":["string"],"price":0,"secondHandCategory":"string","tag":["string"],"title":"string"},"status":"string","tag":["string"],"title":"string","updateAt":"2018-01-23T04:42:21.899Z","useModel":true,"usedCar":{"address":"string","brand":"string","category":"string","cityName":"string","color":"string","countryName":"string","detail":"string","hasPrice":true,"insurance":"string","mileage":0,"mobile":"string","monetaryUnit":"string","photos":["string"],"price":0,"registrationDate":"2018-01-23T04:42:21.899Z","series":"string","tag":["string"],"title":"string","tradeTimes":0},"userAvatarUrl":"string","userId":"string","userName":"string"}],"first":true,"last":true,"number":0,"numberOfElements":0,"size":0,"sort":{},"totalElements":0,"totalPages":0}
     */

    private CommentsBean comments;
    private Merchant merchant;
    private boolean myFavourite;
    private PostBean post;
    private RelatedBean related;

    public CommentsBean getComments() {
        return comments;
    }

    public void setComments(CommentsBean comments) {
        this.comments = comments;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public boolean isMyFavourite() {
        return myFavourite;
    }

    public void setMyFavourite(boolean myFavourite) {
        this.myFavourite = myFavourite;
    }

    public PostBean getPost() {
        return post;
    }

    public void setPost(PostBean post) {
        this.post = post;
    }

    public RelatedBean getRelated() {
        return related;
    }

    public void setRelated(RelatedBean related) {
        this.related = related;
    }

    public static class CommentsBean {
        /**
         * content : [{"content":"string","createAt":"2018-01-23T04:42:21.899Z","id":"string","like":0,"reply":true,"replyCommentContent":"string","replyCommentCreateAt":"2018-01-23T04:42:21.899Z","replyCommentId":"string","replyCommentStatus":true,"replyCommentUserAvatarUrl":"string","replyCommentUserId":"string","replyCommentUsername":"string","status":true,"title":"string","topicId":"string","topicType":"string","userAvatarUrl":"string","userId":"string","username":"string"}]
         * first : true
         * last : true
         * number : 0
         * numberOfElements : 0
         * size : 0
         * sort : {}
         * totalElements : 0
         * totalPages : 0
         */

        private boolean first;
        private boolean last;
        private int number;
        private int numberOfElements;
        private int size;
        private int totalElements;
        private int totalPages;
        private List<ContentBean> content;

        public boolean isFirst() {
            return first;
        }

        public void setFirst(boolean first) {
            this.first = first;
        }

        public boolean isLast() {
            return last;
        }

        public void setLast(boolean last) {
            this.last = last;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getNumberOfElements() {
            return numberOfElements;
        }

        public void setNumberOfElements(int numberOfElements) {
            this.numberOfElements = numberOfElements;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotalElements() {
            return totalElements;
        }

        public void setTotalElements(int totalElements) {
            this.totalElements = totalElements;
        }

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }

        public List<ContentBean> getContent() {
            return content;
        }

        public void setContent(List<ContentBean> content) {
            this.content = content;
        }



        public static class ContentBean {
            /**
             * content : string
             * createAt : 2018-01-23T04:42:21.899Z
             * id : string
             * like : 0
             * reply : true
             * replyCommentContent : string
             * replyCommentCreateAt : 2018-01-23T04:42:21.899Z
             * replyCommentId : string
             * replyCommentStatus : true
             * replyCommentUserAvatarUrl : string
             * replyCommentUserId : string
             * replyCommentUsername : string
             * status : true
             * title : string
             * topicId : string
             * topicType : string
             * userAvatarUrl : string
             * userId : string
             * username : string
             */

            private String content;
            private String createAt;
            private String id;
            private int like;
            private boolean reply;
            private String replyCommentContent;
            private String replyCommentCreateAt;
            private String replyCommentId;
            private boolean replyCommentStatus;
            private String replyCommentUserAvatarUrl;
            private String replyCommentUserId;
            private String replyCommentUsername;
            private boolean status;
            private String title;
            private String topicId;
            private String topicType;
            private String userAvatarUrl;
            private String userId;
            private String username;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getCreateAt() {
                return createAt;
            }

            public void setCreateAt(String createAt) {
                this.createAt = createAt;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getLike() {
                return like;
            }

            public void setLike(int like) {
                this.like = like;
            }

            public boolean isReply() {
                return reply;
            }

            public void setReply(boolean reply) {
                this.reply = reply;
            }

            public String getReplyCommentContent() {
                return replyCommentContent;
            }

            public void setReplyCommentContent(String replyCommentContent) {
                this.replyCommentContent = replyCommentContent;
            }

            public String getReplyCommentCreateAt() {
                return replyCommentCreateAt;
            }

            public void setReplyCommentCreateAt(String replyCommentCreateAt) {
                this.replyCommentCreateAt = replyCommentCreateAt;
            }

            public String getReplyCommentId() {
                return replyCommentId;
            }

            public void setReplyCommentId(String replyCommentId) {
                this.replyCommentId = replyCommentId;
            }

            public boolean isReplyCommentStatus() {
                return replyCommentStatus;
            }

            public void setReplyCommentStatus(boolean replyCommentStatus) {
                this.replyCommentStatus = replyCommentStatus;
            }

            public String getReplyCommentUserAvatarUrl() {
                return replyCommentUserAvatarUrl;
            }

            public void setReplyCommentUserAvatarUrl(String replyCommentUserAvatarUrl) {
                this.replyCommentUserAvatarUrl = replyCommentUserAvatarUrl;
            }

            public String getReplyCommentUserId() {
                return replyCommentUserId;
            }

            public void setReplyCommentUserId(String replyCommentUserId) {
                this.replyCommentUserId = replyCommentUserId;
            }

            public String getReplyCommentUsername() {
                return replyCommentUsername;
            }

            public void setReplyCommentUsername(String replyCommentUsername) {
                this.replyCommentUsername = replyCommentUsername;
            }

            public boolean isStatus() {
                return status;
            }

            public void setStatus(boolean status) {
                this.status = status;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTopicId() {
                return topicId;
            }

            public void setTopicId(String topicId) {
                this.topicId = topicId;
            }

            public String getTopicType() {
                return topicType;
            }

            public void setTopicType(String topicType) {
                this.topicType = topicType;
            }

            public String getUserAvatarUrl() {
                return userAvatarUrl;
            }

            public void setUserAvatarUrl(String userAvatarUrl) {
                this.userAvatarUrl = userAvatarUrl;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }
        }
    }

    public static class PostBean {
        /**
         * category : string
         * cityName : string
         * commentCount : 0
         * commentStatus : true
         * countryName : string
         * createAt : 2018-01-23T04:42:21.899Z
         * detail : string
         * hasPrice : true
         * house : {"address":"string","buildDate":"2018-01-23T04:42:21.899Z","category":"string","cityName":"string","countryName":"string","daily":true,"detail":"string","hasPrice":true,"houseArea":0,"houseType":"string","location":{"lat":0,"lon":0},"mobile":"string","monetaryUnit":"string","monthly":true,"parking":true,"photos":["string"],"price":0,"saleType":"string","tag":["string"],"title":"string","type":0,"weekly":true}
         * id : string
         * like : 0
         * modelType : string
         * monetaryUnit : string
         * photos : ["string"]
         * positionedCity : true
         * price : 0
         * read : 0
         * recommend : true
         * recommendChannelId : string
         * secondHand : {"category":"string","cityName":"string","countryName":"string","detail":"string","hasPrice":true,"monetaryUnit":"string","photos":["string"],"price":0,"secondHandCategory":"string","tag":["string"],"title":"string"}
         * status : string
         * tag : ["string"]
         * title : string
         * updateAt : 2018-01-23T04:42:21.899Z
         * useModel : true
         * usedCar : {"address":"string","brand":"string","category":"string","cityName":"string","color":"string","countryName":"string","detail":"string","hasPrice":true,"insurance":"string","mileage":0,"mobile":"string","monetaryUnit":"string","photos":["string"],"price":0,"registrationDate":"2018-01-23T04:42:21.899Z","series":"string","tag":["string"],"title":"string","tradeTimes":0}
         * userAvatarUrl : string
         * userId : string
         * userName : string
         */

        private String category;
        private String cityName;
        private int commentCount;
        private boolean commentStatus;
        private String countryName;
        private String createAt;
        private String detail;
        private boolean hasPrice;
        private HouseBean house;
        private String id;
        private int like;
        private String modelType;
        private String monetaryUnit;
        private boolean positionedCity;
        private int price;
        private int read;
        private boolean recommend;
        private String recommendChannelId;
        private SecondHandBean secondHand;
        private String status;
        private String title;
        private String updateAt;
        private boolean useModel;
        private UsedCarBean usedCar;
        private String userAvatarUrl;
        private String userId;
        private String userName;
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

        public int getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(int commentCount) {
            this.commentCount = commentCount;
        }

        public boolean isCommentStatus() {
            return commentStatus;
        }

        public void setCommentStatus(boolean commentStatus) {
            this.commentStatus = commentStatus;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
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

        public boolean isHasPrice() {
            return hasPrice;
        }

        public void setHasPrice(boolean hasPrice) {
            this.hasPrice = hasPrice;
        }

        public HouseBean getHouse() {
            return house;
        }

        public void setHouse(HouseBean house) {
            this.house = house;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getLike() {
            return like;
        }

        public void setLike(int like) {
            this.like = like;
        }

        public String getModelType() {
            return modelType;
        }

        public void setModelType(String modelType) {
            this.modelType = modelType;
        }

        public String getMonetaryUnit() {
            return monetaryUnit;
        }

        public void setMonetaryUnit(String monetaryUnit) {
            this.monetaryUnit = monetaryUnit;
        }

        public boolean isPositionedCity() {
            return positionedCity;
        }

        public void setPositionedCity(boolean positionedCity) {
            this.positionedCity = positionedCity;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getRead() {
            return read;
        }

        public void setRead(int read) {
            this.read = read;
        }

        public boolean isRecommend() {
            return recommend;
        }

        public void setRecommend(boolean recommend) {
            this.recommend = recommend;
        }

        public String getRecommendChannelId() {
            return recommendChannelId;
        }

        public void setRecommendChannelId(String recommendChannelId) {
            this.recommendChannelId = recommendChannelId;
        }

        public SecondHandBean getSecondHand() {
            return secondHand;
        }

        public void setSecondHand(SecondHandBean secondHand) {
            this.secondHand = secondHand;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUpdateAt() {
            return updateAt;
        }

        public void setUpdateAt(String updateAt) {
            this.updateAt = updateAt;
        }

        public boolean isUseModel() {
            return useModel;
        }

        public void setUseModel(boolean useModel) {
            this.useModel = useModel;
        }

        public UsedCarBean getUsedCar() {
            return usedCar;
        }

        public void setUsedCar(UsedCarBean usedCar) {
            this.usedCar = usedCar;
        }

        public String getUserAvatarUrl() {
            return userAvatarUrl;
        }

        public void setUserAvatarUrl(String userAvatarUrl) {
            this.userAvatarUrl = userAvatarUrl;
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

        public static class HouseBean {
            /**
             * address : string
             * buildDate : 2018-01-23T04:42:21.899Z
             * category : string
             * cityName : string
             * countryName : string
             * daily : true
             * detail : string
             * hasPrice : true
             * houseArea : 0
             * houseType : string
             * location : {"lat":0,"lon":0}
             * mobile : string
             * monetaryUnit : string
             * monthly : true
             * parking : true
             * photos : ["string"]
             * price : 0
             * saleType : string
             * tag : ["string"]
             * title : string
             * type : 0
             * weekly : true
             */

            private String address;
            private String buildDate;
            private String category;
            private String cityName;
            private String countryName;
            private boolean daily;
            private String detail;
            private boolean hasPrice;
            private int houseArea;
            private String houseType;
            private LocationBean location;
            private String mobile;
            private String monetaryUnit;
            private boolean monthly;
            private boolean parking;
            private int price;
            private String saleType;
            private String title;
            private int type;
            private boolean weekly;
            private List<String> photos;
            private List<String> tag;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getBuildDate() {
                return buildDate;
            }

            public void setBuildDate(String buildDate) {
                this.buildDate = buildDate;
            }

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

            public boolean isDaily() {
                return daily;
            }

            public void setDaily(boolean daily) {
                this.daily = daily;
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

            public int getHouseArea() {
                return houseArea;
            }

            public void setHouseArea(int houseArea) {
                this.houseArea = houseArea;
            }

            public String getHouseType() {
                return houseType;
            }

            public void setHouseType(String houseType) {
                this.houseType = houseType;
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

            public String getMonetaryUnit() {
                return monetaryUnit;
            }

            public void setMonetaryUnit(String monetaryUnit) {
                this.monetaryUnit = monetaryUnit;
            }

            public boolean isMonthly() {
                return monthly;
            }

            public void setMonthly(boolean monthly) {
                this.monthly = monthly;
            }

            public boolean isParking() {
                return parking;
            }

            public void setParking(boolean parking) {
                this.parking = parking;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public String getSaleType() {
                return saleType;
            }

            public void setSaleType(String saleType) {
                this.saleType = saleType;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public boolean isWeekly() {
                return weekly;
            }

            public void setWeekly(boolean weekly) {
                this.weekly = weekly;
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

        public static class SecondHandBean {
            /**
             * category : string
             * cityName : string
             * countryName : string
             * detail : string
             * hasPrice : true
             * monetaryUnit : string
             * photos : ["string"]
             * price : 0
             * secondHandCategory : string
             * tag : ["string"]
             * title : string
             */

            private String category;
            private String cityName;
            private String countryName;
            private String detail;
            private boolean hasPrice;
            private String monetaryUnit;
            private int price;
            private String secondHandCategory;
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

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public String getSecondHandCategory() {
                return secondHandCategory;
            }

            public void setSecondHandCategory(String secondHandCategory) {
                this.secondHandCategory = secondHandCategory;
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

        public static class UsedCarBean {
            /**
             * address : string
             * brand : string
             * category : string
             * cityName : string
             * color : string
             * countryName : string
             * detail : string
             * hasPrice : true
             * insurance : string
             * mileage : 0
             * mobile : string
             * monetaryUnit : string
             * photos : ["string"]
             * price : 0
             * registrationDate : 2018-01-23T04:42:21.899Z
             * series : string
             * tag : ["string"]
             * title : string
             * tradeTimes : 0
             */

            private String address;
            private String brand;
            private String category;
            private String cityName;
            private String color;
            private String countryName;
            private String detail;
            private boolean hasPrice;
            private String insurance;
            private int mileage;
            private String mobile;
            private String monetaryUnit;
            private int price;
            private String registrationDate;
            private String series;
            private String title;
            private int tradeTimes;
            private List<String> photos;
            private List<String> tag;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getBrand() {
                return brand;
            }

            public void setBrand(String brand) {
                this.brand = brand;
            }

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

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
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

            public String getInsurance() {
                return insurance;
            }

            public void setInsurance(String insurance) {
                this.insurance = insurance;
            }

            public int getMileage() {
                return mileage;
            }

            public void setMileage(int mileage) {
                this.mileage = mileage;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getMonetaryUnit() {
                return monetaryUnit;
            }

            public void setMonetaryUnit(String monetaryUnit) {
                this.monetaryUnit = monetaryUnit;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public String getRegistrationDate() {
                return registrationDate;
            }

            public void setRegistrationDate(String registrationDate) {
                this.registrationDate = registrationDate;
            }

            public String getSeries() {
                return series;
            }

            public void setSeries(String series) {
                this.series = series;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getTradeTimes() {
                return tradeTimes;
            }

            public void setTradeTimes(int tradeTimes) {
                this.tradeTimes = tradeTimes;
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
    }

    public static class RelatedBean {
        /**
         * content : [{"category":"string","cityName":"string","commentCount":0,"commentStatus":true,"countryName":"string","createAt":"2018-01-23T04:42:21.899Z","detail":"string","hasPrice":true,"house":{"address":"string","buildDate":"2018-01-23T04:42:21.899Z","category":"string","cityName":"string","countryName":"string","daily":true,"detail":"string","hasPrice":true,"houseArea":0,"houseType":"string","location":{"lat":0,"lon":0},"mobile":"string","monetaryUnit":"string","monthly":true,"parking":true,"photos":["string"],"price":0,"saleType":"string","tag":["string"],"title":"string","type":0,"weekly":true},"id":"string","like":0,"modelType":"string","monetaryUnit":"string","photos":["string"],"positionedCity":true,"price":0,"read":0,"recommend":true,"recommendChannelId":"string","secondHand":{"category":"string","cityName":"string","countryName":"string","detail":"string","hasPrice":true,"monetaryUnit":"string","photos":["string"],"price":0,"secondHandCategory":"string","tag":["string"],"title":"string"},"status":"string","tag":["string"],"title":"string","updateAt":"2018-01-23T04:42:21.899Z","useModel":true,"usedCar":{"address":"string","brand":"string","category":"string","cityName":"string","color":"string","countryName":"string","detail":"string","hasPrice":true,"insurance":"string","mileage":0,"mobile":"string","monetaryUnit":"string","photos":["string"],"price":0,"registrationDate":"2018-01-23T04:42:21.899Z","series":"string","tag":["string"],"title":"string","tradeTimes":0},"userAvatarUrl":"string","userId":"string","userName":"string"}]
         * first : true
         * last : true
         * number : 0
         * numberOfElements : 0
         * size : 0
         * sort : {}
         * totalElements : 0
         * totalPages : 0
         */

        private boolean first;
        private boolean last;
        private int number;
        private int numberOfElements;
        private int size;
        private SortBeanX sort;
        private int totalElements;
        private int totalPages;
        private List<ContentBeanX> content;

        public boolean isFirst() {
            return first;
        }

        public void setFirst(boolean first) {
            this.first = first;
        }

        public boolean isLast() {
            return last;
        }

        public void setLast(boolean last) {
            this.last = last;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getNumberOfElements() {
            return numberOfElements;
        }

        public void setNumberOfElements(int numberOfElements) {
            this.numberOfElements = numberOfElements;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public SortBeanX getSort() {
            return sort;
        }

        public void setSort(SortBeanX sort) {
            this.sort = sort;
        }

        public int getTotalElements() {
            return totalElements;
        }

        public void setTotalElements(int totalElements) {
            this.totalElements = totalElements;
        }

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }

        public List<ContentBeanX> getContent() {
            return content;
        }

        public void setContent(List<ContentBeanX> content) {
            this.content = content;
        }

        public static class SortBeanX {
        }

        public static class ContentBeanX {
            /**
             * category : string
             * cityName : string
             * commentCount : 0
             * commentStatus : true
             * countryName : string
             * createAt : 2018-01-23T04:42:21.899Z
             * detail : string
             * hasPrice : true
             * house : {"address":"string","buildDate":"2018-01-23T04:42:21.899Z","category":"string","cityName":"string","countryName":"string","daily":true,"detail":"string","hasPrice":true,"houseArea":0,"houseType":"string","location":{"lat":0,"lon":0},"mobile":"string","monetaryUnit":"string","monthly":true,"parking":true,"photos":["string"],"price":0,"saleType":"string","tag":["string"],"title":"string","type":0,"weekly":true}
             * id : string
             * like : 0
             * modelType : string
             * monetaryUnit : string
             * photos : ["string"]
             * positionedCity : true
             * price : 0
             * read : 0
             * recommend : true
             * recommendChannelId : string
             * secondHand : {"category":"string","cityName":"string","countryName":"string","detail":"string","hasPrice":true,"monetaryUnit":"string","photos":["string"],"price":0,"secondHandCategory":"string","tag":["string"],"title":"string"}
             * status : string
             * tag : ["string"]
             * title : string
             * updateAt : 2018-01-23T04:42:21.899Z
             * useModel : true
             * usedCar : {"address":"string","brand":"string","category":"string","cityName":"string","color":"string","countryName":"string","detail":"string","hasPrice":true,"insurance":"string","mileage":0,"mobile":"string","monetaryUnit":"string","photos":["string"],"price":0,"registrationDate":"2018-01-23T04:42:21.899Z","series":"string","tag":["string"],"title":"string","tradeTimes":0}
             * userAvatarUrl : string
             * userId : string
             * userName : string
             */

            private String category;
            private String cityName;
            private int commentCount;
            private boolean commentStatus;
            private String countryName;
            private String createAt;
            private String detail;
            private boolean hasPrice;
            private HouseBeanX house;
            private String id;
            private int like;
            private String modelType;
            private String monetaryUnit;
            private boolean positionedCity;
            private int price;
            private int read;
            private boolean recommend;
            private String recommendChannelId;
            private SecondHandBeanX secondHand;
            private String status;
            private String title;
            private String updateAt;
            private boolean useModel;
            private UsedCarBeanX usedCar;
            private String userAvatarUrl;
            private String userId;
            private String userName;
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

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public boolean isCommentStatus() {
                return commentStatus;
            }

            public void setCommentStatus(boolean commentStatus) {
                this.commentStatus = commentStatus;
            }

            public String getCountryName() {
                return countryName;
            }

            public void setCountryName(String countryName) {
                this.countryName = countryName;
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

            public boolean isHasPrice() {
                return hasPrice;
            }

            public void setHasPrice(boolean hasPrice) {
                this.hasPrice = hasPrice;
            }

            public HouseBeanX getHouse() {
                return house;
            }

            public void setHouse(HouseBeanX house) {
                this.house = house;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getLike() {
                return like;
            }

            public void setLike(int like) {
                this.like = like;
            }

            public String getModelType() {
                return modelType;
            }

            public void setModelType(String modelType) {
                this.modelType = modelType;
            }

            public String getMonetaryUnit() {
                return monetaryUnit;
            }

            public void setMonetaryUnit(String monetaryUnit) {
                this.monetaryUnit = monetaryUnit;
            }

            public boolean isPositionedCity() {
                return positionedCity;
            }

            public void setPositionedCity(boolean positionedCity) {
                this.positionedCity = positionedCity;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getRead() {
                return read;
            }

            public void setRead(int read) {
                this.read = read;
            }

            public boolean isRecommend() {
                return recommend;
            }

            public void setRecommend(boolean recommend) {
                this.recommend = recommend;
            }

            public String getRecommendChannelId() {
                return recommendChannelId;
            }

            public void setRecommendChannelId(String recommendChannelId) {
                this.recommendChannelId = recommendChannelId;
            }

            public SecondHandBeanX getSecondHand() {
                return secondHand;
            }

            public void setSecondHand(SecondHandBeanX secondHand) {
                this.secondHand = secondHand;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUpdateAt() {
                return updateAt;
            }

            public void setUpdateAt(String updateAt) {
                this.updateAt = updateAt;
            }

            public boolean isUseModel() {
                return useModel;
            }

            public void setUseModel(boolean useModel) {
                this.useModel = useModel;
            }

            public UsedCarBeanX getUsedCar() {
                return usedCar;
            }

            public void setUsedCar(UsedCarBeanX usedCar) {
                this.usedCar = usedCar;
            }

            public String getUserAvatarUrl() {
                return userAvatarUrl;
            }

            public void setUserAvatarUrl(String userAvatarUrl) {
                this.userAvatarUrl = userAvatarUrl;
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

            public static class HouseBeanX {
                /**
                 * address : string
                 * buildDate : 2018-01-23T04:42:21.899Z
                 * category : string
                 * cityName : string
                 * countryName : string
                 * daily : true
                 * detail : string
                 * hasPrice : true
                 * houseArea : 0
                 * houseType : string
                 * location : {"lat":0,"lon":0}
                 * mobile : string
                 * monetaryUnit : string
                 * monthly : true
                 * parking : true
                 * photos : ["string"]
                 * price : 0
                 * saleType : string
                 * tag : ["string"]
                 * title : string
                 * type : 0
                 * weekly : true
                 */

                private String address;
                private String buildDate;
                private String category;
                private String cityName;
                private String countryName;
                private boolean daily;
                private String detail;
                private boolean hasPrice;
                private int houseArea;
                private String houseType;
                private LocationBeanX location;
                private String mobile;
                private String monetaryUnit;
                private boolean monthly;
                private boolean parking;
                private int price;
                private String saleType;
                private String title;
                private int type;
                private boolean weekly;
                private List<String> photos;
                private List<String> tag;

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getBuildDate() {
                    return buildDate;
                }

                public void setBuildDate(String buildDate) {
                    this.buildDate = buildDate;
                }

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

                public boolean isDaily() {
                    return daily;
                }

                public void setDaily(boolean daily) {
                    this.daily = daily;
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

                public int getHouseArea() {
                    return houseArea;
                }

                public void setHouseArea(int houseArea) {
                    this.houseArea = houseArea;
                }

                public String getHouseType() {
                    return houseType;
                }

                public void setHouseType(String houseType) {
                    this.houseType = houseType;
                }

                public LocationBeanX getLocation() {
                    return location;
                }

                public void setLocation(LocationBeanX location) {
                    this.location = location;
                }

                public String getMobile() {
                    return mobile;
                }

                public void setMobile(String mobile) {
                    this.mobile = mobile;
                }

                public String getMonetaryUnit() {
                    return monetaryUnit;
                }

                public void setMonetaryUnit(String monetaryUnit) {
                    this.monetaryUnit = monetaryUnit;
                }

                public boolean isMonthly() {
                    return monthly;
                }

                public void setMonthly(boolean monthly) {
                    this.monthly = monthly;
                }

                public boolean isParking() {
                    return parking;
                }

                public void setParking(boolean parking) {
                    this.parking = parking;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public String getSaleType() {
                    return saleType;
                }

                public void setSaleType(String saleType) {
                    this.saleType = saleType;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public boolean isWeekly() {
                    return weekly;
                }

                public void setWeekly(boolean weekly) {
                    this.weekly = weekly;
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

                public static class LocationBeanX {
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

            public static class SecondHandBeanX {
                /**
                 * category : string
                 * cityName : string
                 * countryName : string
                 * detail : string
                 * hasPrice : true
                 * monetaryUnit : string
                 * photos : ["string"]
                 * price : 0
                 * secondHandCategory : string
                 * tag : ["string"]
                 * title : string
                 */

                private String category;
                private String cityName;
                private String countryName;
                private String detail;
                private boolean hasPrice;
                private String monetaryUnit;
                private int price;
                private String secondHandCategory;
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

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public String getSecondHandCategory() {
                    return secondHandCategory;
                }

                public void setSecondHandCategory(String secondHandCategory) {
                    this.secondHandCategory = secondHandCategory;
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

            public static class UsedCarBeanX {
                /**
                 * address : string
                 * brand : string
                 * category : string
                 * cityName : string
                 * color : string
                 * countryName : string
                 * detail : string
                 * hasPrice : true
                 * insurance : string
                 * mileage : 0
                 * mobile : string
                 * monetaryUnit : string
                 * photos : ["string"]
                 * price : 0
                 * registrationDate : 2018-01-23T04:42:21.899Z
                 * series : string
                 * tag : ["string"]
                 * title : string
                 * tradeTimes : 0
                 */

                private String address;
                private String brand;
                private String category;
                private String cityName;
                private String color;
                private String countryName;
                private String detail;
                private boolean hasPrice;
                private String insurance;
                private int mileage;
                private String mobile;
                private String monetaryUnit;
                private int price;
                private String registrationDate;
                private String series;
                private String title;
                private int tradeTimes;
                private List<String> photos;
                private List<String> tag;

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getBrand() {
                    return brand;
                }

                public void setBrand(String brand) {
                    this.brand = brand;
                }

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

                public String getColor() {
                    return color;
                }

                public void setColor(String color) {
                    this.color = color;
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

                public String getInsurance() {
                    return insurance;
                }

                public void setInsurance(String insurance) {
                    this.insurance = insurance;
                }

                public int getMileage() {
                    return mileage;
                }

                public void setMileage(int mileage) {
                    this.mileage = mileage;
                }

                public String getMobile() {
                    return mobile;
                }

                public void setMobile(String mobile) {
                    this.mobile = mobile;
                }

                public String getMonetaryUnit() {
                    return monetaryUnit;
                }

                public void setMonetaryUnit(String monetaryUnit) {
                    this.monetaryUnit = monetaryUnit;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public String getRegistrationDate() {
                    return registrationDate;
                }

                public void setRegistrationDate(String registrationDate) {
                    this.registrationDate = registrationDate;
                }

                public String getSeries() {
                    return series;
                }

                public void setSeries(String series) {
                    this.series = series;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTradeTimes() {
                    return tradeTimes;
                }

                public void setTradeTimes(int tradeTimes) {
                    this.tradeTimes = tradeTimes;
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
        }
    }
}
