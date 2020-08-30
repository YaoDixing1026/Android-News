package com.and.news.bean.request.favorite;


import com.and.news.bean.entity.ReferenceObject;

import java.util.List;

/**
 * Created by ydx on 17-2-22.
 */

public class ReqDropFavorites {
    private List<ReferenceObject> list;

    public List<ReferenceObject> getList() {
        return list;
    }

    public void setList(List<ReferenceObject> list) {
        this.list = list;
    }


}
