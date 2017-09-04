package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final int THREE_POINTS = 3;
    final int TWO_POINTS = 2;
    final int ONE_POINT = 1;
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + THREE_POINTS;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoPointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + TWO_POINTS;
        displayForTeamA(scoreTeamA);
    }

    public void addOnePointForTeamA(View view) {
        scoreTeamA = scoreTeamA + ONE_POINT;
        displayForTeamA(scoreTeamA);
    }

    public void addThreePointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + THREE_POINTS;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoPointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + TWO_POINTS;
        displayForTeamB(scoreTeamB);
    }

    public void addOnePointForTeamB(View view) {
        scoreTeamB = scoreTeamB + ONE_POINT;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetAllScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
