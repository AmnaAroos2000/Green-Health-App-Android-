package com.amna.greenhealth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sugar extends AppCompatActivity {

    //declaring variables
    private Button tipsButton;
    private CardView fry, tsos;
    private TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugar);

        //connecting tips for you buttton using onclick mtd to navigate to another pages
        tipsButton = findViewById(R.id.tips3);
        tipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sugar.this, Pressure.class);
                startActivity(intent);
            }
        });

        //connecting fry page using onclick mtd
        fry = findViewById(R.id.cd_29);
        fry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sugar.this, ChickenVeggie.class);
                startActivity(intent);
            }
        });

        //connecting tsos page using onclick mtd
        tsos = findViewById(R.id.cd_30);
        tsos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sugar.this, TsosChicken.class);
                startActivity(intent);
            }
        });

        //connecting back buttton using onclick mtd
        back = findViewById(R.id.backtomain);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sugar.this, Dashboard.class);
                startActivity(intent);
            }
        });

    }

}