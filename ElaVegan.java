package com.amna.greenhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ElaVegan extends AppCompatActivity {


    private ImageButton backButton;
    private Button orderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ela_vegan);

        //connecting back button to go back using onclick listner mtd
        backButton = findViewById(R.id.imageButton5);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ElaVegan.this, CommonFood.class);
                startActivity(intent);
            }
        });

        //connecting order now button using onclick listner mtd
        orderButton = findViewById(R.id.button10);
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ElaVegan.this, OrderNow.class);
                startActivity(intent);
            }
        });
    }
}