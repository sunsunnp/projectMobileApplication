package com.example.asus.projcet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class score extends AppCompatActivity {
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        Bundle bundle = getIntent().getExtras();
        text = bundle.getString("name");

        TextView text1 = findViewById(R.id.score);
        text1.setText(""+text);
    }

}
