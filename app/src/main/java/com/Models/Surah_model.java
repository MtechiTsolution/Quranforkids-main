package com.Models;

import java.util.ArrayList;
import java.util.List;

public class Surah_model {

    public String titile;
    public String arabic_tittle;
    public String sr_no_surah;
    public String title22;
    public String arabicc;
    public String e_transalationn;
    public String u_translationn;
     public ArrayList<Aya_Model> ayats;

    public Surah_model(String titile, String sr_no_surah,
                       String arabic_tittle, String title22, String arabicc,
                       String e_transalationn, String u_translationn,ArrayList<Aya_Model> ayats) {
        this.titile = titile;
        this.arabic_tittle = arabic_tittle;
        this.title22 = title22;
        this.arabicc = arabicc;
        this.sr_no_surah = sr_no_surah;
        this.e_transalationn = e_transalationn;
        this.u_translationn = u_translationn;
        this.ayats=ayats;
    }
}
