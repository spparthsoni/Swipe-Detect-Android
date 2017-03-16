package com.example.pc.swipedetectandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Toast t;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Swipe can be detected only only  View! Here There is a full Screen ImageView of blue color

        img=(ImageView)findViewById(R.id.imageView);
        img.setOnTouchListener(new OnSwipeTouchListener(getApplicationContext()) {
            @Override
            public void onSwipeLeft() {
                // Whatever
                if (t!=null) {
                    t.makeText(context, "Swiped left", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    t.makeText(context, "Swiped left", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onSwipeRight() {
                if (t!=null) {
                    t.makeText(context, "Swiped Right", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    t.makeText(context, "Swiped Right", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onSwipeUp() {
                if (t!=null) {
                    t.makeText(context, "Swiped UP", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    t.makeText(context, "Swiped UP", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onSwipeDown() {
                if (t!=null) {
                    t.makeText(context, "Swiped Down", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    t.makeText(context, "Swiped Down", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
