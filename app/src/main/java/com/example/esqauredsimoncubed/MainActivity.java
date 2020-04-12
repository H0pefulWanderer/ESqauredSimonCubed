package com.example.esqauredsimoncubed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.simon1Btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlaySimon1();
            }
        });

        findViewById(R.id.simon2Btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlaySimon2();
            }
        });


        findViewById(R.id.simon3Btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlaySimon3();
            }
        });

    }

    private void PlaySimon1() {
        Intent intent = new Intent(getApplicationContext(),
                Play_Simon1.class);
        startActivity(intent);
    }

    private void PlaySimon2() {
        Intent intent = new Intent(getApplicationContext(),
                Play_Simon2.class);
        startActivity(intent);
    }

    private void PlaySimon3() {
        Intent intent = new Intent(getApplicationContext(),
                Play_Simon3.class);
        startActivity(intent);
    }
}
