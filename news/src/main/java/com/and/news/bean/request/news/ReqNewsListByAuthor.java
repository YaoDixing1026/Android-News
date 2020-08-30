package com.and.news.bean.request.news;

/**
 * Created by ydx on 17-2-4.
 */

public class ReqNewsListByAuthor {
    private String authorId;
    private int page;
    private int size;

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
