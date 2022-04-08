package com.example.qfk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Kalma_read_click extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalma_read_click);
        getSupportActionBar().hide();
        LinearLayout first_kalma =(LinearLayout) findViewById(R.id.kalma_one);
        LinearLayout second_kalma=(LinearLayout) findViewById(R.id.kalma_two);
        LinearLayout third_kalma=(LinearLayout) findViewById(R.id.kalma_three);
        LinearLayout fourth_kalma=(LinearLayout) findViewById(R.id.kalma_four);
        LinearLayout fifth_kalma=(LinearLayout) findViewById(R.id.kalma_five);
        LinearLayout sixth_kalma=(LinearLayout) findViewById(R.id.kalma_six);

        Intent FK = new Intent(Kalma_read_click.this, pehla_kalma.class);
        Intent SK = new Intent(Kalma_read_click.this, Second_kalma.class);
        Intent TK = new Intent(Kalma_read_click.this, Third_kalma.class);
        Intent FRK = new Intent(Kalma_read_click.this, Fourth_kalma.class);
        Intent FVK = new Intent(Kalma_read_click.this, Fifth_kalma.class);
        Intent SXK = new Intent(Kalma_read_click.this, Six_kalma.class);

        first_kalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kalma_read_click.this.startActivity(FK);
            }
        });
        second_kalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kalma_read_click.this.startActivity(SK);

            }
        });
       third_kalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kalma_read_click.this.startActivity(TK);
            }
        });
        fourth_kalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kalma_read_click.this.startActivity(FRK);
            }
        });
        fifth_kalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kalma_read_click.this.startActivity(FVK);
            }
        });
        sixth_kalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kalma_read_click.this.startActivity(SXK);
            }
        });
    }
}