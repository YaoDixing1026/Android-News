package com.and.news.bean.response.bible;


import com.and.news.bean.entity.bible.BibleVolume;

import java.util.List;

/**
 * Created by ydx on 17-2-17.
 */

public class RespBibleVolume {


    /**
     * OldTestament : [{"volume":"创世记","volumeSN":1,"newOrOld":false,"chapterCount":50},{"volume":"出埃及记","volumeSN":2,"newOrOld":false,"chapterCount":40},{"volume":"利未记","volumeSN":3,"newOrOld":false,"chapterCount":27},{"volume":"民数记","volumeSN":4,"newOrOld":false,"chapterCount":36},{"volume":"申命记","volumeSN":5,"newOrOld":false,"chapterCount":34},{"volume":"约书亚记","volumeSN":6,"newOrOld":false,"chapterCount":24},{"volume":"士师记","volumeSN":7,"newOrOld":false,"chapterCount":21},{"volume":"路得记","volumeSN":8,"newOrOld":false,"chapterCount":4},{"volume":"撒母耳记上","volumeSN":9,"newOrOld":false,"chapterCount":31},{"volume":"撒母耳记下","volumeSN":10,"newOrOld":false,"chapterCount":24},{"volume":"列王纪上","volumeSN":11,"newOrOld":false,"chapterCount":22},{"volume":"列王纪下","volumeSN":12,"newOrOld":false,"chapterCount":25},{"volume":"历代志上","volumeSN":13,"newOrOld":false,"chapterCount":29},{"volume":"历代志下","volumeSN":14,"newOrOld":false,"chapterCount":36},{"volume":"以斯拉记","volumeSN":15,"newOrOld":false,"chapterCount":10},{"volume":"尼希米记","volumeSN":16,"newOrOld":false,"chapterCount":13},{"volume":"以斯帖记","volumeSN":17,"newOrOld":false,"chapterCount":10},{"volume":"约伯记","volumeSN":18,"newOrOld":false,"chapterCount":42},{"volume":"诗篇","volumeSN":19,"newOrOld":false,"chapterCount":150},{"volume":"箴言","volumeSN":20,"newOrOld":false,"chapterCount":31},{"volume":"传道书","volumeSN":21,"newOrOld":false,"chapterCount":12},{"volume":"雅歌","volumeSN":22,"newOrOld":false,"chapterCount":8},{"volume":"以赛亚书","volumeSN":23,"newOrOld":false,"chapterCount":66},{"volume":"耶利米书","volumeSN":24,"newOrOld":false,"chapterCount":52},{"volume":"耶利米哀歌","volumeSN":25,"newOrOld":false,"chapterCount":5},{"volume":"以西结书","volumeSN":26,"newOrOld":false,"chapterCount":48},{"volume":"但以理书","volumeSN":27,"newOrOld":false,"chapterCount":12},{"volume":"何西阿书","volumeSN":28,"newOrOld":false,"chapterCount":14},{"volume":"约珥书","volumeSN":29,"newOrOld":false,"chapterCount":3},{"volume":"阿摩司书","volumeSN":30,"newOrOld":false,"chapterCount":9},{"volume":"俄巴底亚书","volumeSN":31,"newOrOld":false,"chapterCount":1},{"volume":"约拿书","volumeSN":32,"newOrOld":false,"chapterCount":4},{"volume":"弥迦书","volumeSN":33,"newOrOld":false,"chapterCount":7},{"volume":"那鸿书","volumeSN":34,"newOrOld":false,"chapterCount":3},{"volume":"哈巴谷书","volumeSN":35,"newOrOld":false,"chapterCount":3},{"volume":"西番雅书","volumeSN":36,"newOrOld":false,"chapterCount":3},{"volume":"哈该书","volumeSN":37,"newOrOld":false,"chapterCount":2},{"volume":"撒迦利亚书","volumeSN":38,"newOrOld":false,"chapterCount":14},{"volume":"玛拉基书","volumeSN":39,"newOrOld":false,"chapterCount":4}]
     * updateAt : 2017-02-17T01:00:00Z
     * TestamentFragment : [{"volume":"马太福音","volumeSN":40,"newOrOld":true,"chapterCount":28},{"volume":"马可福音","volumeSN":41,"newOrOld":true,"chapterCount":16},{"volume":"路加福音","volumeSN":42,"newOrOld":true,"chapterCount":24},{"volume":"约翰福音","volumeSN":43,"newOrOld":true,"chapterCount":21},{"volume":"使徒行传","volumeSN":44,"newOrOld":true,"chapterCount":28},{"volume":"罗马书","volumeSN":45,"newOrOld":true,"chapterCount":16},{"volume":"哥林多前书","volumeSN":46,"newOrOld":true,"chapterCount":16},{"volume":"哥林多后书","volumeSN":47,"newOrOld":true,"chapterCount":13},{"volume":"加拉太书","volumeSN":48,"newOrOld":true,"chapterCount":6},{"volume":"以弗所书","volumeSN":49,"newOrOld":true,"chapterCount":6},{"volume":"腓立比书","volumeSN":50,"newOrOld":true,"chapterCount":4},{"volume":"歌罗西书","volumeSN":51,"newOrOld":true,"chapterCount":4},{"volume":"帖撒罗尼迦前书","volumeSN":52,"newOrOld":true,"chapterCount":5},{"volume":"帖撒罗尼迦后书","volumeSN":53,"newOrOld":true,"chapterCount":3},{"volume":"提摩太前书","volumeSN":54,"newOrOld":true,"chapterCount":6},{"volume":"提摩太后书","volumeSN":55,"newOrOld":true,"chapterCount":4},{"volume":"提多书","volumeSN":56,"newOrOld":true,"chapterCount":3},{"volume":"腓利门书","volumeSN":57,"newOrOld":true,"chapterCount":1},{"volume":"希伯来书","volumeSN":58,"newOrOld":true,"chapterCount":13},{"volume":"雅各书","volumeSN":59,"newOrOld":true,"chapterCount":5},{"volume":"彼得前书","volumeSN":60,"newOrOld":true,"chapterCount":5},{"volume":"彼得后书","volumeSN":61,"newOrOld":true,"chapterCount":3},{"volume":"约翰壹书","volumeSN":62,"newOrOld":true,"chapterCount":5},{"volume":"约翰贰书","volumeSN":63,"newOrOld":true,"chapterCount":1},{"volume":"约翰叁书","volumeSN":64,"newOrOld":true,"chapterCount":1},{"volume":"犹大书","volumeSN":65,"newOrOld":true,"chapterCount":1},{"volume":"启示录","volumeSN":66,"newOrOld":true,"chapterCount":22}]
     */

    private String updateAt;
    private List<BibleVolume> OldTestament;
    private List<BibleVolume> NewTestament;

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public List<BibleVolume> getOldTestament() {
        return OldTestament;
    }

    public void setOldTestament(List<BibleVolume> OldTestament) {
        this.OldTestament = OldTestament;
    }

    public List<BibleVolume> getNewTestament() {
        return NewTestament;
    }

    public void setNewTestament(List<BibleVolume> NewTestament) {
        this.NewTestament = NewTestament;
    }


}
