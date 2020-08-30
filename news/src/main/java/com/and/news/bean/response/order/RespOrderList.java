package com.and.news.bean.response.order;

import com.and.news.bean.entity.Merchant;
import com.and.news.bean.entity.order.OrderCommentBean;

import java.util.List;

/**
 * Created by ydx on 17-9-20.
 */

public class RespOrderList {

    /**
     * content : [{"id":"1709221005006103574","userId":"5951b64b526dcd5f90043a5d","username":"网友c4fb9","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/user%403x.png","productId":"59b74ff0526dcd63a559c084","productTitle":"现摘陕西脆甜李子 5-8斤 ［单果100g－160g］ 黑布林 香甜可口 新鲜时令水果","product":{"id":"59b74ff0526dcd63a559c084","merchantId":"59b74fe2526dcd63a559c082","merchant":{"id":"59b74fe2526dcd63a559c082","name":"我是测试商家","image":"http://x-test.oss-cn-shenzhen.aliyuncs.com/temp/%E9%B2%9C%E6%9E%9C%E5%85%83%E7%B4%A0.jpg","info":"鲜果元素专注做新鲜水果30年，致力为消费者提供品质\n鲜果。\n商家地址：火星\n","phone":"+8601053383152","address":"火星","status":true},"title":"现摘陕西脆甜李子 5-8斤 ［单果100g－160g］ 黑布林 香甜可口 新鲜时令水果","cover":["http://x-test.oss-cn-shenzhen.aliyuncs.com/temp/%E9%BB%91%E5%B8%83%E6%9E%97.jpeg","http://x-test.oss-cn-shenzhen.aliyuncs.com/temp/%E6%9D%8E%E5%AD%902.jpeg"],"price":912,"currency":"cny","originPrice":1801,"phone":"1231212312","detail":"现摘现取，新鲜到家，产自秦岭，纯天然自然环境下生长\n，带您享受大自然原生态的馈赠。黑不林李子现摘现取，\n清香脆甜，味浓香溢，唇齿留香，让您流连忘返。陕西秦\n岭山黑布林李子颗颗精选，独特的地理环境种值.\n真正的清仓 真正的甩货 全场卖两块 买啥都两块 随便挑 随便选 两块钱 你买不了吃亏 两块钱 你买不了上当 真正的物有所值","inventory":500,"deliveryDateFrom":"2017-09-12T03:09:36Z","deliveryDateTo":"2017-09-12T03:09:36Z","deliveryAddress":"楼下","countryName":"中国","cityName":"北京市","category":"吃货","deadline":"2017-09-12T03:09:36Z","createAt":"2017-09-12T03:09:36Z","updateAt":"2017-09-12T03:09:36Z","status":"online"},"merchantId":"59b74fe2526dcd63a559c082","merchantName":"我是测试商家","buyerName":"网友c4fb9","buyerMobile":"+8618610927635","prices":912,"amount":1,"currency":"cny","payChannel":"alipay","deliveryCode":"22MNGF","createAt":"2017-09-22T02:05:00Z","updateAt":"2017-09-22T05:44:01Z","rating":3,"comment":{"userId":"5951b64b526dcd5f90043a5d","username":"网友c4fb9","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/user%403x.png","content":"not bad","createAt":"2017-09-22T06:05:36Z"},"status":"rating"}]
     * totalPages : 1
     * totalElements : 1
     * last : true
     * sort : [{"direction":"DESC","property":"updateAt","ignoreCase":false,"nullHandling":"NATIVE","ascending":false,"descending":true}]
     * numberOfElements : 1
     * first : true
     * size : 20
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
    private List<SortBean> sort;

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

    public List<SortBean> getSort() {
        return sort;
    }

    public void setSort(List<SortBean> sort) {
        this.sort = sort;
    }

    public static class ContentBean {
        /**
         * id : 1709221005006103574
         * userId : 5951b64b526dcd5f90043a5d
         * username : 网友c4fb9
         * userAvatarUrl : http://x-test.oss-cn-shenzhen.aliyuncs.com/user%403x.png
         * productId : 59b74ff0526dcd63a559c084
         * productTitle : 现摘陕西脆甜李子 5-8斤 ［单果100g－160g］ 黑布林 香甜可口 新鲜时令水果
         * product : {"id":"59b74ff0526dcd63a559c084","merchantId":"59b74fe2526dcd63a559c082","merchant":{"id":"59b74fe2526dcd63a559c082","name":"我是测试商家","image":"http://x-test.oss-cn-shenzhen.aliyuncs.com/temp/%E9%B2%9C%E6%9E%9C%E5%85%83%E7%B4%A0.jpg","info":"鲜果元素专注做新鲜水果30年，致力为消费者提供品质\n鲜果。\n商家地址：火星\n","phone":"+8601053383152","address":"火星","status":true},"title":"现摘陕西脆甜李子 5-8斤 ［单果100g－160g］ 黑布林 香甜可口 新鲜时令水果","cover":["http://x-test.oss-cn-shenzhen.aliyuncs.com/temp/%E9%BB%91%E5%B8%83%E6%9E%97.jpeg","http://x-test.oss-cn-shenzhen.aliyuncs.com/temp/%E6%9D%8E%E5%AD%902.jpeg"],"price":912,"currency":"cny","originPrice":1801,"phone":"1231212312","detail":"现摘现取，新鲜到家，产自秦岭，纯天然自然环境下生长\n，带您享受大自然原生态的馈赠。黑不林李子现摘现取，\n清香脆甜，味浓香溢，唇齿留香，让您流连忘返。陕西秦\n岭山黑布林李子颗颗精选，独特的地理环境种值.\n真正的清仓 真正的甩货 全场卖两块 买啥都两块 随便挑 随便选 两块钱 你买不了吃亏 两块钱 你买不了上当 真正的物有所值","inventory":500,"deliveryDateFrom":"2017-09-12T03:09:36Z","deliveryDateTo":"2017-09-12T03:09:36Z","deliveryAddress":"楼下","countryName":"中国","cityName":"北京市","category":"吃货","deadline":"2017-09-12T03:09:36Z","createAt":"2017-09-12T03:09:36Z","updateAt":"2017-09-12T03:09:36Z","status":"online"}
         * merchantId : 59b74fe2526dcd63a559c082
         * merchantName : 我是测试商家
         * buyerName : 网友c4fb9
         * buyerMobile : +8618610927635
         * prices : 912
         * amount : 1
         * currency : cny
         * payChannel : alipay
         * deliveryCode : 22MNGF
         * createAt : 2017-09-22T02:05:00Z
         * updateAt : 2017-09-22T05:44:01Z
         * rating : 3
         * comment : {"userId":"5951b64b526dcd5f90043a5d","username":"网友c4fb9","userAvatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/user%403x.png","content":"not bad","createAt":"2017-09-22T06:05:36Z"}
         * status : rating
         */

        private String id;
        private String userId;
        private String username;
        private String userAvatarUrl;
        private String productId;
        private String productTitle;
        private ProductBean product;
        private String merchantId;
        private String merchantName;
        private String buyerName;
        private String buyerMobile;
        private int prices;
        private int amount;
        private String currency;
        private String payChannel;
        private String deliveryCode;
        private String createAt;
        private String updateAt;
        private int rating;
        private OrderCommentBean comment;
        private String status;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public String getUserAvatarUrl() {
            return userAvatarUrl;
        }

        public void setUserAvatarUrl(String userAvatarUrl) {
            this.userAvatarUrl = userAvatarUrl;
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

        public ProductBean getProduct() {
            return product;
        }

        public void setProduct(ProductBean product) {
            this.product = product;
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

        public String getBuyerName() {
            return buyerName;
        }

        public void setBuyerName(String buyerName) {
            this.buyerName = buyerName;
        }

        public String getBuyerMobile() {
            return buyerMobile;
        }

        public void setBuyerMobile(String buyerMobile) {
            this.buyerMobile = buyerMobile;
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

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getPayChannel() {
            return payChannel;
        }

        public void setPayChannel(String payChannel) {
            this.payChannel = payChannel;
        }

        public String getDeliveryCode() {
            return deliveryCode;
        }

        public void setDeliveryCode(String deliveryCode) {
            this.deliveryCode = deliveryCode;
        }

        public String getCreateAt() {
            return createAt;
        }

        public void setCreateAt(String createAt) {
            this.createAt = createAt;
        }

        public String getUpdateAt() {
            return updateAt;
        }

        public void setUpdateAt(String updateAt) {
            this.updateAt = updateAt;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public OrderCommentBean getComment() {
            return comment;
        }

        public void setComment(OrderCommentBean comment) {
            this.comment = comment;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public static class ProductBean {
            /**
             * id : 59b74ff0526dcd63a559c084
             * merchantId : 59b74fe2526dcd63a559c082
             * merchant : {"id":"59b74fe2526dcd63a559c082","name":"我是测试商家","image":"http://x-test.oss-cn-shenzhen.aliyuncs.com/temp/%E9%B2%9C%E6%9E%9C%E5%85%83%E7%B4%A0.jpg","info":"鲜果元素专注做新鲜水果30年，致力为消费者提供品质\n鲜果。\n商家地址：火星\n","phone":"+8601053383152","address":"火星","status":true}
             * title : 现摘陕西脆甜李子 5-8斤 ［单果100g－160g］ 黑布林 香甜可口 新鲜时令水果
             * cover : ["http://x-test.oss-cn-shenzhen.aliyuncs.com/temp/%E9%BB%91%E5%B8%83%E6%9E%97.jpeg","http://x-test.oss-cn-shenzhen.aliyuncs.com/temp/%E6%9D%8E%E5%AD%902.jpeg"]
             * price : 912
             * currency : cny
             * originPrice : 1801
             * phone : 1231212312
             * detail : 现摘现取，新鲜到家，产自秦岭，纯天然自然环境下生长
             ，带您享受大自然原生态的馈赠。黑不林李子现摘现取，
             清香脆甜，味浓香溢，唇齿留香，让您流连忘返。陕西秦
             岭山黑布林李子颗颗精选，独特的地理环境种值.
             真正的清仓 真正的甩货 全场卖两块 买啥都两块 随便挑 随便选 两块钱 你买不了吃亏 两块钱 你买不了上当 真正的物有所值
             * inventory : 500
             * deliveryDateFrom : 2017-09-12T03:09:36Z
             * deliveryDateTo : 2017-09-12T03:09:36Z
             * deliveryAddress : 楼下
             * countryName : 中国
             * cityName : 北京市
             * category : 吃货
             * deadline : 2017-09-12T03:09:36Z
             * createAt : 2017-09-12T03:09:36Z
             * updateAt : 2017-09-12T03:09:36Z
             * status : online
             */

            private String id;
            private String merchantId;
            private Merchant merchant;
            private String title;
            private int price;
            private String currency;
            private int originPrice;
            private String phone;
            private String detail;
            private int inventory;
            private String deliveryDateFrom;
            private String deliveryDateTo;
            private String deliveryAddress;
            private String countryName;
            private String cityName;
            private String category;
            private String deadline;
            private String createAt;
            private String updateAt;
            private String status;
            private List<String> cover;

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

            public Merchant getMerchant() {
                return merchant;
            }

            public void setMerchant(Merchant merchant) {
                this.merchant = merchant;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
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

            public String getDetail() {
                return detail;
            }

            public void setDetail(String detail) {
                this.detail = detail;
            }

            public int getInventory() {
                return inventory;
            }

            public void setInventory(int inventory) {
                this.inventory = inventory;
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

            public String getDeliveryAddress() {
                return deliveryAddress;
            }

            public void setDeliveryAddress(String deliveryAddress) {
                this.deliveryAddress = deliveryAddress;
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

            public String getDeadline() {
                return deadline;
            }

            public void setDeadline(String deadline) {
                this.deadline = deadline;
            }

            public String getCreateAt() {
                return createAt;
            }

            public void setCreateAt(String createAt) {
                this.createAt = createAt;
            }

            public String getUpdateAt() {
                return updateAt;
            }

            public void setUpdateAt(String updateAt) {
                this.updateAt = updateAt;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public List<String> getCover() {
                return cover;
            }

            public void setCover(List<String> cover) {
                this.cover = cover;
            }

           
        }


    }

    public static class SortBean {
        /**
         * direction : DESC
         * property : updateAt
         * ignoreCase : false
         * nullHandling : NATIVE
         * ascending : false
         * descending : true
         */

        private String direction;
        private String property;
        private boolean ignoreCase;
        private String nullHandling;
        private boolean ascending;
        private boolean descending;

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }

        public boolean isIgnoreCase() {
            return ignoreCase;
        }

        public void setIgnoreCase(boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
        }

        public String getNullHandling() {
            return nullHandling;
        }

        public void setNullHandling(String nullHandling) {
            this.nullHandling = nullHandling;
        }

        public boolean isAscending() {
            return ascending;
        }

        public void setAscending(boolean ascending) {
            this.ascending = ascending;
        }

        public boolean isDescending() {
            return descending;
        }

        public void setDescending(boolean descending) {
            this.descending = descending;
        }
    }
}
