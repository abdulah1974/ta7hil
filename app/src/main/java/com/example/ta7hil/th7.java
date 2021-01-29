package com.example.ta7hil;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class th7 extends AppCompatActivity {
    th8 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t7h);
        ArrayList animalNames = new ArrayList<>();
        animalNames.add(R.drawable.group_77);
        animalNames.add(R.drawable.group_78);
        animalNames.add(R.drawable.group_79);
        animalNames.add(R.drawable.group_80);
        animalNames.add(R.drawable.group_81);
        animalNames.add(R.drawable.group_82);
        animalNames.add(R.drawable.group_83);
        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.abdullah);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new th8(this, animalNames);

        recyclerView.setAdapter(adapter);
    }

}
