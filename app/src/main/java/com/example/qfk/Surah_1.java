package com.example.qfk;

import static com.example.localdata.alldata_surah.surah_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.Models.Dua_model;
import com.Models.Surah_model;
import com.example.localdata.alldata;
import com.example.localdata.alldata_surah;

public class Surah_1 extends AppCompatActivity {
    TextView title,arabic,u_trans,e_trans;
   // ImageView imageView;
    int posotion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah1);
        getSupportActionBar().hide();
        title=findViewById(R.id.title2);
        arabic=findViewById(R.id.arabic);
        u_trans=findViewById(R.id.u_trans);
        e_trans=findViewById(R.id.e_trans);
       // imageView=findViewById(R.id.image);


        Intent intent=getIntent();
        int intValue = intent.getIntExtra("id", 0);
      //  Surah_model surah_model= alldata.surah_models.get(intValue);
            Surah_model surah_model = surah_models.get(intValue);

        title.setText(surah_model.title22);
        arabic.setText(surah_model.arabicc);
        e_trans.setText(surah_model.e_transalationn);
        u_trans.setText(surah_model.u_translationn);
       // imageView.setImageResource(dua_model.image);




    }
}