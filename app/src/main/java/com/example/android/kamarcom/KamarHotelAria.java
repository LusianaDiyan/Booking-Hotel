package com.example.android.kamarcom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by FANNAN on 5/12/2017.
 */

    public class KamarHotelAria extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;


    int id [] = {
            1,
            2,
            3
    };

    String name [] = {
            "Twin Room - 2 Single Beds",
            "Double Room ",
            "Family Room"
    };

    String price [] = {
            " 373,099",
            " 373,099",
            " 432,321"
    };

    String capacity [] = {
            "2 Orang",
            "2 Orang",
            "2 Orang"
    };
    int image [] = {
            R.drawable.kmra,
            R.drawable.kmra,
            R.drawable.kmra
    };

    public KamarHotelAria (Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int i) {
        return getItemId(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    //Perlu di rubah

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.activity_design_list_kamar, null);
        }

        TextView textViewname = (TextView) view.findViewById(R.id.namakamar);
        TextView textViewcategory = (TextView) view.findViewById(R.id.capacity);
        TextView textViewprice = (TextView) view.findViewById(R.id.harga);
        ImageView imageView = (ImageView) view.findViewById(R.id.gambarkamar);


        textViewname.setText(name[i]);
        textViewcategory.setText(capacity[i]);
        textViewprice.setText(price[i]);
        imageView.setImageResource(image[i]);


        return view;
    }
}
