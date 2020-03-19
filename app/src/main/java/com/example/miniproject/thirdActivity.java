package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class thirdActivity extends AppCompatActivity {
    TextView root,bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        root= (TextView) findViewById(R.id.rt);
        root.setPaintFlags(root.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

        bus= (TextView) findViewById(R.id.bus);
        bus.setPaintFlags(bus.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);


    }


    public void onClick(View v) {
        if(R.id.rt1==v.getId())
        {
            Intent enterIntent = new Intent(thirdActivity.this, fourth1.class);
            startActivity(enterIntent);
        }
        if(R.id.rt2==v.getId())
        {
            Intent enterIntent = new Intent(thirdActivity.this, fourth2.class);
            startActivity(enterIntent);
        }

        if(R.id.rt3==v.getId())
        {
            Intent enterIntent = new Intent(thirdActivity.this, fourth3.class);
            startActivity(enterIntent);
        }
        if(R.id.rt4==v.getId())
        {
            Intent enterIntent = new Intent(thirdActivity.this, fourth4.class);
            startActivity(enterIntent);
        }
        if(R.id.rt5==v.getId())
        {
            Intent enterIntent = new Intent(thirdActivity.this, fourth5.class);
            startActivity(enterIntent);
        }
        if(R.id.rt6==v.getId())
        {
            Intent enterIntent = new Intent(thirdActivity.this, fourthActivity.class);
            startActivity(enterIntent);
        }

    }
}
