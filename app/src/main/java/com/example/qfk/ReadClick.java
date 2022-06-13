package com.example.qfk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ReadClick extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_click);
        bottomNavigationView = findViewById(R.id.bottomNavigationLayout);
        getSupportActionBar().hide();
        setBottomNavigationListener();

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
    private void setBottomNavigationListener() {
        bottomNavigationView.setSelectedItemId(R.id.Read_it);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finishAffinity();
//                        Intent intent= new Intent(Kalma_read_click.this,MainActivity.class);
//                        startActivity(intent);
                        break;
                    case R.id.Read_it:
                        return  true;
                    case R.id.video_listen:
                        startActivity(new Intent(getApplicationContext(), ListenClick.class));
                        finishAffinity();
                        return false;
                    case R.id.book_mark:
                        startActivity(new Intent(getApplicationContext(), Surah_read_click.class));
                        finishAffinity();
//                        Intent intent1= new Intent(Kalma_read_click.this,MainActivity.class);
//                        startActivity(intent1);
                        break;
                    case R.id.more:
                        startActivity(new Intent(getApplicationContext(), Dua_read_click.class));
                        finishAffinity();
                        break;
                }
                return false;
            }
        });
    }
}