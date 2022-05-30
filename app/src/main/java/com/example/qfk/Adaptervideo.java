package com.example.qfk;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptervideo extends  RecyclerView.Adapter<Adaptervideo.Holdervideo>{
    private Context context;
    private ArrayList<filemodel> arrayList;

    public Adaptervideo(Context context, ArrayList<filemodel> arrayList) {

        this.context = context;
        this.arrayList = arrayList;
    }




    @NonNull
    @Override
    public Holdervideo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Toast.makeText(context, "1 o chakl ga ", Toast.LENGTH_SHORT).show();

        View view= LayoutInflater.from(context).inflate(R.layout.row,parent,false);
        return new Holdervideo(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holdervideo holder, int position) {
   filemodel filemodel= arrayList.get(position);
   String id = filemodel.getUrl();
   String title = filemodel.getTitle();
   holder.title.setText(title);

   setVideoUrl(filemodel,holder);

    }

    private void setVideoUrl(filemodel filemodel, Holdervideo holder) {
   holder.progressBar.setVisibility(View.VISIBLE);


        String videourl = filemodel.getUrl();
        Toast.makeText(context, "1 "+videourl, Toast.LENGTH_SHORT).show();
        MediaController mediaController= new MediaController(context);
        mediaController.setAnchorView(holder.videoView);
        Uri videouri = Uri.parse(videourl);
        holder.videoView.setMediaController(mediaController);
        holder.videoView.setVideoURI(videouri);
        holder.videoView.requestFocus();
        Toast.makeText(context, " 2"+videourl, Toast.LENGTH_SHORT).show();

        holder.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                Toast.makeText(context, " 3"+videourl, Toast.LENGTH_SHORT).show();

                mediaPlayer.start();
            }

        });

holder.videoView.setOnInfoListener(new MediaPlayer.OnInfoListener() {
    @Override
    public boolean onInfo(MediaPlayer mp, int what, int extra) {
        switch (what){
            case MediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START:{
                    holder.progressBar.setVisibility(View.VISIBLE);
                    return  true;
                 }
            case  MediaPlayer.MEDIA_INFO_BUFFERING_START:{
                holder.progressBar.setVisibility(View.VISIBLE);
                 return true;
            }

            case MediaPlayer.MEDIA_INFO_BUFFERING_END:{
                holder.progressBar.setVisibility(View.GONE);
                return  true;
            }
        }
        return false;
    }
});
  holder.videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
      @Override
      public void onCompletion(MediaPlayer mediaPlayer) {
          mediaPlayer.start();
      }
  });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class  Holdervideo extends RecyclerView.ViewHolder{
        VideoView videoView;
        TextView title;
        ProgressBar progressBar;
         public Holdervideo(@NonNull View itemView) {
             super(itemView);


             videoView = itemView.findViewById(R.id.video_view);
             title = itemView.findViewById(R.id.vtitle);
             progressBar = itemView.findViewById(R.id.progress_bar);

         }
     }
}
