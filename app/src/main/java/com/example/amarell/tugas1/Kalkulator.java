package com.example.amarell.tugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {

    Button hitung, hitungaktiviti;
    EditText alas, tinggi;
    TextView hasil;

    int num1, num2;
    double hasilakhir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        hitung = findViewById(R.id.btnhitung);
        alas= findViewById(R.id.alas2);
        tinggi = findViewById(R.id.tinggi);
        hasil = findViewById(R.id.hasil);
        hitungaktiviti=findViewById(R.id.btnhitungintent);

        /*num1= Integer.parseInt(alas.getText().toString());
        num2 = Integer.parseInt(tinggi.getText().toString());*/

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (alas.getText().toString().trim().isEmpty()){
                    alas.setError("harus di isi");
                    alas.requestFocus();
                    return;
                }

                if (tinggi.getText().toString().trim().isEmpty()){
                    tinggi.setError("harus di isi");
                    tinggi.requestFocus();
                    return;
                }

                num1= Integer.parseInt(alas.getText().toString());
                num2 = Integer.parseInt(tinggi.getText().toString());

                hasilakhir=Math.sqrt( Math.pow(num1,2) + Math.pow(num2,2) );
                hasil.setVisibility(View.VISIBLE);
                hasil.setText(String.valueOf("Sisi miring nya: "+hasilakhir+" cm²"));

            }
        });

        hitungaktiviti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (alas.getText().toString().trim().isEmpty()){
                    alas.setError("harus di isi");
                    alas.requestFocus();
                    return;
                }

                if (tinggi.getText().toString().trim().isEmpty()){
                    tinggi.setError("harus di isi");
                    tinggi.requestFocus();
                    return;
                }

                Intent intent = new Intent(Kalkulator.this, hasilhitungsegitiga.class);
                intent.putExtra("alas",alas.getText().toString() );
                intent.putExtra("tinggi", tinggi.getText().toString());
                startActivity(intent);

            }
        });
    }


}
