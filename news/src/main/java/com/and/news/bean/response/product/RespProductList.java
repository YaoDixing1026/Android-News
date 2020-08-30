package com.and.news.bean.response.product;

import com.and.news.bean.entity.product.ProductItemBean;

import java.util.List;

/**
 * Created by ydx on 17-9-11.
 */

public class RespProductList {


    /**
     * content : [{"id":"59b74ff0526dcd63a559c084","merchantId":"59b74fe2526dcd63a559c082","title":"现摘陕西脆甜李子 5-8斤 ［单果100g－160g］ 黑布林 香甜可口 新鲜时令水果","cover":["http://x-test.oss-cn-shenzhen.aliyuncs.com/temp/%E9%BB%91%E5%B8%83%E6%9E%97.jpeg","http://x-test.oss-cn-shenzhen.aliyuncs.com/temp/%E6%9D%8E%E5%AD%902.jpeg"],"price":912,"currency":"cny","originPrice":1801,"phone":"1231212312","detail":"现摘现取，新鲜到家，产自秦岭，纯天然自然环境下生长\n，带您享受大自然原生态的馈赠。黑不林李子现摘现取，\n清香脆甜，味浓香溢，唇齿留香，让您流连忘返。陕西秦\n岭山黑布林李子颗颗精选，独特的地理环境种值.\n真正的清仓 真正的甩货 全场卖两块 买啥都两块 随便挑 随便选 两块钱 你买不了吃亏 两块钱 你买不了上当 真正的物有所值","inventory":500,"sold":0,"diliveryDateFrom":"2017-09-12T03:09:36Z","diliveryDateTo":"2017-09-12T03:09:36Z","diliveryAddress":"楼下","countryName":"中国","cityName":"北京市","category":"吃货","deadline":"2017-09-12T03:09:36Z","createAt":"2017-09-12T03:09:36Z","updateAt":"2017-09-12T03:09:36Z","status":"online"},{"id":"59b74feb526dcd63a559c083","merchantId":"59b74fe2526dcd63a559c082","title":"现摘陕西脆甜李子 5-8斤 ［单果100g－160g］ 黑布林 香甜可口 新鲜时令水果","cover":["http://x-test.oss-cn-shenzhen.aliyuncs.com/temp/%E9%BB%91%E5%B8%83%E6%9E%97.jpeg","http://x-test.oss-cn-shenzhen.aliyuncs.com/temp/%E6%9D%8E%E5%AD%902.jpeg"],"price":912,"currency":"cny","originPrice":1801,"phone":"1231212312","detail":"现摘现取，新鲜到家，产自秦岭，纯天然自然环境下生长\n，带您享受大自然原生态的馈赠。黑不林李子现摘现取，\n清香脆甜，味浓香溢，唇齿留香，让您流连忘返。陕西秦\n岭山黑布林李子颗颗精选，独特的地理环境种值.\n真正的清仓 真正的甩货 全场卖两块 买啥都两块 随便挑 随便选 两块钱 你买不了吃亏 两块钱 你买不了上当 真正的物有所值","inventory":500,"sold":0,"diliveryDateFrom":"2017-09-12T03:09:31Z","diliveryDateTo":"2017-09-12T03:09:31Z","diliveryAddress":"楼下","countryName":"中国","cityName":"北京市","category":"吃货","deadline":"2017-09-12T03:09:31Z","createAt":"2017-09-12T03:09:31Z","updateAt":"2017-09-12T03:09:31Z","status":"online"}]
     * totalElements : 2
     * totalPages : 1
     * last : true
     * sort : [{"direction":"DESC","property":"createAt","ignoreCase":false,"nullHandling":"NATIVE","ascending":false,"descending":true}]
     * numberOfElements : 2
     * first : true
     * size : 20
     * number : 0
     */

    private int totalElements;
    private int totalPages;
    private boolean last;
    private int numberOfElements;
    private boolean first;
    private int size;
    private int number;
    private List<ProductItemBean> content;
    private List<SortBean> sort;

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

    public List<ProductItemBean> getContent() {
        return content;
    }

    public void setContent(List<ProductItemBean> content) {
        this.content = content;
    }

    public List<SortBean> getSort() {
        return sort;
    }

    public void setSort(List<SortBean> sort) {
        this.sort = sort;
    }


    public static class SortBean {
        /**
         * direction : DESC
         * property : createAt
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
