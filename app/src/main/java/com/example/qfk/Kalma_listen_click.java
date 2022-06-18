package com.example.qfk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Kalma_listen_click extends AppCompatActivity implements View.OnClickListener {
int appdatadescipl ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalma_listen_click);
        getSupportActionBar().hide();
        Button b1 = (Button) findViewById(R.id.kalma_1);
        b1.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.kalma_2);
        b2.setOnClickListener(this);
        Button b3 = (Button) findViewById(R.id.kalma_3);
        b3.setOnClickListener(this);
        Button b4 = (Button) findViewById(R.id.kalma_4);
        b4.setOnClickListener(this);
        Button b5 = (Button) findViewById(R.id.kalma_5);
        b5.setOnClickListener(this);
        Button b6 = (Button) findViewById(R.id.kalma_6);
        b6.setOnClickListener(this);

    }

    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.kalma_1: {
              appdatadescipl=1;
               // Toast.makeText(this, "Kalma 1", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Kalma_listen_click.this,Video_Act.class);
                intent.putExtra("data" , "mydata");
                intent.putExtra("no" , appdatadescipl);
                startActivity(intent);
                break;
            }
            case R.id.kalma_2: {
                appdatadescipl=2;
               // Toast.makeText(this, "Kalma 2", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Kalma_listen_click.this,Video_Act.class);
                intent1.putExtra("data" , "mydata");
                intent1.putExtra("no" , appdatadescipl);
                startActivity(intent1);
                break;
            }
            case R.id.kalma_3:
                appdatadescipl=3;

              //  Toast.makeText(this, "Kalma 3", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Kalma_listen_click.this,Video_Act.class);
                intent2.putExtra("data" , "mydata");
                intent2.putExtra("data" , "mydata");
                intent2.putExtra("no" , appdatadescipl);
                startActivity(intent2);
                break;
            case R.id.kalma_4:
                appdatadescipl=4;

             //   Toast.makeText(this, "Kalma 4", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Kalma_listen_click.this,Video_Act.class);
                intent3.putExtra("data" , "mydata");
                intent3.putExtra("no" , appdatadescipl);
                startActivity(intent3);
                break;
            case R.id.kalma_5:
                appdatadescipl=5;

               // Toast.makeText(this, "Kalma 5", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(Kalma_listen_click.this,Video_Act.class);
                intent4.putExtra("data" , "mydata");
                intent4.putExtra("no" , appdatadescipl);
                startActivity(intent4);
                break;
            case R.id.kalma_6:
                appdatadescipl=6;

             //   Toast.makeText(this, "Kalma 6", Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(Kalma_listen_click.this,Video_Act.class);
                intent5.putExtra("data" , "mydata");
                intent5.putExtra("no" , appdatadescipl);
                startActivity(intent5);
                break;
            default:
                break;
        }
    }
}