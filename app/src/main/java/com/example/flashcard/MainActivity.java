package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById(R.id.choiceOne).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //findViewById(R.id.choiceOne).setBackgroundColor(255);
                findViewById(R.id.choiceOne).setBackgroundColor(getResources().getColor(R.color.red, null));
                findViewById(R.id.choiceTwo).setBackgroundColor(getResources().getColor(R.color.lightBlue, null));
                findViewById(R.id.choiceThree).setBackgroundColor(getResources().getColor(R.color.lightBlue, null));
            }
        });

        findViewById(R.id.choiceTwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.choiceOne).setBackgroundColor((getResources().getColor(R.color.lightBlue, null)));
                findViewById(R.id.choiceTwo).setBackgroundColor(getResources().getColor(R.color.green, null));
                findViewById(R.id.choiceThree).setBackgroundColor(getResources().getColor(R.color.lightBlue, null));
            }
        });

        findViewById(R.id.choiceThree).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.choiceOne).setBackgroundColor((getResources().getColor(R.color.lightBlue, null)));
                findViewById(R.id.choiceTwo).setBackgroundColor(getResources().getColor(R.color.lightBlue, null));
                findViewById(R.id.choiceThree).setBackgroundColor(getResources().getColor(R.color.red, null));
            }
        });

        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.choiceOne).setBackgroundColor((getResources().getColor(R.color.lightBlue, null)));
                findViewById(R.id.choiceTwo).setBackgroundColor(getResources().getColor(R.color.lightBlue, null));
                findViewById(R.id.choiceThree).setBackgroundColor(getResources().getColor(R.color.lightBlue, null));
            }
        });

        findViewById(R.id.toggle_choices_visibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.choiceOne).setVisibility(View.INVISIBLE);
                findViewById(R.id.choiceTwo).setVisibility(View.INVISIBLE);
                findViewById(R.id.choiceThree).setVisibility(View.INVISIBLE);
                ((ImageView) findViewById(R.id.toggle_choices_visibility)).setImageResource(R.drawable.iconoff);
            }
        });


    }
}
