package com.example.android.kamarcom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class ListKamarHotelAria extends AppCompatActivity {
    ListView listView;
    KamarHotelAria adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_kamar_hotel_aria);

        listView = (ListView) findViewById(R.id.listkamar);
        adapter = new KamarHotelAria(this);
        listView.setAdapter(adapter);


        TextView namakam = (TextView) findViewById(R.id.namakamar);
        TextView alamat = (TextView) findViewById(R.id.alamat);
        namakam.setText(namakam.getText().toString() + " " + getIntent().getStringExtra("nama"));
        alamat.setText(alamat.getText().toString() + " " + getIntent().getStringExtra("alamat"));
    }
}
