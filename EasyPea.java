package com.amna.greenhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EasyPea extends AppCompatActivity {

    //Declaring elements
    ImageButton backButton;
    Button orderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_pea);

        //linking back button to navigate to the pressure page
        backButton = findViewById(R.id.imageButton7);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EasyPea.this, Pressure.class);
                startActivity(intent);
            }
        });

        ////linking order button to navigate to the order page
        orderButton = findViewById(R.id.button20);
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EasyPea.this, OrderNow.class);
                startActivity(intent);
            }
        });
    }
}