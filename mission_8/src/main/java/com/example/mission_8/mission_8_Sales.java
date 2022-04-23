package com.example.mission_8;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mission_8_Sales extends AppCompatActivity {
    Button smenuButton;
    Button sloginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission_8_sales);

        smenuButton = findViewById(R.id.smenuButton);
        sloginButton = findViewById(R.id.sloginButton);

        smenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),mission_8.class);
                startActivity(intent);
                finish();
            }
        });

        sloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mission_8_Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}