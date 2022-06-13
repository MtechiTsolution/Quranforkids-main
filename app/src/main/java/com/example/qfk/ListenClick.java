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

public class ListenClick extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen_click);
        getSupportActionBar().hide();
        bottomNavigationView = findViewById(R.id.bottomNavigationLayout);
        setBottomNavigationListener();
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
    private void setBottomNavigationListener() {
        bottomNavigationView.setSelectedItemId(R.id.video_listen);
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
                        startActivity(new Intent(getApplicationContext(), ReadClick.class));
                        finishAffinity();
                        return  true;
                    case R.id.video_listen:

                        return true;
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