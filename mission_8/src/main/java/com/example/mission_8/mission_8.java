package com.example.mission_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class mission_8 extends AppCompatActivity {
    Button customButton;
    Button salesButton;
    Button mdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission_8);

        customButton = findViewById(R.id.customButton);
        salesButton = findViewById(R.id.salesButton);
        mdButton = findViewById(R.id.mdButton);


        Intent intent = new Intent();
        intent = getIntent();
        String id = intent.getStringExtra("id");
        String password = intent.getStringExtra("password");

        if(id != null)
        {
            Toast toast =
                    Toast.makeText(getApplicationContext(),"ID : "+id +" Password : "+password +" 으로 로그인 됨!",Toast.LENGTH_LONG);
            toast.show();
        }


        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mission_8_Custom.class);
                startActivity(intent);
                finish();
            }
        });

        salesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mission_8_Sales.class);
                startActivity(intent);
                finish();
            }
        });

        mdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mission_8_Md.class);
                startActivity(intent);
                finish();
            }
        });
    }
}