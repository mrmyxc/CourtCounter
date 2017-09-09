package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scoreViewA, scoreViewB;
    View freeThrowA, freeThrowB;
    View twoPointerA, twoPointerB;
    View threePointerA, threePointerB;
    View resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        scoreViewA = (TextView) findViewById(R.id.team_a_score);
        freeThrowA = (Button) findViewById(R.id.ftA);
        twoPointerA = (Button) findViewById(R.id.twptsA);
        threePointerA = (Button) findViewById(R.id.thptsA);

        scoreViewB = (TextView) findViewById(R.id.team_b_score);
        freeThrowB = (Button) findViewById(R.id.ftB);
        twoPointerB = (Button) findViewById(R.id.twptsB);
        threePointerB = (Button) findViewById(R.id.thptsB);

        resetButton = (Button) findViewById(R.id.rstbtn);


        freeThrowA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentScore = Integer.parseInt(scoreViewA.getText().toString());
                DisplayForTeamA(++currentScore);
            }
        });


        twoPointerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentScore = Integer.parseInt(scoreViewA.getText().toString());
                DisplayForTeamA(currentScore+2);
            }
        });

        threePointerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentScore = Integer.parseInt(scoreViewA.getText().toString());
                DisplayForTeamA(currentScore+3);
            }
        });


        freeThrowB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentScore = Integer.parseInt(scoreViewB.getText().toString());
                DisplayForTeamB(++currentScore);
            }
        });


        twoPointerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentScore = Integer.parseInt(scoreViewB.getText().toString());
                DisplayForTeamB(currentScore+2);
            }
        });

        threePointerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentScore = Integer.parseInt(scoreViewB.getText().toString());
                DisplayForTeamB(currentScore+3);
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayForTeamA(0);
                DisplayForTeamB(0);
            }
        });


    }



    public void DisplayForTeamA (int score)
    {
        scoreViewA.setText(String.valueOf(score));
    }

    public void DisplayForTeamB (int score)
    {
        scoreViewB.setText(String.valueOf(score));
    }



}
