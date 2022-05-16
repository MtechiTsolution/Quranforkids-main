package com.example.qfk;

import static com.example.localdata.alldata_surah.surah_models;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.localdata.alldata;

import Adopters.myAdapter;
import Adopters.myAdapter2_surah;

public class Surah_read_click extends AppCompatActivity {
    CardView c1;
    RecyclerView rec;
    //static  ArrayList<Dua_model> dua_model=new ArrayList<>();
    int backpress=0;
    // static LinearLayout lm,dm,dm2,dm3,dm4,dm5,dm6,dm7,dm8,dm9,dm10,dm11,dm12,dm13,dm14,dm15,dm16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_surah_read_click);
        rec = findViewById(R.id.recyclersurah);
        rec.setLayoutManager(new LinearLayoutManager(this));

        myAdapter2_surah  myAdapter2_surah=new  myAdapter2_surah(this,surah_models);
        rec.setAdapter(myAdapter2_surah);

    }
    }