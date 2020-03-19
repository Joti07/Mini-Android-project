package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=(ImageView) findViewById(R.id.i1);
        i1.setOnClickListener(this);
    }


    public void onClick(View v) {
        if(v.getId()==R.id.i1)
        {
            Intent enterIntent = new Intent(MainActivity.this, secondActivity.class);
            startActivity(enterIntent);
        }

    }
}
