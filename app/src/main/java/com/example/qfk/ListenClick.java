package com.example.qfk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ListenClick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen_click);
        getSupportActionBar().hide();


        Button listn_surah=(Button) findViewById(R.id.Surah_read);
        Button listn_kalma=(Button) findViewById(R.id.kalma_read);
        Button listn_dua=(Button) findViewById(R.id.Dua_read);

        Intent LS = new Intent(ListenClick.this, Surah_listen_click.class);
        Intent  LK= new Intent(ListenClick.this,Kalma_listen_click.class);
        Intent LD= new Intent(ListenClick.this,Dua_listen_click.class);

        listn_surah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              ListenClick.this.startActivity(LS);
            }
        });

        listn_kalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListenClick.this.startActivity(LK);
            }
        });
        listn_dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              ListenClick.this.startActivity(LD);
            }
        });

    }
}