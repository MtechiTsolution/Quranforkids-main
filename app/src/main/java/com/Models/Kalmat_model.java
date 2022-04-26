package com.Models;

public class Kalmat_model {

    public String titile;
    public  String color;
    public String arabic_tittle;
    public String sr_no_surah;
    public String title22;
    public String arabicc;
    public String e_transalationn;
    public String u_translationn;

    public Kalmat_model(String titile, String arabic_tittle,
                        String sr_no_surah, String title22,
                        String arabicc, String e_transalationn,
                        String u_translationn, String color) {
        this.titile = titile;
        this.arabic_tittle = arabic_tittle;
        this.sr_no_surah = sr_no_surah;
        this.title22 = title22;
        this.arabicc = arabicc;
        this.e_transalationn = e_transalationn;
        this.u_translationn = u_translationn;
        this.color = color;
    }
}
