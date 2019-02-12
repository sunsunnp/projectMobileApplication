package com.example.asus.projcet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        EditText name = findViewById(R.id.name1);
        String name1 = name.getText().toString();
        Intent intent = new Intent(this,select.class);
        intent.putExtra("name",name1);
        startActivity(intent);
    }

}
