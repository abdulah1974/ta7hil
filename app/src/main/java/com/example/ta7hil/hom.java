package com.example.ta7hil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class hom  extends AppCompatActivity {
ImageView imageView,t7hwil_;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hom);
        imageView=findViewById(R.id.imageView15);
        textView=findViewById(R.id.textView12);
        t7hwil_=findViewById(R.id.imageView11);
        Intent intent = getIntent();
        String str = intent.getStringExtra("EXTRA_SESSION_ID");
        textView.setText(str);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hom.this,am.class);
                startActivity(intent);
            }
        });
        t7hwil_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hom.this,th7.class);
                startActivity(intent);

            }
        });
    }
    }
