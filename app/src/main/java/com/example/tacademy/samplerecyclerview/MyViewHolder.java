package com.example.tacademy.samplerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-18.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView iconView;
    TextView titleView;
    View view;
    MyData data;
    public MyViewHolder(View itemView) {
        super(itemView);
         view = itemView;
         iconView = (ImageView)view.findViewById(R.id.imageView);
         titleView = (TextView)view.findViewById(R.id.text_title);
    }

    public void setData(MyData data){
        this.data = data;
        iconView.setImageDrawable(data.icon);
        titleView.setText(data.title);
        titleView.setTextSize(data.fontSize);
    }
}
