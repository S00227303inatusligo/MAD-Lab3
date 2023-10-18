package com.example.mad_lab3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button hipHopButton = findViewById(R.id.button);
        Button rockNRollButton = findViewById(R.id.button2);
        Button sambaButton = findViewById(R.id.button3);

        hipHopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A2 = new Intent(v.getContext(), Activity2.class);
                startActivity(A2);
            }
        });

        rockNRollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A2 = new Intent(v.getContext(), Activity2.class);
                startActivity(A2);
            }
        });

        sambaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A2 = new Intent(v.getContext(), Activity2.class);
                startActivity(A2);
            }
        });
    }
}