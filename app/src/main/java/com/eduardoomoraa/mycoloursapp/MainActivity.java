package com.eduardoomoraa.mycoloursapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnWhite, btnBlack, btnBlue, btnRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWhite = findViewById(R.id.invisible);
        btnBlack = findViewById(R.id.invisible);
        btnBlue = findViewById(R.id.invisible);
        btnRed = findViewById(R.id.invisible);

        btnWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("MainActivity", "white");
                Intent i = new Intent(getApplicationContext(), ColorActivity.class);
                i.putExtra("color", "1");
                startActivity(i);
            }
        });

        btnBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("MainActivity", "black");
                Intent i = new Intent(getApplicationContext(), ColorActivity.class);
                i.putExtra("color", "2");
                startActivity(i);
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("MainActivity", "blue");
                Intent i = new Intent(getApplicationContext(), ColorActivity.class);
                i.putExtra("color", "3");
                startActivity(i);
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("MainActivity", "red");
                Intent i = new Intent(getApplicationContext(), ColorActivity.class);
                i.putExtra("color", "4");
                startActivity(i);
            }
        });

    }
}

