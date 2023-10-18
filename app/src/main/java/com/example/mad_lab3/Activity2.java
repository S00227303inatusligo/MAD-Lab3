package com.example.mad_lab3;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.eazegraph.lib.models.PieModel;

public class Activity2 extends AppCompatActivity {

    org.eazegraph.lib.charts.PieChart pieChart;

    TextView hipHop;
    TextView rockNRoll;
    TextView samba;
    int hipHopNumber = 87, rockNRollNumber = 63, sambaNumber = 50, totalMembers = 200;
    String totalMembersButtonText = "Total Members : " + totalMembers;
    String hipHopButtonText = "Hip Hop : " + hipHopNumber;
    String rockNRollButtonText = "RockNRoll : " + rockNRollNumber;
    String sambaButtonText = "Samba : " + sambaNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        hipHop = findViewById(R.id.hipHop);
        rockNRoll = findViewById(R.id.rockNRoll);
        samba = findViewById(R.id.samba);
        pieChart = findViewById(R.id.piechart);

        setData();

        Button totalMembersButton = findViewById(R.id.button7);
        Button hipHopButton = findViewById(R.id.button4);
        Button rockNRollButton = findViewById(R.id.button5);
        Button sambaButton = findViewById(R.id.button6);

        totalMembersButton.setText(totalMembersButtonText);
        hipHopButton.setText(hipHopButtonText);
        rockNRollButton.setText(rockNRollButtonText);
        sambaButton.setText(sambaButtonText);

        totalMembersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A1 = new Intent(v.getContext(), MainActivity.class);
                startActivity(A1);
            }
        });

        hipHopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A1 = new Intent(v.getContext(), MainActivity.class);
                startActivity(A1);
            }
        });

        rockNRollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A1 = new Intent(v.getContext(), MainActivity.class);
                startActivity(A1);
            }
        });

        sambaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A1 = new Intent(v.getContext(), MainActivity.class);
                startActivity(A1);
            }
        });
        }

    private void setData() {
        // Set the percentage of language used
        hipHop.setText(Integer.toString(41));
        rockNRoll.setText(Integer.toString(31));
        samba.setText(Integer.toString(28));

        // Set the data and color to the pie chart
        pieChart.addPieSlice(
                new PieModel(
                        "Hip Hop",
                        Integer.parseInt(hipHop.getText().toString()),
                        Color.parseColor("#008000")));
        pieChart.addPieSlice(
                new PieModel(
                        "Rock N ROll",
                        Integer.parseInt(rockNRoll.getText().toString()),
                        Color.parseColor("#FF0000")));
        pieChart.addPieSlice(
                new PieModel(
                        "Samba",
                        Integer.parseInt(samba.getText().toString()),
                        Color.parseColor("#FFA500")));

        // To animate the pie chart
        pieChart.startAnimation();
    }
}