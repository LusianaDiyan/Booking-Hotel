package com.example.android.kamarcom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListKamar extends AppCompatActivity {

    int id;
    ListView listView;
    KamarAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_kamar);

        //id.setText(id.getText().toString() + " " + getIntent().getStringExtra("idkirim"));


        listView = (ListView) findViewById(R.id.listkamar);
        adapter = new KamarAdapter(this);
        listView.setAdapter(adapter);

        TextView judul = (TextView) findViewById(R.id.judul);
        TextView alamat = (TextView) findViewById(R.id.alamat);
        judul.setText(judul.getText().toString() + " " + getIntent().getStringExtra("nama"));
        alamat.setText(alamat.getText().toString() + " " + getIntent().getStringExtra("alamat"));

    }
}
