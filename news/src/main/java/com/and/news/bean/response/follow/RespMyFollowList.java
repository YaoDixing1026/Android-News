package com.and.news.bean.response.follow;

import java.util.List;

/**
 * Created by ydx on 17-2-27.
 */

public class RespMyFollowList {


    /**
     * content : [{"pubInfo":{"name":"cctv-5","introduction":"publushing some sports evennts articles.","tag":"tag","avatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58817870526dcd1fea5dbd37/20170122230422.png","channel":null,"channelId":null,"mediaType":null,"recommend":true,"recommendWeight":1,"recommendInfo":"supporting the newest and best sport for all readers.","leaderName":null,"leaderIdNumber":null,"leaderIdPhoto":null,"leaderEmail":null,"address":null,"phoneNumber":null,"companyName":null,"businessLicence":null,"website":null,"status":"online","createAt":null,"updateAt":null},"follow":{"id":"58b62e40526dcd79f3a9496d","username":"axiba","avatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58817870526dcd1fea5dbd37/20170122230422.png","followUserId":"58b3d5568f2b977b395619ec","userType":"pub","myUserId":"58a40874526dcd3db9abecdf","status":true,"createAt":"2017-03-01T02:13:20Z"},"newsTitle":"Elon Musk称特斯拉60mph加速可达到2.34秒","newsCreateAt":"2017-01-12T06:34:45Z"},{"pubInfo":{"name":"PUBLIC","introduction":"I'm public user.","tag":"tag","avatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58817870526dcd1fea5dbd37/20170122230422.png","channel":null,"channelId":null,"mediaType":null,"recommend":true,"recommendWeight":1,"recommendInfo":"this is the best PubNum which publish news","leaderName":null,"leaderIdNumber":null,"leaderIdPhoto":null,"leaderEmail":null,"address":null,"phoneNumber":null,"companyName":null,"businessLicence":null,"website":null,"status":"online","createAt":null,"updateAt":null},"follow":{"id":"58b62edf526dcd79f3a9496f","username":"ggg","avatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58817870526dcd1fea5dbd37/20170122230422.png","followUserId":"58afe03e8f2b977b39552748","userType":"pub","myUserId":"58a40874526dcd3db9abecdf","status":true,"createAt":"2017-03-01T02:15:59Z"},"newsTitle":"焦点：奥巴马在卸任演说中高谈美国价值 提点特朗普","newsCreateAt":"2017-01-09T06:34:45Z"}]
     * last : true
     * totalPages : 1
     * totalElements : 2
     * first : true
     * sort : null
     * numberOfElements : 2
     * size : 20
     * number : 0
     */

    private boolean last;
    private int totalPages;
    private int totalElements;
    private boolean first;
    private Object sort;
    private int numberOfElements;
    private int size;
    private int number;
    private List<ContentBean> content;

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

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

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public Object getSort() {
        return sort;
    }

    public void setSort(Object sort) {
        this.sort = sort;
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
         * pubInfo : {"name":"cctv-5","introduction":"publushing some sports evennts articles.","tag":"tag","avatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58817870526dcd1fea5dbd37/20170122230422.png","channel":null,"channelId":null,"mediaType":null,"recommend":true,"recommendWeight":1,"recommendInfo":"supporting the newest and best sport for all readers.","leaderName":null,"leaderIdNumber":null,"leaderIdPhoto":null,"leaderEmail":null,"address":null,"phoneNumber":null,"companyName":null,"businessLicence":null,"website":null,"status":"online","createAt":null,"updateAt":null}
         * follow : {"id":"58b62e40526dcd79f3a9496d","username":"axiba","avatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58817870526dcd1fea5dbd37/20170122230422.png","followUserId":"58b3d5568f2b977b395619ec","userType":"pub","myUserId":"58a40874526dcd3db9abecdf","status":true,"createAt":"2017-03-01T02:13:20Z"}
         * newsTitle : Elon Musk称特斯拉60mph加速可达到2.34秒
         * newsCreateAt : 2017-01-12T06:34:45Z
         */


        /**
         *  是否已关注
         */
        private boolean isFollow;

        public boolean isFollow() {
            return isFollow;
        }

        public void setFollow(boolean follow) {
            isFollow = follow;
        }

        /**
         * 抽屉删除按钮 显示状态
         */
        private boolean menuIsOpen;

        public boolean isMenuIsOpen() {
            return menuIsOpen;
        }

        public void setMenuIsOpen(boolean menuIsOpen) {
            this.menuIsOpen = menuIsOpen;
        }

        private PubInfoBean pubInfo;
        private FollowBean follow;
        private String newsTitle;
        private String newsCreateAt;

        public PubInfoBean getPubInfo() {
            return pubInfo;
        }

        public void setPubInfo(PubInfoBean pubInfo) {
            this.pubInfo = pubInfo;
        }

        public FollowBean getFollow() {
            return follow;
        }

        public void setFollow(FollowBean follow) {
            this.follow = follow;
        }

        public String getNewsTitle() {
            return newsTitle;
        }

        public void setNewsTitle(String newsTitle) {
            this.newsTitle = newsTitle;
        }

        public String getNewsCreateAt() {
            return newsCreateAt;
        }

        public void setNewsCreateAt(String newsCreateAt) {
            this.newsCreateAt = newsCreateAt;
        }

        public static class PubInfoBean {
            /**
             * name : cctv-5
             * introduction : publushing some sports evennts articles.
             * tag : tag
             * avatarUrl : http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58817870526dcd1fea5dbd37/20170122230422.png
             * channel : null
             * channelId : null
             * mediaType : null
             * recommend : true
             * recommendWeight : 1
             * recommendInfo : supporting the newest and best sport for all readers.
             * leaderName : null
             * leaderIdNumber : null
             * leaderIdPhoto : null
             * leaderEmail : null
             * address : null
             * phoneNumber : null
             * companyName : null
             * businessLicence : null
             * website : null
             * status : online
             * createAt : null
             * updateAt : null
             */

            private String name;
            private String introduction;
            private String tag;
            private String avatarUrl;
            private Object channel;
            private Object channelId;
            private Object mediaType;
            private boolean recommend;
            private int recommendWeight;
            private String recommendInfo;
            private Object leaderName;
            private Object leaderIdNumber;
            private Object leaderIdPhoto;
            private Object leaderEmail;
            private Object address;
            private Object phoneNumber;
            private Object companyName;
            private Object businessLicence;
            private Object website;
            private String status;
            private Object createAt;
            private Object updateAt;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getIntroduction() {
                return introduction;
            }

            public void setIntroduction(String introduction) {
                this.introduction = introduction;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getAvatarUrl() {
                return avatarUrl;
            }

            public void setAvatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
            }

            public Object getChannel() {
                return channel;
            }

            public void setChannel(Object channel) {
                this.channel = channel;
            }

            public Object getChannelId() {
                return channelId;
            }

            public void setChannelId(Object channelId) {
                this.channelId = channelId;
            }

            public Object getMediaType() {
                return mediaType;
            }

            public void setMediaType(Object mediaType) {
                this.mediaType = mediaType;
            }

            public boolean isRecommend() {
                return recommend;
            }

            public void setRecommend(boolean recommend) {
                this.recommend = recommend;
            }

            public int getRecommendWeight() {
                return recommendWeight;
            }

            public void setRecommendWeight(int recommendWeight) {
                this.recommendWeight = recommendWeight;
            }

            public String getRecommendInfo() {
                return recommendInfo;
            }

            public void setRecommendInfo(String recommendInfo) {
                this.recommendInfo = recommendInfo;
            }

            public Object getLeaderName() {
                return leaderName;
            }

            public void setLeaderName(Object leaderName) {
                this.leaderName = leaderName;
            }

            public Object getLeaderIdNumber() {
                return leaderIdNumber;
            }

            public void setLeaderIdNumber(Object leaderIdNumber) {
                this.leaderIdNumber = leaderIdNumber;
            }

            public Object getLeaderIdPhoto() {
                return leaderIdPhoto;
            }

            public void setLeaderIdPhoto(Object leaderIdPhoto) {
                this.leaderIdPhoto = leaderIdPhoto;
            }

            public Object getLeaderEmail() {
                return leaderEmail;
            }

            public void setLeaderEmail(Object leaderEmail) {
                this.leaderEmail = leaderEmail;
            }

            public Object getAddress() {
                return address;
            }

            public void setAddress(Object address) {
                this.address = address;
            }

            public Object getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(Object phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public Object getCompanyName() {
                return companyName;
            }

            public void setCompanyName(Object companyName) {
                this.companyName = companyName;
            }

            public Object getBusinessLicence() {
                return businessLicence;
            }

            public void setBusinessLicence(Object businessLicence) {
                this.businessLicence = businessLicence;
            }

            public Object getWebsite() {
                return website;
            }

            public void setWebsite(Object website) {
                this.website = website;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public Object getCreateAt() {
                return createAt;
            }

            public void setCreateAt(Object createAt) {
                this.createAt = createAt;
            }

            public Object getUpdateAt() {
                return updateAt;
            }

            public void setUpdateAt(Object updateAt) {
                this.updateAt = updateAt;
            }
        }

        public static class FollowBean {
            /**
             * id : 58b62e40526dcd79f3a9496d
             * username : axiba
             * avatarUrl : http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58817870526dcd1fea5dbd37/20170122230422.png
             * followUserId : 58b3d5568f2b977b395619ec
             * userType : pub
             * myUserId : 58a40874526dcd3db9abecdf
             * status : true
             * createAt : 2017-03-01T02:13:20Z
             */

            private String id;
            private String username;
            private String avatarUrl;
            private String followUserId;
            private String userType;
            private String myUserId;
            private boolean status;
            private String createAt;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getAvatarUrl() {
                return avatarUrl;
            }

            public void setAvatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
            }

            public String getFollowUserId() {
                return followUserId;
            }

            public void setFollowUserId(String followUserId) {
                this.followUserId = followUserId;
            }

            public String getUserType() {
                return userType;
            }

            public void setUserType(String userType) {
                this.userType = userType;
            }

            public String getMyUserId() {
                return myUserId;
            }

            public void setMyUserId(String myUserId) {
                this.myUserId = myUserId;
            }

            public boolean isStatus() {
                return status;
            }

            public void setStatus(boolean status) {
                this.status = status;
            }

            public String getCreateAt() {
                return createAt;
            }

            public void setCreateAt(String createAt) {
                this.createAt = createAt;
            }
        }
    }
}
