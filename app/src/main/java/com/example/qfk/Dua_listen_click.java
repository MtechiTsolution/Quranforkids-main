package com.example.qfk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Dua_listen_click extends AppCompatActivity implements View.OnClickListener {
    int appdatadescipl ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua_listen_click);
        getSupportActionBar().hide();

        LinearLayout l1 = (LinearLayout) findViewById(R.id.dua1);
        l1.setOnClickListener(this);


        LinearLayout l2 = (LinearLayout) findViewById(R.id.dua2);
        l2.setOnClickListener(this);

        LinearLayout l3 = (LinearLayout) findViewById(R.id.dua3);
        l3.setOnClickListener(this);

        LinearLayout l4 = (LinearLayout) findViewById(R.id.dua4);
        l4.setOnClickListener(this);

        LinearLayout l5 = (LinearLayout) findViewById(R.id.dua5);
        l5.setOnClickListener(this);

        LinearLayout l6 = (LinearLayout) findViewById(R.id.dua6);
        l6.setOnClickListener(this);

        LinearLayout l7 = (LinearLayout) findViewById(R.id.dua7);
        l7.setOnClickListener(this);

        LinearLayout l8 = (LinearLayout) findViewById(R.id.dua8);
        l8.setOnClickListener(this);

        LinearLayout l9 = (LinearLayout) findViewById(R.id.dua9);
        l9.setOnClickListener(this);

        LinearLayout l10 = (LinearLayout) findViewById(R.id.dua10);
        l10.setOnClickListener(this);

        LinearLayout l11 = (LinearLayout) findViewById(R.id.dua11);
        l11.setOnClickListener(this);

        LinearLayout l12 = (LinearLayout) findViewById(R.id.dua12);
        l12.setOnClickListener(this);

        LinearLayout l13 = (LinearLayout) findViewById(R.id.dua13);
        l13.setOnClickListener(this);

        LinearLayout l14 = (LinearLayout) findViewById(R.id.dua14);
        l14.setOnClickListener(this);

        LinearLayout l15 = (LinearLayout) findViewById(R.id.dua15);
        l15.setOnClickListener(this);

        LinearLayout l16 = (LinearLayout) findViewById(R.id.dua16);
        l16.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.dua1: {
                appdatadescipl=1;
                Toast.makeText(this, "dua 1", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Dua_listen_click.this,Video_Act.class);
                intent.putExtra("dua" , "data");
                intent.putExtra("dd" , appdatadescipl);
                startActivity(intent);
                break;
            }
            case R.id.dua2: {
                appdatadescipl=2;
                Toast.makeText(this, "Kalma 2", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Dua_listen_click.this,Video_Act.class);
                intent1.putExtra("data" , "mydata");
                intent1.putExtra("no" , appdatadescipl);
                startActivity(intent1);
                break;
            }
            case R.id.dua3:
                appdatadescipl=3;

                Toast.makeText(this, "Kalma 3", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Dua_listen_click.this,Video_Act.class);
                intent2.putExtra("data" , "mydata");
                intent2.putExtra("data" , "mydata");
                intent2.putExtra("no" , appdatadescipl);
                startActivity(intent2);
                break;
            case R.id.dua4:
                appdatadescipl=4;

                Toast.makeText(this, "Kalma 4", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Dua_listen_click.this,Video_Act.class);
                intent3.putExtra("data" , "mydata");
                intent3.putExtra("no" , appdatadescipl);
                startActivity(intent3);
                break;
            case R.id.dua5:
                appdatadescipl=5;

                Toast.makeText(this, "Kalma 5", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(Dua_listen_click.this,Video_Act.class);
                intent4.putExtra("data" , "mydata");
                intent4.putExtra("no" , appdatadescipl);
                startActivity(intent4);
                break;
            case R.id.dua6:
                appdatadescipl=6;

                Toast.makeText(this, "Kalma 6", Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(Dua_listen_click.this,Video_Act.class);
                intent5.putExtra("data" , "mydata");
                intent5.putExtra("no" , appdatadescipl);
                startActivity(intent5);
                break;
            case R.id.dua7:
                appdatadescipl=7;

                Toast.makeText(this, "Kalma 6", Toast.LENGTH_SHORT).show();
                Intent intent6 = new Intent(Dua_listen_click.this,Video_Act.class);
                intent6.putExtra("data" , "mydata");
                intent6.putExtra("no" , appdatadescipl);
                startActivity(intent6);
                break;
            case R.id.dua8:
                appdatadescipl=8;

                Toast.makeText(this, "Kalma 6", Toast.LENGTH_SHORT).show();
                Intent intent7 = new Intent(Dua_listen_click.this,Video_Act.class);
                intent7.putExtra("data" , "mydata");
                intent7.putExtra("no" , appdatadescipl);
                startActivity(intent7);
                break;
            case R.id.dua9:
                appdatadescipl=9;

                Toast.makeText(this, "Kalma 6", Toast.LENGTH_SHORT).show();
                Intent intent8 = new Intent(Dua_listen_click.this,Video_Act.class);
                intent8.putExtra("data" , "mydata");
                intent8.putExtra("no" , appdatadescipl);
                startActivity(intent8);
                break;
            case R.id.dua10:
                appdatadescipl=10;

                Toast.makeText(this, "Kalma 6", Toast.LENGTH_SHORT).show();
                Intent intent9 = new Intent(Dua_listen_click.this,Video_Act.class);
                intent9.putExtra("data" , "mydata");
                intent9.putExtra("no" , appdatadescipl);
                startActivity(intent9);
                break;
            case R.id.dua11:
                appdatadescipl=11;

                Toast.makeText(this, "Kalma 6", Toast.LENGTH_SHORT).show();
                Intent intent10 = new Intent(Dua_listen_click.this,Video_Act.class);
                intent10.putExtra("data" , "mydata");
                intent10.putExtra("no" , appdatadescipl);
                startActivity(intent10);
                break;
            case R.id.dua12:
                appdatadescipl=12;

                Toast.makeText(this, "Kalma 6", Toast.LENGTH_SHORT).show();
                Intent intent11 = new Intent(Dua_listen_click.this,Video_Act.class);
                intent11.putExtra("data" , "mydata");
                intent11.putExtra("no" , appdatadescipl);
                startActivity(intent11);
                break;
            case R.id.dua13:
                appdatadescipl=13;

                Toast.makeText(this, "Kalma 6", Toast.LENGTH_SHORT).show();
                Intent intent12 = new Intent(Dua_listen_click.this,Video_Act.class);
                intent12.putExtra("data" , "mydata");
                intent12.putExtra("no" , appdatadescipl);
                startActivity(intent12);
                break;
            case R.id.dua14:
                appdatadescipl=14;

                Toast.makeText(this, "Kalma 6", Toast.LENGTH_SHORT).show();
                Intent intent13 = new Intent(Dua_listen_click.this,Video_Act.class);
                intent13.putExtra("data" , "mydata");
                intent13.putExtra("no" , appdatadescipl);
                startActivity(intent13);
                break;
            case R.id.dua15:
                appdatadescipl=15;

                Toast.makeText(this, "Kalma 6", Toast.LENGTH_SHORT).show();
                Intent intent14 = new Intent(Dua_listen_click.this,Video_Act.class);
                intent14.putExtra("data" , "mydata");
                intent14.putExtra("no" , appdatadescipl);
                startActivity(intent14);
                break;
            case R.id.dua16:
                appdatadescipl=16;

                Toast.makeText(this, "Kalma 6", Toast.LENGTH_SHORT).show();
                Intent intent15 = new Intent(Dua_listen_click.this,Video_Act.class);
                intent15.putExtra("data" , "mydata");
                intent15.putExtra("no" , appdatadescipl);
                startActivity(intent15);
                break;
            default:
                break;
        }
    }

}
