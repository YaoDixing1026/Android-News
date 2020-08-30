package com.and.news.bean.response.life;

import java.util.List;

/**
 * Created by ydx on 17-6-27.
 */

public class RespLifeCarousel {

    /**
     * content : [{"id":"5951d00c526dcd3f190801de","title":"出个价","channel":"生活模块","channelId":"life","photoUrl":"http://x-test.oss-cn-shenzhen.aliyuncs.com/post/92eed0e4-bc1f-4829-9a5f-c113d0951c141497943317739.png","position":1,"referenceType":"post","referenceId":"5948cd48526dcd77c560aa25","status":true,"createAt":"2017-06-27T03:25:04Z"}]
     * last : true
     * totalElements : 1
     * totalPages : 1
     * sort : [{"direction":"ASC","property":"position","ignoreCase":false,"nullHandling":"NATIVE","descending":false,"ascending":true},{"direction":"DESC","property":"createAt","ignoreCase":false,"nullHandling":"NATIVE","descending":true,"ascending":false}]
     * numberOfElements : 1
     * first : true
     * size : 100
     * number : 0
     */

    private boolean last;
    private int totalElements;
    private int totalPages;
    private int numberOfElements;
    private boolean first;
    private int size;
    private int number;
    private List<ContentBean> content;
    private List<SortBean> sort;

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
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
         * id : 5951d00c526dcd3f190801de
         * title : 出个价
         * channel : 生活模块
         * channelId : life
         * photoUrl : http://x-test.oss-cn-shenzhen.aliyuncs.com/post/92eed0e4-bc1f-4829-9a5f-c113d0951c141497943317739.png
         * position : 1
         * referenceType : post
         * referenceId : 5948cd48526dcd77c560aa25
         * status : true
         * createAt : 2017-06-27T03:25:04Z
         */

        private String id;
        private String title;
        private String channel;
        private String channelId;
        private String photoUrl;
        private int position;
        private String referenceType;
        private String referenceId;
        private boolean status;
        private String createAt;

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

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getChannelId() {
            return channelId;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public String getPhotoUrl() {
            return photoUrl;
        }

        public void setPhotoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public String getReferenceType() {
            return referenceType;
        }

        public void setReferenceType(String referenceType) {
            this.referenceType = referenceType;
        }

        public String getReferenceId() {
            return referenceId;
        }

        public void setReferenceId(String referenceId) {
            this.referenceId = referenceId;
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

    public static class SortBean {
        /**
         * direction : ASC
         * property : position
         * ignoreCase : false
         * nullHandling : NATIVE
         * descending : false
         * ascending : true
         */

        private String direction;
        private String property;
        private boolean ignoreCase;
        private String nullHandling;
        private boolean descending;
        private boolean ascending;

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

        public boolean isDescending() {
            return descending;
        }

        public void setDescending(boolean descending) {
            this.descending = descending;
        }

        public boolean isAscending() {
            return ascending;
        }

        public void setAscending(boolean ascending) {
            this.ascending = ascending;
        }
    }
}
