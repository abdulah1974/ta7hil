package com.example.ta7hil;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class th8  extends RecyclerView.Adapter<th8.ViewHolder> {

    private ArrayList mData;
    private LayoutInflater mInflater;
    private  Context context;



    th8(Context context, ArrayList data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.context=context;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.re, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        mData.get(position);
      holder.imageView.setImageResource(Integer.parseInt(mData.get(position).toString()));
      holder.imageView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {




                Intent  intent =  new Intent(context, c.class);
                  context.startActivity(intent);


              }









      });


        //  holder.myTextView.setText(animal);
    }



    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView17);


        }

    }
}

