package com.and.news.bean.entity.bible;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ydx on 17-2-17.
 */

public class BibleVolume implements Parcelable {

    /**
     * volume : 创世记
     * volumeSN : 1
     * newOrOld : false
     * chapterCount : 50
     */

    private String volume;
    private int volumeSN;
    private boolean newOrOld;
    private int chapterCount;

    public BibleVolume() {
    }

    protected BibleVolume(Parcel in) {
        volume = in.readString();
        volumeSN = in.readInt();
        newOrOld = in.readByte() != 0;
        chapterCount = in.readInt();
    }

    public static final Creator<BibleVolume> CREATOR = new Creator<BibleVolume>() {
        @Override
        public BibleVolume createFromParcel(Parcel in) {
            return new BibleVolume(in);
        }

        @Override
        public BibleVolume[] newArray(int size) {
            return new BibleVolume[size];
        }
    };

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getVolumeSN() {
        return volumeSN;
    }

    public void setVolumeSN(int volumeSN) {
        this.volumeSN = volumeSN;
    }

    public boolean isNewOrOld() {
        return newOrOld;
    }

    public void setNewOrOld(boolean newOrOld) {
        this.newOrOld = newOrOld;
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(volume);
        dest.writeInt(volumeSN);
        dest.writeByte((byte) (newOrOld ? 1 : 0));
        dest.writeInt(chapterCount);
    }
}
