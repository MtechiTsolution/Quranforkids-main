package com.Models;


import android.graphics.Color;

public class Dua_model {

    public String titile;
    public String etransaltion;
    public String title2;
    public String arabic;
    public String e_transalation;
    public String u_translation;
    public int image;
   public  int id;
  // public int colo
    public int color;


    public Dua_model( String tItle, String descriptio,
                      String title2,String arabic,String e_transalation,String u_translation,int image,int color ) {

        this.titile = tItle;
        this.etransaltion = descriptio;
        this.title2=title2;
        this.arabic=arabic;
        this.e_transalation=e_transalation;
        this.u_translation=u_translation;
        this.image=image;
        this.id=id;

       // this.color= color;

        this.color=color;

    }

}