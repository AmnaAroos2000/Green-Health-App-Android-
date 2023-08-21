package com.amna.greenhealth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pressure extends AppCompatActivity {

    //Declaring variables
    private Button tipsButton;
    private CardView easyPea, redLentil;
    private TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);

        //connecting tips for you button to pressure tips page
        tipsButton = findViewById(R.id.tips2);
        tipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pressure.this, PressureTips.class);
                startActivity(intent);
            }
        });

        //connecting easy pea food page
        easyPea = findViewById(R.id.cd_19);
        easyPea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pressure.this, EasyPea.class);
                startActivity(intent);
            }
        });

        //connecting red lentil food page
        redLentil = findViewById(R.id.cd_20);
        redLentil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pressure.this, RedLentil.class);
                startActivity(intent);
            }
        });

        //connecting back button to dashboard page
        back = findViewById(R.id.backtomain);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pressure.this, Dashboard.class);
                startActivity(intent);
            }
        });

    }

}