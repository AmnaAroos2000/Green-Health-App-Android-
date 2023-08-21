package com.amna.greenhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LocationSelection extends AppCompatActivity {

    //declaring elements
    private Button mapButton, gpsButton;
    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_selection);

        //connecting button to the location page
        mapButton = findViewById(R.id.locate);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocationSelection.this, Location.class);
                startActivity(intent);
            }
        });

        //connecting button to the gps location page
        gpsButton = findViewById(R.id.gps);
        gpsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocationSelection.this, GpsLocation.class);
                startActivity(intent);
            }
        });

        //connecting button to the dashboard page
        backButton = findViewById(R.id.imageButton5);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocationSelection.this, Dashboard.class);
                startActivity(intent);
            }
        });

    }

}