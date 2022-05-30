package com.example.qfk;

import static com.example.localdata.alldata_surah.surah_models;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.Models.Kalmat_model;
import com.Models.surah_video_model;
import com.example.localdata.alldata;
import com.example.localdata.alldata_kalmat;
import com.example.localdata.alldata_surahvideo;


import Adopters.myAdapter;
import Adopters.myAdapter2_surah;
import Adopters.surah_video_Adapter;

public class Surah_listen_click extends AppCompatActivity {
    RecyclerView rec;
    TextView textView;
    //static  ArrayList<Dua_model> dua_model=new ArrayList<>();
    int backpress=0;
    // static LinearLayout lm,dm,dm2,dm3,dm4,dm5,dm6,dm7,dm8,dm9,dm10,dm11,dm12,dm13,dm14,dm15,dm16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_surah_listen_click);

        rec = findViewById(R.id.recycle_video);
        rec.setLayoutManager(new LinearLayoutManager(this));




        surah_video_Adapter surah_video_adapter =
                new surah_video_Adapter(this, alldata_surahvideo.video_models);
        Toast.makeText(this, "checkadapter", Toast.LENGTH_SHORT).show();
        rec.setAdapter(surah_video_adapter);
//        myAdapter2_surah myAdapter2_surah=new  myAdapter2_surah(this,surah_models);
//        rec.setAdapter(myAdapter2_surah);

    }
}