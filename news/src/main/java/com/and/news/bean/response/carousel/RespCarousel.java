package com.and.news.bean.response.carousel;

import java.util.List;

/**
 * Created by ydx on 17-2-3.
 */

public class RespCarousel {

    /**
     * content : [{"id":"587850098905b4305f25c9fd","title":"Elon Musk称特斯拉60mph加速可达到2.34秒","channel":"国际","channelId":"5875ddf38905b4305f259ea5","photoUrl":"https://pic.36krcnd.com/avatar/201701/13032719/pqurc50ny6xrmgar.png!heading","position":1,"referenceType":"news","referenceId":"587720568905b4305f25b718","status":true,"createAt":null,"updateAt":null}]
     * totalPages : 1
     * totalElements : 1
     * last : true
     * first : true
     * sort : [{"direction":"ASC","property":"position","ignoreCase":false,"nullHandling":"NATIVE","ascending":true}]
     * numberOfElements : 1
     * size : 100
     * number : 0
     */

    private int totalPages;
    private int totalElements;
    private boolean last;
    private boolean first;
    private int numberOfElements;
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

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
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

    public List<SortBean> getSort() {
        return sort;
    }

    public void setSort(List<SortBean> sort) {
        this.sort = sort;
    }

    public static class ContentBean {
        /**
         * id : 587850098905b4305f25c9fd
         * title : Elon Musk称特斯拉60mph加速可达到2.34秒
         * channel : 国际
         * channelId : 5875ddf38905b4305f259ea5
         * photoUrl : https://pic.36krcnd.com/avatar/201701/13032719/pqurc50ny6xrmgar.png!heading
         * position : 1
         * referenceType : news
         * referenceId : 587720568905b4305f25b718
         * status : true
         * createAt : null
         * updateAt : null
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
        private Object createAt;
        private Object updateAt;

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

    public static class SortBean {
        /**
         * direction : ASC
         * property : position
         * ignoreCase : false
         * nullHandling : NATIVE
         * ascending : true
         */

        private String direction;
        private String property;
        private boolean ignoreCase;
        private String nullHandling;
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

        public boolean isAscending() {
            return ascending;
        }

        public void setAscending(boolean ascending) {
            this.ascending = ascending;
        }
    }
}
