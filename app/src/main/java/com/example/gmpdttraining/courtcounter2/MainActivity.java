package com.example.gmpdttraining.courtcounter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    int chel_goal_score = 0;
    int chel_foul = 0;

    int MU_goal_score = 0;
    int MU_foul = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chel_goal_button(View view){
        chel_goal_score = chel_goal_score + 1;
        displayChelGoals(chel_goal_score);
    }

    public void chel_foul_button(View view){
        chel_foul =  chel_foul + 1;
        displayChelFouls(chel_foul);
    }

    public void MU_goal_button(View view){
        MU_goal_score = MU_goal_score + 1;
        displayMUGoals(MU_goal_score);
    }

    public void MU_foul_button(View view){
        MU_foul = MU_foul + 1;
        displayMUFouls(MU_foul);
    }


    public void score_reset(View view){
        chel_goal_score = 0;
        chel_foul = 0;
        MU_goal_score = 0;
        MU_foul = 0;
        displayChelGoals(chel_goal_score);
        displayChelFouls(chel_foul);
        displayMUGoals(MU_goal_score);
        displayMUFouls(MU_foul);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayChelGoals(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chel_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayChelFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chel_foul_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayMUGoals(int score) {
        TextView scoreView = (TextView) findViewById(R.id.MU_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given foul score for Manchester United.
     */
    public void displayMUFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.MU_foul_score);
        scoreView.setText(String.valueOf(score));
    }
}
