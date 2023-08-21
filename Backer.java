package com.amna.greenhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Backer extends AppCompatActivity {

    //Initializing the elements
    private ImageButton BackButton;
    private Button OrderButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backer);

        //connecting back button to link to common food page
        BackButton = findViewById(R.id.imageButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            //method creation
            public void onClick(View view) {
                Intent intent = new Intent(Backer.this, CommonFood.class);
                startActivity(intent);
            }
        });

        //connecting oredr now button to link to order page
        OrderButton = findViewById(R.id.btn);
        OrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            //method creation
            public void onClick(View view) {
                Intent intent = new Intent(Backer.this, OrderNow.class);
                startActivity(intent);
            }
        });
    }


}