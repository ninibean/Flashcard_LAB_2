package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /*findViewById(R.id.choiceOne).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //findViewById(R.id.choiceOne).setBackgroundColor(255);
                findViewById(R.id.choiceOne).setBackgroundColor(getResources().getColor(R.color.red, null));
                findViewById(R.id.choiceTwo).setBackgroundColor(getResources().getColor(R.color.lightBlue, null));
                findViewById(R.id.choiceThree).setBackgroundColor(getResources().getColor(R.color.lightBlue, null));
            }
        }); */

        /* findViewById(R.id.choiceTwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.choiceOne).setBackgroundColor((getResources().getColor(R.color.lightBlue, null)));
                findViewById(R.id.choiceTwo).setBackgroundColor(getResources().getColor(R.color.green, null));
                findViewById(R.id.choiceThree).setBackgroundColor(getResources().getColor(R.color.lightBlue, null));
            }
        }); */

        /* findViewById(R.id.choiceThree).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.choiceOne).setBackgroundColor((getResources().getColor(R.color.lightBlue, null)));
                findViewById(R.id.choiceTwo).setBackgroundColor(getResources().getColor(R.color.lightBlue, null));
                findViewById(R.id.choiceThree).setBackgroundColor(getResources().getColor(R.color.red, null));
            }
        }); */

        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.new_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddCardActivity.class);
                //MainActivity.this.startActivity(intent);
                MainActivity.this.startActivityForResult(intent, 100);
            }
        });


        /* findViewById(R.id.toggle_choices_visibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.choiceOne).setVisibility(View.INVISIBLE);
                findViewById(R.id.choiceTwo).setVisibility(View.INVISIBLE);
                findViewById(R.id.choiceThree).setVisibility(View.INVISIBLE);
                ((ImageView) findViewById(R.id.toggle_choices_visibility)).setImageResource(R.drawable.iconoff);
            }
        }); */


    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100) { // this 100 needs to match the 100 we used when we called startActivityForResult!
            String string1 = data.getExtras().getString("string1"); // 'string1' needs to match the key we used when we put the string in the Intent
            String string2 = data.getExtras().getString("string2");
        }
    }


}
