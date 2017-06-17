package com.androidhive.fab_expansion;


import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String TAG = "TEST";
    private Boolean isFabOpen = false;
    private FloatingActionButton fab, fab1, fab2, fab3, fab4;
    private Animation fab_open, fab_close, rotate_forward, rotate_backward;
    TextView textFab, textFab2, textFab3, textFab4;
    CoordinatorLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById();
        initializeAnimation();
        initializeClickLister();

    }


   public void findViewById(){

       fab = (FloatingActionButton) findViewById(R.id.fab);
       fab1 = (FloatingActionButton) findViewById(R.id.fab1);
       fab2 = (FloatingActionButton) findViewById(R.id.fab2);
       fab3 = (FloatingActionButton) findViewById(R.id.fab3);
       fab4 = (FloatingActionButton) findViewById(R.id.fab4);
       textFab = (TextView) findViewById(R.id.textfab1);
       textFab2 = (TextView) findViewById(R.id.textfab2);
       textFab3 = (TextView) findViewById(R.id.textfab3);
       textFab4 = (TextView) findViewById(R.id.textfab4);
       layout = (CoordinatorLayout) findViewById(R.id.mother);
   }

    public void initializeAnimation(){


        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_backword);

    }

    public void initializeClickLister(){


        fab.setOnClickListener(this);
        fab1.setOnClickListener(this);
        fab2.setOnClickListener(this);
        fab3.setOnClickListener(this);
        fab4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.fab:

                animateFAB();

                break;
            case R.id.fab1:

                Log.d(TAG, "Fab 1");

                Toast.makeText(getApplicationContext(), "message is tapped", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fab2:

                Log.d(TAG, "Fab 2");
                Toast.makeText(getApplicationContext(), "done is tapped", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fab3:

                Log.d(TAG, "Fab 3");
                Toast.makeText(getApplicationContext(), "call is tapped", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fab4:

                Log.d(TAG, "Fab 4");
                Toast.makeText(getApplicationContext(), "facebook is tapped", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void animateFAB() {

        if (isFabOpen) {

            textFab.setVisibility(View.GONE);
            textFab2.setVisibility(View.GONE);
            textFab3.setVisibility(View.GONE);
            textFab4.setVisibility(View.GONE);

            fab.startAnimation(rotate_backward);
            fab1.startAnimation(fab_close);
            fab2.startAnimation(fab_close);
            fab3.startAnimation(fab_close);
            fab4.startAnimation(fab_close);
            fab1.setClickable(false);
            fab2.setClickable(false);
            fab3.setClickable(false);
            fab4.setClickable(false);

            layout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorWhite));

            isFabOpen = false;
            Log.d(TAG, "close");

        } else {


            fab.startAnimation(rotate_forward);
            fab1.startAnimation(fab_open);
            fab2.startAnimation(fab_open);
            fab3.startAnimation(fab_open);
            fab4.startAnimation(fab_open);
            fab1.setClickable(true);
            fab2.setClickable(true);
            fab4.setClickable(true);


            textFab.setVisibility(View.VISIBLE);
            textFab2.setVisibility(View.VISIBLE);
            textFab3.setVisibility(View.VISIBLE);
            textFab4.setVisibility(View.VISIBLE);

            textFab.setText("message");
            textFab2.setText("done");
            textFab3.setText("call");
            textFab4.setText("facebook");

            layout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorGray));

            isFabOpen = true;
            Log.d(TAG, "open");

        }
    }
}