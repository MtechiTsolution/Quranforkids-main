package com.example.qfk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class SurahVideo extends AppCompatActivity {

    //FloatingActionButton addvideo;
    private RecyclerView recview;
    ArrayList<filemodel> arrayList;
    private  Adaptervideo adaptervideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_video);
       recview=findViewById(R.id.recview);
        Toast.makeText(this, "Surah videos", Toast.LENGTH_SHORT).show();
       LoadvideoFromfirbase();
    }

    private void LoadvideoFromfirbase() {

        arrayList = new ArrayList<>();
        recview.setLayoutManager(new LinearLayoutManager(this));
        DatabaseReference reference= FirebaseDatabase.getInstance().
                getReference("video");
        Toast.makeText(this, ""+reference, Toast.LENGTH_SHORT).show();
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {


                for (DataSnapshot ds : snapshot.getChildren()){

                    filemodel filemodel= ds.getValue(filemodel.class);
                    arrayList.add(filemodel);
                }
                Toast.makeText(SurahVideo.this, " "+arrayList.size(), Toast.LENGTH_SHORT).show();
                adaptervideo = new Adaptervideo(SurahVideo.this,arrayList);
                recview.setAdapter(adaptervideo);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}