package com.example.vergisizhayat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PhonePrice extends AppCompatActivity {
    private EditText telefonFiyat;
    private Button hesapla2;
    private TextView sonuc1;
    private Button anaEkranaDon3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_price);
        telefonFiyat=findViewById(R.id.telefonFiyat);
        hesapla2=findViewById(R.id.hesapla2);
        sonuc1=findViewById(R.id.sonucc);
        anaEkranaDon3=findViewById(R.id.anaEkranaDon3);
        hesapla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fiyat=Integer.parseInt(telefonFiyat.getText().toString());
                int result= (int) (fiyat-(fiyat*0.55));
                sonuc1.setText("Sorguladığınız Telefonun Vergisiz Fiyatı: "+result);
            }
        });
        anaEkranaDon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PhonePrice.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}