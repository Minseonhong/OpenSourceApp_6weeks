package com.example.mission_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mission_8_Custom extends AppCompatActivity {

    Button cmenuButton;
    Button cloginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission_8_custom);

        cmenuButton = findViewById(R.id.cmenuButton);
        cloginButton = findViewById(R.id.cloginButton);

        cmenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),mission_8.class);
                startActivity(intent);
                finish();
            }
        });

        cloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mission_8_Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}