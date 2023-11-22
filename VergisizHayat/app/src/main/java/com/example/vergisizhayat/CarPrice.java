package com.example.vergisizhayat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CarPrice extends AppCompatActivity {


    private EditText carFiyat;
    private Button Hesapla;
    private TextView sonuc;
    private Button anaEkranaDon2;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_price);
        carFiyat=findViewById(R.id.aracFiyat);
        Hesapla=findViewById(R.id.hesapla);
        sonuc=findViewById(R.id.sonucc);
        anaEkranaDon2=findViewById(R.id.anaEkranaDon2);
        Hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float fiyat=Float.parseFloat(carFiyat.getText().toString());
                int result= (int) (fiyat-(fiyat*0.66));
                sonuc.setText("Sorguladığınız Aracın Vergisiz Fiyatı: "+result);
            }
        });
        anaEkranaDon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CarPrice.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}