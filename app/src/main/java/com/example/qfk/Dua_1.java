package com.example.qfk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.Models.Dua_model;
import com.example.localdata.alldata;

public class Dua_1 extends AppCompatActivity {
 TextView title,arabic,u_trans,e_trans;
 ImageView imageView;
 int posotion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua1);
        getSupportActionBar().hide();
        title=findViewById(R.id.title2);
        arabic=findViewById(R.id.arabic);
        u_trans=findViewById(R.id.u_trans);
        e_trans=findViewById(R.id.e_trans);
        imageView=findViewById(R.id.image);


        Intent intent=getIntent();
        int intValue = intent.getIntExtra("id", 0);
        Dua_model dua_model=alldata.dua_model.get(intValue);

        title.setText(dua_model.title2);
        arabic.setText(dua_model.arabic);
        e_trans.setText(dua_model.e_transalation);
        u_trans.setText(dua_model.u_translation);
        imageView.setImageResource(dua_model.image);




    }
}