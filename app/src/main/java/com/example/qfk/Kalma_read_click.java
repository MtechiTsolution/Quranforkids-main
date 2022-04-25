package com.example.qfk;

import static com.example.localdata.alldata_surah.surah_models;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.Models.Dua_model;
import com.Models.Kalmat_model;
import com.example.localdata.alldata;
import com.example.localdata.alldata_kalmat;

import Adopters.myAdapter;
import Adopters.myAdapter2_surah;
import Adopters.myAdapter3_kalmat;

public class Kalma_read_click extends AppCompatActivity {
    CardView c1;
    RecyclerView rec;
    //static  ArrayList<Dua_model> dua_model=new ArrayList<>();
    int backpress=0;
    // static LinearLayout lm,dm,dm2,dm3,dm4,dm5,dm6,dm7,dm8,dm9,dm10,dm11,dm12,dm13,dm14,dm15,dm16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_kalma_read_click);
        rec = findViewById(R.id.recycler_kalma);
        rec.setLayoutManager(new GridLayoutManager(this,2));
        myAdapter3_kalmat myAdapter3_kalmat = new myAdapter3_kalmat(this, alldata_kalmat.kalmat_models);
        rec.setAdapter(myAdapter3_kalmat);
    }
}