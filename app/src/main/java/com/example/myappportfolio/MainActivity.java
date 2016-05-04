package com.example.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button popular_button=(Button) findViewById(R.id.popular_button);
        Button stock_button=(Button) findViewById(R.id.stock_button);
        Button bigger_button=(Button) findViewById(R.id.bigger_button);
        Button material_button=(Button) findViewById(R.id.material_button);
        Button go_button=(Button) findViewById(R.id.go_button);
        Button cap_button=(Button) findViewById(R.id.cap_button);


        popular_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launce my Popular Movies app!", Toast.LENGTH_LONG).show();

            }

        });
        stock_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launce my Stock Hawk app!", Toast.LENGTH_LONG).show();
            }
        });
        bigger_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launce my Build it Bigger app!", Toast.LENGTH_LONG).show();
            }
        });
        material_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launce my Make Your App Material app!", Toast.LENGTH_LONG).show();
            }
        });
        go_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launce my Go Ubiquitous app!", Toast.LENGTH_LONG).show();
            }
        });
        cap_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launce my Capstone app!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
