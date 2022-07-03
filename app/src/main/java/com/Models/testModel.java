package com.Models;

public class testModel {
    public String title;
    public String A_title;
    public String e_title;
    public String title2;
    public String title3;

    public testModel(String title, String a_title, String e_title, String title2, String title3) {
        this.title = title;
        A_title = a_title;
        this.e_title = e_title;
        this.title2 = title2;
        this.title3 = title3;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getA_title() {
        return A_title;
    }

    public void setA_title(String a_title) {
        A_title = a_title;
    }

    public String getE_title() {
        return e_title;
    }

    public void setE_title(String e_title) {
        this.e_title = e_title;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }
}
