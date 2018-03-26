package com.example.apurva.customlistview;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by apurva on 23-Mar-18.
 */

public class MyCustomAdapter extends ArrayAdapter {
    int pic[];
    String name[];
    Activity activity;

    public MyCustomAdapter(Activity activity,String name[],int pic[]){
        super(activity,R.layout.custom_list_view,name);
        this.name=name;
        this.pic=pic;
        this.activity=activity;

    }

    @NonNull
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {

        LayoutInflater layoutInflater=activity.getLayoutInflater();
        View view=layoutInflater.inflate(R.layout.custom_list_view,null);
       ImageView imageView= view.findViewById(R.id.imageview);
       TextView textView= view.findViewById(R.id.textview);

       imageView.setImageResource(pic[position]);
       textView.setText(name[position]);
       switch (position){
           case 0:
               view.setBackgroundColor(Color.RED);
               break;
       }

        return(view);
    }
}
