package Adopters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Models.Dua_model;
import com.Models.surah_video_model;
import com.example.qfk.Dua_1;
import com.example.qfk.R;
import com.example.qfk.Video_Act;

import java.util.ArrayList;
import java.util.Random;

public class surah_video_Adapter  extends RecyclerView.Adapter<surah_video_Adapter.holder>  {
    Context context;
    ArrayList<surah_video_model> arrayList;
    public surah_video_Adapter(Context context, ArrayList<surah_video_model> arrayList){
        this.context=context;
        this.arrayList=arrayList;

    }

    @NonNull
    @Override
    public surah_video_Adapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater Inflater=LayoutInflater.from(parent.getContext());
        View view=Inflater.inflate(R.layout.row_item_video_surah,parent,false);
        //Toast.makeText(context, ""+arrayList.size(), Toast.LENGTH_SHORT).show();
        return new surah_video_Adapter.holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull surah_video_Adapter.holder holder,
                                 @SuppressLint("RecyclerView") int position) {
        surah_video_model p=arrayList.get(position);


        holder.text1.setText(arrayList.get(position).title_eng);
        holder.text2.setText(arrayList.get(position).arabic_title);
        holder.imgcontaxt.setImageResource(arrayList.get(position).image);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(context, Video_Act.class);
                intent.putExtra("des","mydes");
                intent.putExtra("id",position+1);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class holder extends RecyclerView.ViewHolder{
        ImageView imgcontaxt;
        TextView text1,text2;
        public holder(@NonNull View itemView) {
            super(itemView);
            imgcontaxt = itemView.findViewById(R.id.video_image);
            text2=itemView.findViewById(R.id.video_title_arabic);
            text1=itemView.findViewById(R.id.video_title_engish);
        }
    }
}
