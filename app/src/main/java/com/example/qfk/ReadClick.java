package com.example.qfk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ReadClick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_click);
        getSupportActionBar().hide();


        Button read_surah=(Button) findViewById(R.id.Surah_read);
        Button read_kalma=(Button) findViewById(R.id.kalma_read);
        Button read_dua=(Button) findViewById(R.id.Dua_read);

        Intent RS = new Intent(ReadClick.this, Surah_read_click.class);
        Intent  RK= new Intent(ReadClick.this,Kalma_read_click.class);
        Intent RD= new Intent(ReadClick.this, Dua_read_click.class);

        read_surah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReadClick.this.startActivity(RS);
            }
        });

        read_kalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ReadClick.this.startActivity(RK);
            }
        });
        read_dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              ReadClick.this.startActivity(RD);
            }
        });


    }
}