package com.amna.greenhealth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Cholestrol extends AppCompatActivity {

    //Initilizing variables
    private Button TipsButton;
    private CardView Legumes, Rice;
    private TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cholestrol);

        //connecting tips for you buttton using onclick mtd to navigate to Cholesterol tips pages
        TipsButton = findViewById(R.id.tips1);
        TipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cholestrol.this, CholestrolTips.class);
                startActivity(intent);
            }
        });

        //connecting legumes card using onclick mtd to navigate to page
        Legumes = findViewById(R.id.cd_15);
        Legumes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cholestrol.this, Legumes.class);
                startActivity(intent);
            }
        });

        //connecting rice card to that pages
        Rice = findViewById(R.id.cd_16);
        Rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cholestrol.this, RiceandCurry.class);
                startActivity(intent);
            }
        });

        //connecting back buttton using onclick mtd to navigate to dashboard
        back = findViewById(R.id.backtomain);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cholestrol.this, Dashboard.class);
                startActivity(intent);
            }
        });



    }

}