package com.example.asus.projcet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class body extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);
        mScoreView = (TextView)findViewById(R.id.score1);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.c1);
        mButtonChoice2 = (Button)findViewById(R.id.c2);
        mButtonChoice3 = (Button)findViewById(R.id.c3);
        mButtonChoice4 = (Button)findViewById(R.id.c4);

        updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(body.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(body.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(body.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(body.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });


        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(body.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(body.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice4.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(body.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(body.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });


    }

    private void updateQuestion(){
        if(mQuestionNumber >= 5){
            Intent intent = new Intent(body.this, score.class);
            Intent intents = getIntent();
            String name = intents.getStringExtra("name");
            String type = intents.getStringExtra("type");
            String date = intents.getStringExtra("date");
            intent.putExtra("name", name+"");
            intent.putExtra("score", mScore+"" );
            intent.putExtra("type", type+"");
            intent.putExtra("date", date+"");
            startActivity(intent);
        }
        else{
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));


            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }

    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
    }
}