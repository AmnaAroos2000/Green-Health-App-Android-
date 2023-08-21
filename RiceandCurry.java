package com.amna.greenhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RiceandCurry extends AppCompatActivity {

    private ImageButton BackButton;
    private Button OrderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riceand_curry);

        //connecting back button to go back using onclick listner mtd
        BackButton = findViewById(R.id.imageButton7);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RiceandCurry.this, Cholestrol.class);
                startActivity(intent);
            }
        });

        //connecting order now button using onclick listner mtd
        OrderButton = findViewById(R.id.button20);
        OrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RiceandCurry.this, OrderNow.class);
                startActivity(intent);
            }
        });
    }
}