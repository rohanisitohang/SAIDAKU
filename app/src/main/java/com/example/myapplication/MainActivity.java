package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void setText(View view) {
        final TextView textName = findViewById(R.id.nama_aplikasi1);
        textName.setText("Selamat datang akang dan teteh di aplikasi “E-Admin Perpustakaan Saija Adinda");
    }
    public void pindah1(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}

