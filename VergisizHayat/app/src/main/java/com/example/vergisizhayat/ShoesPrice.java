package com.example.vergisizhayat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ShoesPrice extends AppCompatActivity {


    private EditText AyakkabıFiyat;
    private Button AnaEkranaDon;
    private TextView sonuc7;
    private Button AyakkabıHesapla;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes_price);

        AyakkabıFiyat=findViewById(R.id.AyakkabıFiyat);
        sonuc7=findViewById(R.id.sonuc7);
        AyakkabıHesapla=findViewById(R.id.AyakkabıHesapla);
        AnaEkranaDon=findViewById(R.id.AnaEkranaDon);
        AyakkabıHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fiyat=Integer.parseInt(AyakkabıFiyat.getText().toString());
                int result=fiyat-(fiyat*40/100);
                sonuc7.setText("Sorguladığınız Ayakkabının Vergisiz Fiyatı: "+result);
            }
        });
        AnaEkranaDon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShoesPrice.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}