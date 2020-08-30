package com.and.news.bean.response.favorite;


import com.and.news.bean.entity.Favorite;

import java.util.List;

/**
 * Created by ydx on 17-2-9.
 */

public class RespFavoriteList {

    /**
     * content : [{"createAt":"2017-02-08T01:30:38.282Z","id":"string","referenceId":"string","referenceType":"string","status":true,"title":"string","userId":"string"}]
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
    private SortBean sort;
    private int totalElements;
    private int totalPages;
    private List<Favorite> content;

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

    public SortBean getSort() {
        return sort;
    }

    public void setSort(SortBean sort) {
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

    public List<Favorite> getContent() {
        return content;
    }

    public void setContent(List<Favorite> content) {
        this.content = content;
    }

    public static class SortBean {
    }


}
