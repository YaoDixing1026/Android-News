package com.and.news.bean.entity.bible;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ydx on 17-2-17.
 */

public class BibleContent implements Parcelable {

    /**
     * lection : 耶和华神使各样的树从地里长出来，可以悦人的眼目，其上的果子好作食物。园子当中又有生命树和分别善恶的树。
     * verse : 9
     */

    private String lection;
    private int verse;

    protected BibleContent(Parcel in) {
        lection = in.readString();
        verse = in.readInt();
    }

    public static final Creator<BibleContent> CREATOR = new Creator<BibleContent>() {
        @Override
        public BibleContent createFromParcel(Parcel in) {
            return new BibleContent(in);
        }

        @Override
        public BibleContent[] newArray(int size) {
            return new BibleContent[size];
        }
    };

    public String getLection() {
        return lection;
    }

    public void setLection(String lection) {
        this.lection = lection;
    }

    public int getVerse() {
        return verse;
    }

    public void setVerse(int verse) {
        this.verse = verse;
    }

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(lection);
        dest.writeInt(verse);
    }
}
