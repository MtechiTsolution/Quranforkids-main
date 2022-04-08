package com.example.qfk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Surah_read_click extends AppCompatActivity {
//CardView c1;
//Button deleteDialog,deleteDialogView;
//    private View view;
//    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_read_click);
        getSupportActionBar().hide();



        LinearLayout s_one =(LinearLayout) findViewById(R.id.surah_one);
        LinearLayout s_two =(LinearLayout) findViewById(R.id.surah_two);
        LinearLayout s_three =(LinearLayout) findViewById(R.id.surah_three);
        LinearLayout s_four =(LinearLayout) findViewById(R.id.surah_four);
        LinearLayout s_five =(LinearLayout) findViewById(R.id.surah_five);
        LinearLayout s_six =(LinearLayout) findViewById(R.id.surah_six);
        LinearLayout s_seven =(LinearLayout) findViewById(R.id.surah_seven);
        LinearLayout s_eight =(LinearLayout) findViewById(R.id.surah_eight);
        LinearLayout s_nine =(LinearLayout) findViewById(R.id.surah_nine);
        LinearLayout s_ten =(LinearLayout) findViewById(R.id.surah_ten);
        LinearLayout s_elen=(LinearLayout) findViewById(R.id.surah_eleven);
        LinearLayout s_tev= (LinearLayout) findViewById(R.id.surah_twelve);
        LinearLayout s_thr= (LinearLayout) findViewById(R.id.surah_thirteen);
        LinearLayout s_fur= (LinearLayout) findViewById(R.id.surah_fourteen);
        LinearLayout s_fif= (LinearLayout) findViewById(R.id.surah_fifteen);
        LinearLayout s_sixx= (LinearLayout) findViewById(R.id.surah_sixteen);
        LinearLayout s_svn= (LinearLayout) findViewById(R.id.surah_seventeen);
        LinearLayout s_eigt= (LinearLayout) findViewById(R.id.surah_eighteen);
        LinearLayout s_nint= (LinearLayout) findViewById(R.id.surah_nineteen);
        LinearLayout s_twnty= (LinearLayout) findViewById(R.id.surah_twenty);
        LinearLayout s_t_one= (LinearLayout) findViewById(R.id.surah_twenty1);
        LinearLayout s_t_two= (LinearLayout) findViewById(R.id.surah_twenty2);
        LinearLayout s_t_three= (LinearLayout) findViewById(R.id.surah_twenty3);
        LinearLayout s_t_four= (LinearLayout) findViewById(R.id.surah_twenty4);
        LinearLayout s_t_five= (LinearLayout) findViewById(R.id.surah_twenty5);
        LinearLayout s_t_six= (LinearLayout) findViewById(R.id.surah_twenty6);
        LinearLayout s_t_svn= (LinearLayout) findViewById(R.id.surah_twenty7);
        LinearLayout s_t_eigt= (LinearLayout) findViewById(R.id.surah_twenty8);
        LinearLayout s_t_nine= (LinearLayout) findViewById(R.id.surah_twenty9);
        LinearLayout s_thirty= (LinearLayout) findViewById(R.id.surah_thirty);
        LinearLayout s_th_one= (LinearLayout) findViewById(R.id.surah_thirty1);
        LinearLayout s_th_two= (LinearLayout) findViewById(R.id.surah_thirty2);
        LinearLayout s_th_three= (LinearLayout) findViewById(R.id.surah_thirty3);
        LinearLayout s_th_four= (LinearLayout) findViewById(R.id.surah_thirty4);
        LinearLayout s_th_five= (LinearLayout) findViewById(R.id.surah_thirty5);







        Intent S1 = new Intent(Surah_read_click.this, Surah_1.class);
        Intent S2 = new Intent(Surah_read_click.this, Surah_2.class);
        Intent S3 = new Intent(Surah_read_click.this, Surah_3.class);
        Intent S4 = new Intent(Surah_read_click.this, Surah_4.class);
        Intent S5 = new Intent(Surah_read_click.this, Surah_5.class);
        Intent S6 = new Intent(Surah_read_click.this, Surah_6.class);
        Intent S7 = new Intent(Surah_read_click.this, Surah_7.class);
        Intent S8 = new Intent(Surah_read_click.this, Surah_8.class);
        Intent S9 = new Intent(Surah_read_click.this, Surah_9.class);
        Intent S10 = new Intent(Surah_read_click.this, Surah_10.class);
        Intent S11 = new Intent(Surah_read_click.this, surah11.class);
        Intent S12 = new Intent(Surah_read_click.this, Surah_12.class);
        Intent S13 = new Intent(Surah_read_click.this, Surah_13.class);
        Intent S14 = new Intent(Surah_read_click.this, Surah_14.class);
        Intent S15 = new Intent(Surah_read_click.this, Surah_15.class);
        Intent S16 = new Intent(Surah_read_click.this, Surah_16.class);
        Intent S17 = new Intent(Surah_read_click.this, Surah_17.class);
        Intent S18 = new Intent(Surah_read_click.this, Surah_18.class);
        Intent S19 = new Intent(Surah_read_click.this, Surah_19.class);
        Intent S20 = new Intent(Surah_read_click.this, Surah_20.class);
        Intent S21 = new Intent(Surah_read_click.this, Surah_21.class);
        Intent S22 = new Intent(Surah_read_click.this, Surah_22.class);
        Intent S23 = new Intent(Surah_read_click.this, Surah_23.class);
        Intent S24 = new Intent(Surah_read_click.this, Surah_24.class);
        Intent S25 = new Intent(Surah_read_click.this, Surah_25.class);
        Intent S26 = new Intent(Surah_read_click.this, Surah_26.class);
        Intent S27 = new Intent(Surah_read_click.this, Surah_27.class);
        Intent S28 = new Intent(Surah_read_click.this, Surah_28.class);
        Intent S29 = new Intent(Surah_read_click.this, Surah_29.class);
        Intent S30 = new Intent(Surah_read_click.this, Surah_30.class);
        Intent S31 = new Intent(Surah_read_click.this, Surah_31.class);
        Intent S32 = new Intent(Surah_read_click.this, Surah_32.class);
        Intent S33 = new Intent(Surah_read_click.this, Surah_33.class);
        Intent S34 = new Intent(Surah_read_click.this, Surah_34.class);
        Intent S35 = new Intent(Surah_read_click.this, Surah_35.class);





        s_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S1);
            }
        });

        s_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S2);
            }
        });

        s_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S3);
            }
        });

        s_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S4);
            }
        });

        s_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S5);
            }
        });

        s_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S6);
            }
        });

        s_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S7);
            }
        });

        s_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S8);
            }
        });

        s_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S9);
            }
        });

        s_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S10);
            }
        });
        s_elen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S11);
            }
        });
        s_tev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S12);
            }
        });
        s_thr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S13);
            }
        });
        s_fur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S14);
            }
        });
        s_fif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S15);
            }
        });
        s_sixx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S16);
            }
        });
        s_svn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S17);
            }
        });
        s_eigt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S18);
            }
        });
        s_nint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S19);
            }
        });
        s_twnty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S20);
            }
        });
        s_t_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S21);
            }
        });
        s_t_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S22);
            }
        });
        s_t_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S23);
            }
        });
        s_t_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S24);
            }
        });
        s_t_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S25);
            }
        });
        s_t_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S26);
            }
        });
        s_t_svn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S27);
            }
        });
        s_t_eigt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S28);
            }
        });
        s_t_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S29);
            }
        });
        s_thirty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S30);
            }
        });
        s_th_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S31);
            }
        });
        s_th_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S32);
            }
        });
        s_th_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S33);
            }
        });
        s_th_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S34);
            }
        });
        s_th_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Surah_read_click.this.startActivity(S35);
            }
        });

    }


    //    c1=findViewById(R.id.card1);
      //  c1.setOnClickListener(new View.OnClickListener() {
        //    @Override
    //        public void onClick(View view) {

     //           LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
      //          view = inflater.inflate(R.layout.fragment_surah1, null);
       //         final Dialog dialog = new Dialog(Surah_read_click.this);
     //           dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
    //            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    //         //   dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

    //            dialog.setContentView(view);
    //            dialog.setCancelable(true);
    //            dialog.setCanceledOnTouchOutside(true);
    //            dialog.show();

     //       }

   //     });



        // fragment code



//    public void showCustomDialog(final Context context) {
//        Dialog dialog = new Dialog(context);
//        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        view = inflater.inflate(R.layout.diaalog_1, null, false);
//       // findByIds(view);  /*HERE YOU CAN FIND YOU IDS AND SET TEXTS OR BUTTONS*/
//        ((Activity) context).getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE | WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
//        dialog.setContentView(view);
//        final Window window = dialog.getWindow();
//        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
//        window.setBackgroundDrawableResource(R.color.black);
//        window.setGravity(Gravity.CENTER);
//        dialog.show();
//    }


}