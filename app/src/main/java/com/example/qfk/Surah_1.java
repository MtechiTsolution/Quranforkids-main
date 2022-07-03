package com.example.qfk;

import static com.example.localdata.alldata_surah.surah_models;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.Models.Aya_Model;
import com.Models.Dua_model;
import com.Models.Surah_model;
import com.example.localdata.alldata;
import com.example.localdata.alldata_surah;

import Adopters.ayatAdapter;
import Adopters.myAdapter2_surah;

public class Surah_1 extends AppCompatActivity {
    TextView title, arabic, u_trans, e_trans;
    RecyclerView rec;
    // ImageView imageView;
    int posotion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah1);
        getSupportActionBar().hide();
        rec = findViewById(R.id.surah_adapter);
        title = findViewById(R.id.title2);
        arabic = findViewById(R.id.arabic);
        u_trans = findViewById(R.id.u_trans);
        e_trans = findViewById(R.id.e_trans);

        // imageView=findViewById(R.id.image);


        Intent intent = getIntent();
        int intValue = intent.getIntExtra("id", 0);
        //  Surah_model surah_model= alldata.surah_models.get(intValue);
        Surah_model surah_model = surah_models.get(intValue);

        rec.setLayoutManager(new LinearLayoutManager(this));
        // Toast.makeText(Surah_1.this, ""+surah_model.ayats.size(), Toast.LENGTH_SHORT).show();
        ayatAdapter ayatAdapter = new ayatAdapter(this, surah_model.ayats);
        rec.setAdapter(ayatAdapter);
//
        title.setText(surah_model.arabic_tittle);
//        arabic.setText(surah_model.arabicc);
//        e_trans.setText(surah_model.e_transalationn);
//        u_trans.setText(surah_model.u_translationn);
        // imageView.setImageResource(dua_model.image);


    }
}