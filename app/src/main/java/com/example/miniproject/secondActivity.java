package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Random;

public class secondActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView bus;
    private Random random= new Random();
    private int lastdir;
    private boolean spinning;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        bus= findViewById(R.id.bus);
        bt=(Button) findViewById(R.id.enterbt);
        bt.setOnClickListener(this);

    }
    public void spinBus(View v){
    if(!spinning) {
        int newidr = random.nextInt(1800);
        float pivotx = bus.getWidth() / 2;
        float pivoty = bus.getHeight() / 2;

        Animation rotate = new RotateAnimation(lastdir, newidr, pivotx, pivoty);

        rotate.setDuration(2500);
        rotate.setFillAfter(true);
        rotate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
             spinning =true;
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                spinning=false;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        lastdir = newidr;
        bus.startAnimation(rotate);
    }

    }

    @Override
    public void onClick(View v) {
        Intent enterIntent = new Intent(secondActivity.this, thirdActivity.class);
            startActivity(enterIntent);



    }
}
