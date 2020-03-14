package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);



        findViewById(R.id.cancel_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        findViewById(R.id.save_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText flashcard_question = (EditText) findViewById(R.id.editQuestion);
                EditText flashcard_answer = (EditText) findViewById(R.id.editAnswer);
                //((EditText) findViewById(R.id.editAnswer)).getText().toString();
                Intent data = new Intent();
                // data.putExtra("string1", "some string");
                // data.putExtra("string2", "some string2");
                data.putExtra("question", flashcard_question.getText().toString());
                data.putExtra("answer", flashcard_answer.getText().toString());
                setResult(RESULT_OK, data);
                finish();
            }
        });
    }
}
