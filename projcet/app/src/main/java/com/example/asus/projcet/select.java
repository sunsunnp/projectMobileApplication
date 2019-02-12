package com.example.asus.projcet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class select extends AppCompatActivity {
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        Bundle bundle = getIntent().getExtras();
        text = bundle.getString("name");
    }

    public void body(View view){
        EditText name = findViewById(R.id.name1);
        String name1 = name.getText().toString();
        Intent intent = new Intent(this,body.class);
        intent.putExtra("name",text);
        startActivity(intent);
    }
}
