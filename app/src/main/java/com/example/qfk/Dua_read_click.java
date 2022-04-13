package com.example.qfk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.Models.Dua_model;
import com.example.localdata.alldata;

import java.util.ArrayList;

import Adopters.myAdapter;

public class Dua_read_click extends AppCompatActivity {
     CardView c1;
     RecyclerView rec;
     //static  ArrayList<Dua_model> dua_model=new ArrayList<>();
    int backpress=0;
   // static LinearLayout lm,dm,dm2,dm3,dm4,dm5,dm6,dm7,dm8,dm9,dm10,dm11,dm12,dm13,dm14,dm15,dm16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dua_read_click);
        rec = findViewById(R.id.recycler);
        rec.setLayoutManager(new LinearLayoutManager(this));


        myAdapter myAdapter=new myAdapter(this,alldata.dua_model);
        rec.setAdapter(myAdapter);
    }
}