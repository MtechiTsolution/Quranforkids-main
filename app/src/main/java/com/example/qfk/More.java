package com.example.qfk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class More extends AppCompatActivity {
  CardView c1,c2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        c1= findViewById(R.id.card1);
        c2=findViewById(R.id.card2);
        c3=findViewById(R.id.card3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"Quranforkids@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Contact Us");

        i.putExtra(Intent.EXTRA_TEXT   , "Enter your Name:\t\n Type Your problem here, we will contact with you as soon as possible\n\n");
     try {
    startActivity(Intent.createChooser(i, "Send mail..."));
         } catch (android.content.ActivityNotFoundException ex) {
     Toast.makeText(More.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
}
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(More.this, "check", Toast.LENGTH_SHORT).show();
                    final android.app.AlertDialog.Builder dialogBuilder = new android.app.AlertDialog.Builder(More.this);
                    LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    View customView  = inflater.inflate(R.layout.about, null);
                    Button button=customView.findViewById( R.id.abt );
                    dialogBuilder.setCancelable( true );

                    dialogBuilder.setView(customView);
                    final android.app.AlertDialog dialog= dialogBuilder.show();
                    dialog.show();
                    button.setOnClickListener( new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            onStart();
                            dialog.dismiss();
                        }
                    } );
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                    String shareMessage= "\nLet me recommend you this application\n\n";
                    shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                } catch(Exception e) {
                    //e.toString();
                }
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(More.this,ReadClick.class);
        startActivity(intent);
    }
}