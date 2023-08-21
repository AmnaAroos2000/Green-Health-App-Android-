package com.amna.greenhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RedLentil extends AppCompatActivity {

    private ImageButton BackButton;
    private Button OrderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_lentil);

        //connecting back button to link to another page
        BackButton = findViewById(R.id.imageButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            //method creation
            public void onClick(View view) {
                Intent intent = new Intent(RedLentil.this, Pressure.class);
                startActivity(intent);
            }
        });

        //connecting oredr now button to link to another page
        OrderButton = findViewById(R.id.btn);
        OrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            //method creation
            public void onClick(View view) {
                Intent intent = new Intent(RedLentil.this, OrderNow.class);
                startActivity(intent);
            }
        });
    }
}