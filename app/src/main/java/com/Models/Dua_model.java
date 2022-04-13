package com.Models;


public class Dua_model {

    public String titile;
    public String etransaltion;
    public String title2;
    public String arabic;
    public String e_transalation;
    public String u_translation;
    public int image;
   public  int id;

    public Dua_model( String tItle, String descriptio,
                      String title2,String arabic,String e_transalation,String u_translation,int image ) {

        this.titile = tItle;
        this.etransaltion = descriptio;
        this.title2=title2;
        this.arabic=arabic;
        this.e_transalation=e_transalation;
        this.u_translation=u_translation;
        this.image=image;
        this.id=id;
    }

}