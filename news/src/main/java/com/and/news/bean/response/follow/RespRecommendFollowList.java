package com.and.news.bean.response.follow;

import java.util.List;

/**
 * Created by ydx on 17-2-27.
 */

public class RespRecommendFollowList {

    /**
     * content : [{"pubId":"58afe03e8f2b977b39552748","name":"PUBLIC","introduction":"I'm public user.","tag":"tag","avatarUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58817870526dcd1fea5dbd37/20170122230422.png"}]
     * totalElements : 1
     * totalPages : 1
     * last : true
     * first : true
     * sort : null
     * numberOfElements : 1
     * size : 20
     * number : 0
     */

    private int totalElements;
    private int totalPages;
    private boolean last;
    private boolean first;
    private Object sort;
    private int numberOfElements;
    private int size;
    private int number;
    private List<ContentBean> content;

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

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
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
         * pubId : 58afe03e8f2b977b39552748
         * name : PUBLIC
         * introduction : I'm public user.
         * tag : tag
         * avatarUrl : http://x-test.oss-cn-shenzhen.aliyuncs.com/header/58817870526dcd1fea5dbd37/20170122230422.png
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



        private String pubId;
        private String name;
        private String introduction;
        private String tag;
        private String avatarUrl;

        public String getPubId() {
            return pubId;
        }

        public void setPubId(String pubId) {
            this.pubId = pubId;
        }

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


    }
}
