package com.example.qfk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Dua_read_click extends AppCompatActivity {
CardView c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_dua_read_click);
        c1= findViewById(R.id.card_2);
        LinearLayout one_d =(LinearLayout) findViewById(R.id.dua_one);
        LinearLayout two_d =(LinearLayout) findViewById(R.id.dua_two);
        LinearLayout three_d =(LinearLayout) findViewById(R.id.dua_three);
        LinearLayout four_d =(LinearLayout) findViewById(R.id.dua_four);
        LinearLayout five_d =(LinearLayout) findViewById(R.id.dua_five);
        LinearLayout six_d =(LinearLayout) findViewById(R.id.dua_six);
        LinearLayout seven_d =(LinearLayout) findViewById(R.id.dua_seven);
        LinearLayout eight_d =(LinearLayout) findViewById(R.id.dua_eight);
        LinearLayout nine_d =(LinearLayout) findViewById(R.id.dua_nine);
        LinearLayout ten_d =(LinearLayout) findViewById(R.id.dua_ten);
        LinearLayout eleven_d =(LinearLayout) findViewById(R.id.dua_eleven);
        LinearLayout twelve_d =(LinearLayout) findViewById(R.id.dua_twelve);
        LinearLayout thirteen_d =(LinearLayout) findViewById(R.id.dua_thirteen);
        LinearLayout fourteen_d =(LinearLayout) findViewById(R.id.dua_fourteen);
        LinearLayout fifteen_d =(LinearLayout) findViewById(R.id.dua_fifteen);
        LinearLayout sixteen_d =(LinearLayout) findViewById(R.id.dua_sixteen);





        Intent D1= new Intent(Dua_read_click.this,Dua_1.class);
        Intent D2= new Intent(Dua_read_click.this,Dua_2.class);
        Intent D3= new Intent(Dua_read_click.this,Dua_3.class);
        Intent D4= new Intent(Dua_read_click.this,Dua_4.class);
        Intent D5= new Intent(Dua_read_click.this,Dua_5.class);
        Intent D6= new Intent(Dua_read_click.this,Dua_6.class);
        Intent D7= new Intent(Dua_read_click.this,Dua_7.class);
        Intent D8= new Intent(Dua_read_click.this,Dua_8.class);
        Intent D9= new Intent(Dua_read_click.this,Dua_9.class);
        Intent D10= new Intent(Dua_read_click.this,Dua_10.class);
        Intent D11= new Intent(Dua_read_click.this,Dua_11.class);
        Intent D12= new Intent(Dua_read_click.this,Dua_12.class);
        Intent D13= new Intent(Dua_read_click.this,Dua_13.class);
        Intent D14= new Intent(Dua_read_click.this,Dua_14.class);
        Intent D15= new Intent(Dua_read_click.this,Dua_15.class);
        Intent D16= new Intent(Dua_read_click.this,Dua_16.class);








        one_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D1);
            }
        });

        two_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D2);
            }
        });

        three_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D3);
            }
        });

        four_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D4);
            }
        });

        five_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D5);
            }
        });

        six_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D6);
            }
        });
        seven_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D7);
            }
        });

        eight_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D8);
            }
        });

        nine_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D9);
            }
        });

        ten_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D10);
            }
        });

        eleven_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D11);
            }
        });

        twelve_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D12);
            }
        });

        thirteen_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D13);
            }
        });

      fourteen_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D14);
            }
        });

        fifteen_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D15);
            }
        });


        sixteen_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dua_read_click.this.startActivity(D16);
            }
        });







    }
}