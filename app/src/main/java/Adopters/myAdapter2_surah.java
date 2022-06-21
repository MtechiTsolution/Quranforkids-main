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
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Models.Dua_model;
import com.Models.Surah_model;
import com.example.qfk.Dua_1;
import com.example.qfk.R;
import com.example.qfk.Surah_1;

import java.util.ArrayList;
import java.util.Random;

public class myAdapter2_surah extends RecyclerView.Adapter<myAdapter2_surah.holder> {
    Context context;
    ArrayList<Surah_model> arrayList;
    public myAdapter2_surah(Context context, ArrayList<Surah_model> arrayList){
        this.context=context;
        this.arrayList=arrayList;

    }
//    public myAdapter(String[] data) {
//        this.data = data;
//    }
//   String s1,s2;

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater Inflater=LayoutInflater.from(parent.getContext());
        View view=Inflater.inflate(R.layout.item_surah_row,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, @SuppressLint("RecyclerView") int position) {
//        Orders_model ds=datamodels.get(position);
        Surah_model p=arrayList.get(position);

        Random r = new Random();
        int red=r.nextInt(2000 - 0 + 1)+0;
        int green=r.nextInt(2000 - 0 + 1)+0;
        int blue=r.nextInt(2000 - 0 + 1)+0;
        int pink=r.nextInt(2000 - 0 + 1)+0;
        GradientDrawable draw = new GradientDrawable();
        draw.setShape(GradientDrawable.RECTANGLE);
        draw.setColor(Color.rgb(red,pink,blue));
        holder.linearLayout.setBackground(draw);

        holder.text1.setText(arrayList.get(position).titile);
        holder.text3.setText(arrayList.get(position).arabic_tittle);
        holder.text2.setText(arrayList.get(position).sr_no_surah);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(context, Surah_1.class);
                intent.putExtra("id",position);
                context.startActivity(intent);
            }
        });

        // holder.text1.setText(data[position]);
//        holder.text2.setText(data[position]);
        // Log.d("Mytad", String.valueOf(holder.text1));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();


    }

    public class holder extends RecyclerView.ViewHolder{
//        ImageView imgcontaxt;
        TextView text1,text2,text3;
        LinearLayout linearLayout;
        public holder(@NonNull View itemView) {
            super(itemView);
            linearLayout=itemView.findViewById(R.id.surah_two);
            text1=itemView.findViewById(R.id.surah_title);
            text2=itemView.findViewById(R.id.sr_no_surah);
            text3=itemView.findViewById(R.id.surah_title_arabic);
        }
    }
}