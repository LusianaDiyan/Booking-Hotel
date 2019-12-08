package com.example.android.kamarcom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DaftarActivity extends AppCompatActivity implements View.OnClickListener {

    Button btndaftar;
    String toast = "Daftar Akun Berhasil";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        btndaftar = (Button) findViewById(R.id.daftar);
        btndaftar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.daftar:
                startActivity(new Intent(this, Login.class));
                Toast.makeText(getApplicationContext(),toast,Toast.LENGTH_LONG).show();
                break;
        }
    }
}
