package com.and.news.bean.entity;

import android.graphics.drawable.Drawable;

/**
 * Created by ydx on 17-3-8.
 */

public class ImageEntity {
    Drawable drawable;
    int width;
    int height;

    public ImageEntity() {
    }

    public ImageEntity(Drawable drawable, int width, int height) {
        this.drawable = drawable;
        this.width = width;
        this.height = height;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
