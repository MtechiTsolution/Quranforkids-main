package com.Models;

public class bookmark_model {
    int ayt_id;
    int surah_id;

    public bookmark_model(int ayt_id, int surah_id) {
        this.ayt_id = ayt_id;
        this.surah_id = surah_id;
    }

    public int getAyt_id() {
        return ayt_id;
    }

    public void setAyt_id(int ayt_id) {
        this.ayt_id = ayt_id;
    }

    public int getSurah_id() {
        return surah_id;
    }

    public void setSurah_id(int surah_id) {
        this.surah_id = surah_id;
    }
}
