package com.example.qfk;

import static com.example.localdata.alldata_surah.surah_models;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.Models.Aya_Model;
import com.Models.Surah_model;
import com.Models.bookmark_model;
import com.example.localdata.alldata;

import java.util.ArrayList;
import java.util.List;

import Adopters.ayatAdapter;

public class bookmark extends AppCompatActivity {

    TextView title,arabic,u_trans,e_trans;
    RecyclerView rec;
    ArrayList<Aya_Model> aya_modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmark);
        rec=findViewById(R.id.surah_adapter);
        title=findViewById(R.id.title2);
        arabic=findViewById(R.id.arabic);
        u_trans=findViewById(R.id.u_trans);
        e_trans=findViewById(R.id.e_trans);
        aya_modelList=new ArrayList<>();

        for (bookmark_model bm: alldata.bookmarkdata
             ) {
            Surah_model surah_model = surah_models.get(bm.getSurah_id());
            aya_modelList.add(surah_model.ayats.get(bm.getAyt_id()));

        }


        rec.setLayoutManager(new LinearLayoutManager(this));

        ayatAdapter ayatAdapter=new ayatAdapter(this, aya_modelList,-1);
        rec.setAdapter(ayatAdapter);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent= new Intent(bookmark.this,ReadClick.class);
        startActivity(intent);
    }
}