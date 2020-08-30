package com.and.news.bean.response.bible;


import com.and.news.bean.entity.bible.BibleContent;

import java.util.List;

/**
 * Created by ydx on 17-2-17.
 */

public class RespBibleChapter {

    private List<BibleContent> result;

    public List<BibleContent> getResult() {
        return result;
    }

    public void setResult(List<BibleContent> result) {
        this.result = result;
    }

}
