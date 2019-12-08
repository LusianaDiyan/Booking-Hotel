package com.example.android.kamarcom;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by FANNAN on 5/8/2017.
 */

public class HotelAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;
    int id [] ={
            1,
            2,
            3
    };

    String name [] ={
            "Fairfield By Marriott",
            "Hotel Aria Centra Surabaya",
            "Grand Darmo Suite"
    };

    String price [] ={
            "Jalan Mayjend Sungkono No 178",
            "Jalan TAIS Nasution no. 37, Embong Sawo",
            "Jl. Progo No. 1 - 3"
    };

    String category [] ={
            "Bintang 4",
            "Bintang 4",
            "Bintang 4"
    };

    String review [] ={
            "Surabaya, Indonesia",
            "Surabaya, Indonesia",
            "Surabaya, Indonesia"
    };

    int image [] ={
            R.drawable.a,
            R.drawable.b,
            R.drawable.c
    };

    public HotelAdapter (Context context) {
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

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.activity_list_hotel, null);
        }

        TextView textViewname = (TextView) view.findViewById(R.id.namabuku);
        TextView textViewcategory = (TextView) view.findViewById(R.id.category);
        TextView textViewprice = (TextView) view.findViewById(R.id.price);
        TextView textViewreview = (TextView) view.findViewById(R.id.review);
        ImageView imageView = (ImageView) view.findViewById(R.id.viewbook);

        Button btnPilih = (Button) view.findViewById(R.id.btnpilih);

        final int idvar = id[i];
        final String namaHotel = name[i];
        final String alamat = price[i];
        btnPilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (idvar == 1){
                    Intent intent = new Intent(context.getApplicationContext(), ListKamar.class);
                    intent.putExtra("nama", namaHotel);
                    intent.putExtra("alamat",alamat);
                    context.startActivity(intent);
                } else if (idvar == 2){
                    Intent intent = new Intent(context.getApplicationContext(), ListKamarHotelAria.class);
                    intent.putExtra("nama", namaHotel);
                    intent.putExtra("alamat",alamat);
                    context.startActivity(intent);
                } else if (idvar == 3){
                    Intent intent = new Intent(context.getApplicationContext(), Hotelgranddarmo.class);
                    intent.putExtra("nama", namaHotel);
                    intent.putExtra("alamat",alamat);
                    context.startActivity(intent);
                }

            }
        });

        textViewname.setText(name[i]);
        textViewcategory.setText(category[i]);
        textViewprice.setText(price[i]);
        textViewreview.setText(review[i]);
        imageView.setImageResource(image[i]);


        return view;
    }
}
