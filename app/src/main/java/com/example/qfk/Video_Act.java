package com.example.qfk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.Models.Kalmat_model;
import com.Models.surah_video_model;
import com.example.localdata.alldata_kalmat;
import com.example.localdata.alldata_surahvideo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Video_Act extends AppCompatActivity {
    VideoView videoView;
    TextView title;
    ProgressBar progressBar;
    filemodel filemodel;
    int a;
    int b;
    int intValue;
    int intval;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        getSupportActionBar().hide();
        videoView = findViewById(R.id.video_view);
        title = findViewById(R.id.vtitle);
        progressBar = findViewById(R.id.progress_bar);

        Bundle extras = getIntent().getExtras();


        if(extras.containsKey("des")){
//            intValue = extras.getString("id");
            intValue = extras.getInt("id", 1);
            LoadvideoFromfirbase();
        }
        else if (extras.containsKey("data")){
            intValue = extras.getInt("no", 1);

//            intValue = extras.getString("appdatadescipl",56);
            Toast.makeText(Video_Act.this, ""+intValue, Toast.LENGTH_SHORT).show();
            Loadvideokalma();
        }
        else if (extras.containsKey("dua")){
            intValue = extras.getInt("dd", 1);
            Toast.makeText(Video_Act.this, ""+intValue, Toast.LENGTH_SHORT).show();
            loadvidodua();
        }
//        Intent intent=getIntent();
//        Intent intent2 = getIntent();
//         intValue = intent.getIntExtra("id", 1);
//
//         intval = intent2.getIntExtra("no",36);

       // surah_video_model surah_video_model= alldata_surahvideo.video_models.get(intValue);
//        Toast.makeText(Video_Act.this, ""+intValue, Toast.LENGTH_SHORT).show();
//  if (intValue<=35){
//      LoadvideoFromfirbase();
//  }else if (intval==b){
//      Loadvideokalma();
//  }




    }

    private void loadvidodua() {
        {
            Toast.makeText(this, "i am here in Loadvideodua", Toast.LENGTH_SHORT).show();

            DatabaseReference reference= FirebaseDatabase.getInstance().
                    getReference("Dua");
            Toast.makeText(this, ""+reference, Toast.LENGTH_SHORT).show();
            reference.child(String.valueOf(intValue)).addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {


                    if(snapshot.exists()){
                        filemodel = snapshot.getValue(filemodel.class);
                        String titles = filemodel.getTitle();
                        title.setText(titles);

                        setVideoduaUrl(filemodel);
                    }
                }
                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });
        }
    }


    private void Loadvideokalma() {
        {
            Toast.makeText(this, "i am here in Loadvideokalma", Toast.LENGTH_SHORT).show();

            DatabaseReference reference= FirebaseDatabase.getInstance().
                    getReference("kalmat");
            Toast.makeText(this, ""+reference, Toast.LENGTH_SHORT).show();
            reference.child(String.valueOf(intValue)).addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {


                    if(snapshot.exists()){
                        filemodel = snapshot.getValue(filemodel.class);
                        String titles = filemodel.getTitle();
                        title.setText(titles);

                        setVideokalmaUrl(filemodel);
                    }

                }


                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });
        }

    }


    private void LoadvideoFromfirbase() {


        DatabaseReference reference= FirebaseDatabase.getInstance().
                getReference("video");
        Toast.makeText(this, ""+reference, Toast.LENGTH_SHORT).show();
        reference.child(String.valueOf(intValue)).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {


               if(snapshot.exists()){
                   filemodel = snapshot.getValue(filemodel.class);
                   String titles = filemodel.getTitle();
                   title.setText(titles);

                   setVideoUrl(filemodel);
               }

            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
    private void setVideoUrl(filemodel filemodel) {
        progressBar.setVisibility(View.VISIBLE);


        String videourl = filemodel.getUrl();
        Toast.makeText(Video_Act.this, "1 "+videourl, Toast.LENGTH_SHORT).show();
        MediaController mediaController= new MediaController(Video_Act.this);
        mediaController.setAnchorView(videoView);
        Uri videouri = Uri.parse(videourl);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(videouri);
        videoView.requestFocus();
      //  Toast.makeText(Video_Act.this, " 2"+videourl, Toast.LENGTH_SHORT).show();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
              //  Toast.makeText(Video_Act.this, " 3"+videourl, Toast.LENGTH_SHORT).show();

                mediaPlayer.start();
            }

        });

        videoView.setOnInfoListener(new MediaPlayer.OnInfoListener() {
            @Override
            public boolean onInfo(MediaPlayer mp, int what, int extra) {
                switch (what){
                    case MediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START:{
                        progressBar.setVisibility(View.GONE);
                        return  true;
                    }
                    case  MediaPlayer.MEDIA_INFO_BUFFERING_START:{
                        progressBar.setVisibility(View.GONE);
                        return true;
                    }

                    case MediaPlayer.MEDIA_INFO_BUFFERING_END:{
                        progressBar.setVisibility(View.GONE);
                        return  true;
                    }
                }
                return false;
            }
        });
       videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.start();
            }
        });

    }

    private void setVideokalmaUrl(filemodel filemodel) {
        progressBar.setVisibility(View.VISIBLE);


        String videourl = filemodel.getUrl();
        Toast.makeText(Video_Act.this, "1 "+videourl, Toast.LENGTH_SHORT).show();
        MediaController mediaController= new MediaController(Video_Act.this);
        mediaController.setAnchorView(videoView);
        Uri videouri = Uri.parse(videourl);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(videouri);
        videoView.requestFocus();
        //  Toast.makeText(Video_Act.this, " 2"+videourl, Toast.LENGTH_SHORT).show();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                //  Toast.makeText(Video_Act.this, " 3"+videourl, Toast.LENGTH_SHORT).show();

                mediaPlayer.start();
            }

        });

        videoView.setOnInfoListener(new MediaPlayer.OnInfoListener() {
            @Override
            public boolean onInfo(MediaPlayer mp, int what, int extra) {
                switch (what){
                    case MediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START:{
                        progressBar.setVisibility(View.GONE);
                        return  true;
                    }
                    case  MediaPlayer.MEDIA_INFO_BUFFERING_START:{
                        progressBar.setVisibility(View.GONE);
                        return true;
                    }

                    case MediaPlayer.MEDIA_INFO_BUFFERING_END:{
                        progressBar.setVisibility(View.GONE);
                        return  true;
                    }
                }
                return false;
            }
        });
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.start();
            }
        });

    }
    private void setVideoduaUrl(filemodel filemodel) {
        progressBar.setVisibility(View.VISIBLE);


        String videourl = filemodel.getUrl();
        Toast.makeText(Video_Act.this, "1 "+videourl, Toast.LENGTH_SHORT).show();
        MediaController mediaController= new MediaController(Video_Act.this);
        mediaController.setAnchorView(videoView);
        Uri videouri = Uri.parse(videourl);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(videouri);
        videoView.requestFocus();
        //  Toast.makeText(Video_Act.this, " 2"+videourl, Toast.LENGTH_SHORT).show();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                //  Toast.makeText(Video_Act.this, " 3"+videourl, Toast.LENGTH_SHORT).show();

                mediaPlayer.start();
            }

        });

        videoView.setOnInfoListener(new MediaPlayer.OnInfoListener() {
            @Override
            public boolean onInfo(MediaPlayer mp, int what, int extra) {
                switch (what){
                    case MediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START:{
                        progressBar.setVisibility(View.GONE);
                        return  true;
                    }
                    case  MediaPlayer.MEDIA_INFO_BUFFERING_START:{
                        progressBar.setVisibility(View.GONE);
                        return true;
                    }

                    case MediaPlayer.MEDIA_INFO_BUFFERING_END:{
                        progressBar.setVisibility(View.GONE);
                        return  true;
                    }
                }
                return false;
            }
        });
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.start();
            }
        });

    }
}