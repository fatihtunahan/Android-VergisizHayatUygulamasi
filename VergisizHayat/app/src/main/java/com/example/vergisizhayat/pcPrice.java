package com.example.vergisizhayat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pcPrice extends AppCompatActivity {

    private TextView pcFiyat;
    private Button pcHesapla;
    private TextView sonucc;
    private Button anaEkranaDon;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc_price);

        pcFiyat=findViewById(R.id.pcFiyat);
        pcHesapla=findViewById(R.id.pcHesapla);
        sonucc=findViewById(R.id.sonucc);
        anaEkranaDon=findViewById(R.id.anaEkranaDon);
        pcHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fiyat=Integer.parseInt(pcFiyat.getText().toString());
                int result= fiyat-(fiyat*33/100);
                sonucc.setText("Sorguladığınız Bilgisayarın Fiyatı: "+result);
            }
        });
        anaEkranaDon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(pcPrice.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}