package com.amna.greenhealth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CommonFood extends AppCompatActivity {

    //Initializing elements
    private CardView backer, fueled, elaVegan, veganRicha;
    private Button tipsButton;
    private TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_food);

        //connecting backer card using onclick mtd to navigate to that page
        backer = findViewById(R.id.cd_10);
        backer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonFood.this, Backer.class);
                startActivity(intent);
            }
        });

        //connecting fueled card using onclick mtd to navigate to that pages
        fueled = findViewById(R.id.cd_12);
        fueled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonFood.this, Fueled.class);
                startActivity(intent);
            }
        });

        //connecting ela vegan card using onclick mtd to navigate to that pages
        elaVegan = findViewById(R.id.cd_13);
        elaVegan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonFood.this, ElaVegan.class);
                startActivity(intent);
            }
        });

        //connecting vegan richa card using onclick mtd to navigate to that pages
        veganRicha = findViewById(R.id.cd_14);
        veganRicha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonFood.this, VeganRicha.class);
                startActivity(intent);
            }
        });

        //connecting tips for you buttton using onclick mtd to navigate to another pages
        tipsButton = findViewById(R.id.tips);
        tipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonFood.this, CommonTips.class);
                startActivity(intent);
            }
        });

        //connecting back button to the Dashbord page
        back = findViewById(R.id.backtomain);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommonFood.this, Dashboard.class);
                startActivity(intent);
            }
        });

    }

}