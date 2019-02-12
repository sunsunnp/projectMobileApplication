package com.example.asus.projcet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class body extends AppCompatActivity {

    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);

        Bundle bundle = getIntent().getExtras();
        text = bundle.getString("name");
    }
    public void body1(View view) {

        Toast.makeText(this,""+"ผิด",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,score.class);
        intent.putExtra("name",text);
        startActivity(intent);
    }
    public void body2(View view) {

        Toast.makeText(this,""+"ผิด",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,score.class);
        intent.putExtra("name",text);
        startActivity(intent);
    }

    public void body3(View view) {

        Toast.makeText(this,""+"ผิด",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,score.class);
        intent.putExtra("name",text);
        startActivity(intent);
    }
    public void body4(View view) {

        Toast.makeText(this,""+"ผิด",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,score.class);
        intent.putExtra("name",text);
        startActivity(intent);
    }
}
