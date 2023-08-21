package com.amna.greenhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Legumes extends AppCompatActivity {

    private ImageButton backButton;
    private Button orderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legumes);

        //connecting back button to go back using onclick listner mtd
        backButton = findViewById(R.id.imageButton7);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Legumes.this, CommonFood.class);
                startActivity(intent);
            }
        });

        //connecting order now button using onclick listner mtd
        orderButton = findViewById(R.id.button20);
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Legumes.this, OrderNow.class);
                startActivity(intent);
            }
        });

    }

}