package com.example.animation_api;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button1, button2, button3, button4;
    private boolean isSpeakButtonLongPressed = false;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.arrow);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        boolean isLandscape = isInLandscape();
        if (isLandscape) {

            Animation rotation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
            rotation.setFillAfter(true);
            imageView.startAnimation(rotation);


            button1.setOnTouchListener(new View.OnTouchListener() {

                GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {
                    @Override
                    public void onLongPress(MotionEvent e) {
                        imageView.clearAnimation();
                        imageView.animate().rotation(0).setDuration(0);
                        super.onLongPress(e);
                    }

                    @Override
                    public boolean onDoubleTap(MotionEvent e) {
                        imageView.clearAnimation();
                        imageView.animate().rotation(180).setDuration(0);
                        return super.onDoubleTap(e);
                    }
                });

                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    gestureDetector.onTouchEvent(event);

                    if (event.getAction() == MotionEvent.ACTION_UP) {

                        Animation rotation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                        rotation.setFillAfter(true);
                        imageView.startAnimation(rotation);

                    }
                    return false;
                }
            });


            button2.setOnTouchListener(new View.OnTouchListener() {

                GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {
                    @Override
                    public void onLongPress(MotionEvent e) {
                        imageView.clearAnimation();
                        imageView.animate().rotation(270).setDuration(0);
                        super.onLongPress(e);
                    }

                    @Override
                    public boolean onDoubleTap(MotionEvent e) {
                        imageView.clearAnimation();
                        imageView.animate().rotation(90).setDuration(0);
                        return super.onDoubleTap(e);
                    }
                });

                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    gestureDetector.onTouchEvent(event);

                    if (event.getAction() == MotionEvent.ACTION_UP) {

                        Animation rotation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                        rotation.setFillAfter(true);
                        imageView.startAnimation(rotation);

                    }
                    return false;
                }
            });


            button3.setOnTouchListener(new View.OnTouchListener() {

                GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {
                    @Override
                    public void onLongPress(MotionEvent e) {
                        imageView.clearAnimation();
                        imageView.animate().rotation(90).setDuration(0);
                        super.onLongPress(e);
                    }

                    @Override
                    public boolean onDoubleTap(MotionEvent e) {
                        imageView.clearAnimation();
                        imageView.animate().rotation(270).setDuration(0);
                        return super.onDoubleTap(e);
                    }
                });

                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    gestureDetector.onTouchEvent(event);

                    if (event.getAction() == MotionEvent.ACTION_UP) {

                        Animation rotation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                        rotation.setFillAfter(true);
                        imageView.startAnimation(rotation);

                    }
                    return false;
                }
            });




            button4.setOnTouchListener(new View.OnTouchListener() {

                GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {
                    @Override
                    public void onLongPress(MotionEvent e) {
                        imageView.clearAnimation();
                        imageView.animate().rotation(180).setDuration(0);
                        super.onLongPress(e);
                    }

                    @Override
                    public boolean onDoubleTap(MotionEvent e) {
                        imageView.clearAnimation();
                        imageView.animate().rotation(0).setDuration(0);
                        return super.onDoubleTap(e);
                    }
                });

                @Override
                public boolean onTouch(View v, MotionEvent event) {

                    gestureDetector.onTouchEvent(event);

                    if (event.getAction() == MotionEvent.ACTION_UP) {

                        Animation rotation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                        rotation.setFillAfter(true);
                        imageView.startAnimation(rotation);

                    }
                    return false;
                }
            });


        }

    }

    public boolean isInLandscape() {
        int orientation = getResources().getConfiguration().orientation;
        return orientation == Configuration.ORIENTATION_LANDSCAPE;
    }


}