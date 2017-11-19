package com.example.ast.teleafya.Ui.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 11/16/2017.
 */

public class Choose_Special_Screen_Adapter extends BaseAdapter {

    private int images[];
    private String titles[];
    private Context context;
    private LayoutInflater layoutInflater;


    public Choose_Special_Screen_Adapter(Context context , int images[] , String titles[]){



        this.context = context;
        this.images = images;
        this.titles = titles;


    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int i) {
        return titles[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        View GridView = view;

        if (view == null){


            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            GridView = layoutInflater.inflate(R.layout.custom_layout_special_screen,null);

        }

        ImageView img  = (ImageView) GridView.findViewById(R.id.img1);
        TextView txt = (TextView) GridView.findViewById(R.id.txt1);


        img.setImageResource(images[i]);

        txt.setText(titles[i]);

        return GridView;
    }


}
