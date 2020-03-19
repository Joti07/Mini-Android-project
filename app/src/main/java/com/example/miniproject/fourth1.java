package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fourth1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth1);
    }
    public void Onclick(View v)
    {
        if(v.getId()==R.id.bt)
        {
            Intent enterIntent = new Intent(fourth1.this, thirdActivity.class);
            startActivity(enterIntent);
        }
    }
}
