package com.amna.greenhealth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {
    private CardView commonFood, cholesterol, sugar, pressure, location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //connecting each card using onclick mtd to navigate to another pages
        commonFood = findViewById(R.id.cd_1);
        commonFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, CommonFood.class);
                startActivity(intent);
            }
        });

        //connecting each card using onclick mtd to navigate to another pages
        cholesterol = findViewById(R.id.cd_2);
        cholesterol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Cholestrol.class);
                startActivity(intent);
            }
        });

        //connecting each card using onclick mtd to navigate to another pages
        sugar = findViewById(R.id.cd_3);
        sugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Sugar.class);
                startActivity(intent);
            }
        });

        //connecting each card using onclick mtd to navigate to another pages
        pressure = findViewById(R.id.cd_4);
        pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Pressure.class);
                startActivity(intent);
            }
        });

        //connecting each card using onclick mtd to navigate to another pages
        location = findViewById(R.id.cd_5);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, LocationSelection.class);
                startActivity(intent);
            }
        });

    }

}