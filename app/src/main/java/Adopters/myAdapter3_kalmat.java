package Adopters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.Models.Kalmat_model;
import com.Models.Surah_model;
import com.example.qfk.R;
import com.example.qfk.Surah_1;
import com.example.qfk.pehla_kalma;

import java.util.ArrayList;
import java.util.Random;

public class myAdapter3_kalmat extends RecyclerView.Adapter<myAdapter3_kalmat.holder> {
    Context context;
    ArrayList<Kalmat_model> arrayList;
    public myAdapter3_kalmat(Context context, ArrayList<Kalmat_model> arrayList){
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
        View view=Inflater.inflate(R.layout.item_kalma_row,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, @SuppressLint("RecyclerView") int position) {
//        Orders_model ds=datamodels.get(position);
        Kalmat_model p=arrayList.get(position);
//        Random r = new Random();
//        int red=r.nextInt(255 - 0 + 1)+0;
//        int green=r.nextInt(255 - 0 + 1)+0;
//        int blue=r.nextInt(255 - 0 + 1)+0;
//
//        GradientDrawable draw = new GradientDrawable();
//        draw.setShape(GradientDrawable.RECTANGLE);
//        draw.setColor(Color.rgb(red,green,blue));
          Color color = new Color();
          holder.linearLayout.setBackground(Drawable.createFromPath(arrayList.get(position).color));

          //int color= Color.parseColor("#FFFFFF");
        //  holder.linearLayout.setBackgroundColor(Integer.parseInt(arrayList.get(position).color));
      // holder.linearLayout.setBackground(Drawable.createFromPath((arrayList.get(position).color)));
       // holder.linearLayout.setBackgroundColor(Integer.parseInt(String.valueOf(arrayList.get(position).color)));

        holder.text1.setText(arrayList.get(position).titile);
//        holder.text3.setText(arrayList.get(position).arabic_tittle);
        holder.text2.setText(arrayList.get(position).sr_no_surah);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent=new Intent(context, pehla_kalma.class);
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
        TextView text1,text2;
        LinearLayout linearLayout;
        CardView cardView;
        public holder(@NonNull View itemView) {
            super(itemView);
            linearLayout=itemView.findViewById(R.id.dua_one_kalma);
            text1=itemView.findViewById(R.id.kalma_title);
            text2=itemView.findViewById(R.id.sr_no_kalma);
//            text3=itemView.findViewById(R.id.surah_title_arabic);
        }
    }
}