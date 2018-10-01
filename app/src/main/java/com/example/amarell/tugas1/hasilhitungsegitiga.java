package com.example.amarell.tugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hasilhitungsegitiga extends AppCompatActivity {

    TextView jawaban;
    int alas, tinggi;
    double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasilhitungsegitiga);

        jawaban=findViewById(R.id.jawaban);

        Intent intent = getIntent();
        alas = Integer.parseInt(intent.getStringExtra("alas"));
        tinggi = Integer.parseInt(intent.getStringExtra("tinggi"));

        hasil=Math.sqrt( Math.pow(alas,2) + Math.pow(tinggi,2) );;

        jawaban.setText("Sisi miring nya: "+String.valueOf(hasil)+" cm²");


    }
}
