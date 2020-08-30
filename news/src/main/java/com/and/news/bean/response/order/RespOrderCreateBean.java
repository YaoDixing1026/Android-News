package com.and.news.bean.response.order;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ydx on 17-9-21.
 */

public class RespOrderCreateBean implements Serializable {
    /**
     * amount : 0
     * buyerMobile : string
     * buyerName : string
     * comment : {"content":"string","createAt":"2017-09-14T06:17:02.308Z","userAvatarUrl":"string","userId":"string","username":"string"}
     * createAt : 2017-09-14T06:17:02.308Z
     * currency : string
     * deliveryAt : 2017-09-14T06:17:02.308Z
     * deliveryCode : string
     * id : string
     * merchantId : string
     * merchantName : string
     * message : string
     * prices : 0
     * product : {"category":"string","cityName":"string","countryName":"string","cover":["string"],"createAt":"2017-09-14T06:17:02.308Z","currency":"string","deadline":"2017-09-14T06:17:02.308Z","deliveryAddress":"string","deliveryDateFrom":"2017-09-14T06:17:02.308Z","deliveryDateTo":"2017-09-14T06:17:02.308Z","detail":"string","id":"string","inventory":0,"merchant":{"address":"string","id":"string","image":"string","info":"string","name":"string","phone":"string","rating":0,"sold":0,"status":true},"merchantId":"string","originPrice":0,"phone":"string","price":0,"sold":0,"status":"string","title":"string","updateAt":"2017-09-14T06:17:02.308Z"}
     * productId : string
     * productTitle : string
     * rating : 0
     * status : string
     * updateAt : 2017-09-14T06:17:02.308Z
     * userAvatarUrl : string
     * userId : string
     * username : string
     */
    private int amount;
    private String buyerMobile;
    private String buyerName;
    private CommentBean comment;
    private String createAt;
    private String currency;
    private String deliveryAt;
    private String deliveryCode;
    private String id;
    private String merchantId;
    private String merchantName;
    private String message;
    private int prices;
    private ProductBean product;
    private String productId;
    private String productTitle;
    private int rating;
    private String status;
    private String updateAt;
    private String userAvatarUrl;
    private String userId;
    private String username;
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
    public CommentBean getComment() {
        return comment;
    }
    public void setComment(CommentBean comment) {
        this.comment = comment;
    }
    public String getCreateAt() {
        return createAt;
    }
    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getDeliveryAt() {
        return deliveryAt;
    }
    public void setDeliveryAt(String deliveryAt) {
        this.deliveryAt = deliveryAt;
    }
    public String getDeliveryCode() {
        return deliveryCode;
    }
    public void setDeliveryCode(String deliveryCode) {
        this.deliveryCode = deliveryCode;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMerchantId() {
        return merchantId;
    }
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
    public String getMerchantName() {
        return merchantName;
    }
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public int getPrices() {
        return prices;
    }
    public void setPrices(int prices) {
        this.prices = prices;
    }
    public ProductBean getProduct() {
        return product;
    }
    public void setProduct(ProductBean product) {
        this.product = product;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProductTitle() {
        return productTitle;
    }
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
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
    public static class CommentBean implements Serializable {
        /**
         * content : string
         * createAt : 2017-09-14T06:17:02.308Z
         * userAvatarUrl : string
         * userId : string
         * username : string
         */
        private String content;
        private String createAt;
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
    public static class ProductBean implements Serializable {
        /**
         * category : string
         * cityName : string
         * countryName : string
         * cover : ["string"]
         * createAt : 2017-09-14T06:17:02.308Z
         * currency : string
         * deadline : 2017-09-14T06:17:02.308Z
         * deliveryAddress : string
         * deliveryDateFrom : 2017-09-14T06:17:02.308Z
         * deliveryDateTo : 2017-09-14T06:17:02.308Z
         * detail : string
         * id : string
         * inventory : 0
         * merchant : {"address":"string","id":"string","image":"string","info":"string","name":"string","phone":"string","rating":0,"sold":0,"status":true}
         * merchantId : string
         * originPrice : 0
         * phone : string
         * price : 0
         * sold : 0
         * status : string
         * title : string
         * updateAt : 2017-09-14T06:17:02.308Z
         */
        private String category;
        private String cityName;
        private String countryName;
        private String createAt;
        private String currency;
        private String deadline;
        private String deliveryAddress;
        private String deliveryDateFrom;
        private String deliveryDateTo;
        private String detail;
        private String id;
        private int inventory;
        private MerchantBean merchant;
        private String merchantId;
        private int originPrice;
        private String phone;
        private int price;
        private int sold;
        private String status;
        private String title;
        private String updateAt;
        private List<String> cover;
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
        public String getCreateAt() {
            return createAt;
        }
        public void setCreateAt(String createAt) {
            this.createAt = createAt;
        }
        public String getCurrency() {
            return currency;
        }
        public void setCurrency(String currency) {
            this.currency = currency;
        }
        public String getDeadline() {
            return deadline;
        }
        public void setDeadline(String deadline) {
            this.deadline = deadline;
        }
        public String getDeliveryAddress() {
            return deliveryAddress;
        }
        public void setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
        }
        public String getDeliveryDateFrom() {
            return deliveryDateFrom;
        }
        public void setDeliveryDateFrom(String deliveryDateFrom) {
            this.deliveryDateFrom = deliveryDateFrom;
        }
        public String getDeliveryDateTo() {
            return deliveryDateTo;
        }
        public void setDeliveryDateTo(String deliveryDateTo) {
            this.deliveryDateTo = deliveryDateTo;
        }
        public String getDetail() {
            return detail;
        }
        public void setDetail(String detail) {
            this.detail = detail;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public int getInventory() {
            return inventory;
        }
        public void setInventory(int inventory) {
            this.inventory = inventory;
        }
        public MerchantBean getMerchant() {
            return merchant;
        }
        public void setMerchant(MerchantBean merchant) {
            this.merchant = merchant;
        }
        public String getMerchantId() {
            return merchantId;
        }
        public void setMerchantId(String merchantId) {
            this.merchantId = merchantId;
        }
        public int getOriginPrice() {
            return originPrice;
        }
        public void setOriginPrice(int originPrice) {
            this.originPrice = originPrice;
        }
        public String getPhone() {
            return phone;
        }
        public void setPhone(String phone) {
            this.phone = phone;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public int getSold() {
            return sold;
        }
        public void setSold(int sold) {
            this.sold = sold;
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
        public List<String> getCover() {
            return cover;
        }
        public void setCover(List<String> cover) {
            this.cover = cover;
        }
        public static class MerchantBean implements Serializable {
            /**
             * address : string
             * id : string
             * image : string
             * info : string
             * name : string
             * phone : string
             * rating : 0
             * sold : 0
             * status : true
             */
            private String address;
            private String id;
            private String image;
            private String info;
            private String name;
            private String phone;
            private int rating;
            private int sold;
            private boolean status;
            public String getAddress() {
                return address;
            }
            public void setAddress(String address) {
                this.address = address;
            }
            public String getId() {
                return id;
            }
            public void setId(String id) {
                this.id = id;
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
            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public String getPhone() {
                return phone;
            }
            public void setPhone(String phone) {
                this.phone = phone;
            }
            public int getRating() {
                return rating;
            }
            public void setRating(int rating) {
                this.rating = rating;
            }
            public int getSold() {
                return sold;
            }
            public void setSold(int sold) {
                this.sold = sold;
            }
            public boolean isStatus() {
                return status;
            }
            public void setStatus(boolean status) {
                this.status = status;
            }
        }
    }
}
