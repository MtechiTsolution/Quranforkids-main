package com.Models;

public class surah_video_model {

    public int image;
    public  String title_video;
    public  String arabic_title;

    public surah_video_model(int image, String title_video,String arabic_title) {
        this.image = image;
        this.title_video = title_video;
        this.arabic_title = arabic_title;
    }

    public String getArabic_title() {
        return arabic_title;
    }

    public void setArabic_title(String arabic_title) {
        this.arabic_title = arabic_title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle_video() {
        return title_video;
    }

    public void setTitle_video(String title_video) {
        this.title_video = title_video;
    }
}
