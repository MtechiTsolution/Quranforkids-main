package Adopters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Models.Aya_Model;
import com.Models.Dua_model;
import com.Models.Surah_model;
import com.example.qfk.Dua_1;
import com.example.qfk.R;

import java.util.ArrayList;

public class ayatAdapter  extends  RecyclerView.Adapter<ayatAdapter.holder>{
    Context context;
    ArrayList<Aya_Model> arrayList;
    public ayatAdapter(Context context, ArrayList<Aya_Model> arrayList){
        this.context=context;
        this.arrayList=arrayList;

    }
    @NonNull
    @Override
    public ayatAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater Inflater=LayoutInflater.from(parent.getContext());
        View view=Inflater.inflate(R.layout.item_surah_ayat,parent,false);
        return new ayatAdapter.holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ayatAdapter.holder holder, @SuppressLint("RecyclerView") int position) {
        holder.text1.setText(arrayList.get(position).getArbi());
        holder.text2.setText(arrayList.get(position).getEnglish());
        holder.text3.setText(arrayList.get(position).getUrdu());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class holder extends RecyclerView.ViewHolder{
       // ImageView imgcontaxt;
        TextView text1,text2,text3;
        public holder(@NonNull View itemView) {
            super(itemView);
            text1=itemView.findViewById(R.id.ayat_arabic);
            text2=itemView.findViewById(R.id.e_translation);
            text3=itemView.findViewById(R.id.urdu_translation);
        }
    }
}
