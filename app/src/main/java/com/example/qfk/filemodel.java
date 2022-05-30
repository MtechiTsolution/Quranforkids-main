package com.example.qfk;

public class filemodel {
    String title,url;

    public filemodel(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public filemodel(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
