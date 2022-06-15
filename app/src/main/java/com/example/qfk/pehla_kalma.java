package com.example.qfk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.Models.Dua_model;
import com.Models.Kalmat_model;
import com.example.localdata.alldata;
import com.example.localdata.alldata_kalmat;

import java.util.Random;

public class pehla_kalma extends AppCompatActivity {
    TextView title,arabic,u_trans,e_trans;
   // ImageView imageView;
    LinearLayout linearLayout;
    int posotion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pehla_kalma);
        getSupportActionBar().hide();
        title=findViewById(R.id.title2);
        arabic=findViewById(R.id.arabic);
        u_trans=findViewById(R.id.u_trans);
        e_trans=findViewById(R.id.e_trans);
        linearLayout=findViewById(R.id.linear_kalmat);

      //  imageView=findViewById(R.id.image);

//        Random r = new Random();
//        int red=r.nextInt(255 - 0 + 1)+0;
//        int green=r.nextInt(255 - 0 + 1)+0;
//        int blue=r.nextInt(255 - 0 + 1)+0;
//
//        GradientDrawable draw = new GradientDrawable();
//        draw.setShape(GradientDrawable.RECTANGLE);
//        draw.setColor(Color.rgb(red,green,blue));
//        linearLayout.setBackground(draw);

//        Random rr = new Random();
//        int redd=rr.nextInt(2300 - 0 + 1)+0;
//        int bluee=rr.nextInt(400 - 0 + 1)+0;
//        int greenn=r.nextInt(255 - 0 + 1)+0;
//        GradientDrawable draw1 = new GradientDrawable();
//        draw.setShape(GradientDrawable.RECTANGLE);
//        draw.setColor(Color.rgb(redd,greenn,bluee));
//        linearLayout.setBackground(draw1);

//        title.setBackground(draw);

        Intent intent=getIntent();
        int intValue = intent.getIntExtra("id", 0);
        Kalmat_model kalmat_model= alldata_kalmat.kalmat_models.get(intValue);
      //  title.setBackgroundColor(kalmat_model.color);

        title.setText(kalmat_model.title22);
        arabic.setText(kalmat_model.arabicc);
        e_trans.setText(kalmat_model.e_transalationn);
        u_trans.setText(kalmat_model.u_translationn);
       // imageView.setImageResource(dua_model.image);




    }
}