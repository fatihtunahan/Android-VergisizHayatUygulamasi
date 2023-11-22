package com.example.vergisizhayat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView car;
    private ImageView phone;

    private ImageView pc;
    private ImageView ayakkabı;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        car = findViewById(R.id.car);
        phone=findViewById(R.id.phone);
        pc=findViewById(R.id.pc);
        ayakkabı=findViewById(R.id.ayakkabı);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PhonePrice.class);
                startActivity(intent);
            }
        });
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CarPrice.class);
                startActivity(intent);
            }
        });
        pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,pcPrice.class);
            startActivity(intent);
            }
        });
        ayakkabı.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ShoesPrice.class);
                startActivity(intent);
            }
        });
    }
}