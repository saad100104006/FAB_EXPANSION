package com.androidhive.fab_expansion;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.androidhive.fab_expansion.Utils.*;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab, fab1, fab2, fab3, fab4;
    LinearLayout motherLayout, fabLayout2, fabLayout3, fabLayout4;
    View fabBGLayout;
    boolean isFABOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floating_action_button);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      //  findViewById();

       // onClickListerner();


       // getFab(this,motherLayout);
       // getFab(this,fabLayout2);
        motherLayout = (LinearLayout) findViewById(R.id.fabLayout1);


         fab = new FloatingActionButton(this);
        fab.setId(View.generateViewId());
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG", "onFabFoo");
            }
        });
        fab.setImageResource(R.drawable.call);
        fab.setElevation(2);
        fab.setSize(FloatingActionButton.SIZE_MINI);
        fab.setFocusable(true);
        RelativeLayout.LayoutParams lay = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        lay.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
       // lay.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        lay.setMargins(2,2,2,2);
        fab.setLayoutParams(lay);
        motherLayout.addView(fab);

        fab.setVisibility(View.INVISIBLE);





         fab2 = new FloatingActionButton(this);
        fab2.setId(View.generateViewId());
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG", "onFabFoo");
            }
        });
        fab2.setImageResource(R.drawable.message);
        fab2.setElevation(2);
        fab2.setSize(FloatingActionButton.SIZE_MINI);
        fab2.setFocusable(true);
        fab2.setBackgroundColor(getResources().getColor(R.color.colorFAB1));

        fab2.setBackgroundTintList(ColorStateList.valueOf(0xFF4CAF50));
       // fab2.setBackgroundTintList(getResources().getColor(R.color.colorFAB1));
        RelativeLayout.LayoutParams lay2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        lay2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
      //  lay2.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        lay2.setMargins(2,6,2,2);
        fab2.setLayoutParams(lay2);

        motherLayout.addView(fab2);

        TextView valueTV = new TextView(this);
        valueTV.setText("hallo hallo");
        valueTV.setId(5);
        valueTV.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
        valueTV.setTextSize(16);
        valueTV.setPadding(5, 3, 0, 3);
        // valueTV.setTypeface(null, Typeface.ITALIC);
        valueTV.setGravity(Gravity.LEFT | Gravity.CENTER);

        motherLayout.addView(valueTV);



        fab2.setVisibility(View.INVISIBLE);


         fab3 = new FloatingActionButton(this);
        fab3.setId(View.generateViewId());
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isFABOpen) {
                    showFABMenu();
                } else {
                    closeFABMenu();
                }
            }
        });
        fab3.setImageResource(R.drawable.add);
        fab3.setElevation(2);
        fab3.setSize(FloatingActionButton.SIZE_NORMAL);
        fab3.setFocusable(true);
        RelativeLayout.LayoutParams lay3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        lay3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
       // lay3.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        lay3.setMargins(2,10,2,2);
      //  lay3.setMargins();
        fab3.setLayoutParams(lay3);




        motherLayout.addView(fab3);








    }

    public LinearLayout getFab(Context context, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        return (LinearLayout) inflater.inflate(R.layout.floating_action_button, parent, false);
    }


   /* private void findViewById() {
        motherLayout = (LinearLayout) findViewById(R.id.fabLayout1);
        fabLayout2 = (LinearLayout) findViewById(R.id.fabLayout2);
        fabLayout3 = (LinearLayout) findViewById(R.id.fabLayout3);
        fabLayout4 = (LinearLayout) findViewById(R.id.fabLayout4);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab3 = (FloatingActionButton) findViewById(R.id.fab3);
        fab4 = (FloatingActionButton) findViewById(R.id.fab4);
        fabBGLayout = findViewById(R.id.fabBGLayout);

    }*/

    private void onClickListerner() {


        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "message is tapped", Toast.LENGTH_SHORT).show();

            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "done is tapped", Toast.LENGTH_SHORT).show();

            }
        });

        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "call is tapped", Toast.LENGTH_SHORT).show();

            }
        });

        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "facebook is tapped", Toast.LENGTH_SHORT).show();

            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isFABOpen) {
                    showFABMenu();
                } else {
                    closeFABMenu();
                }
            }
        });

        fabBGLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeFABMenu();
            }
        });


    }

    private void showFABMenu() {
        isFABOpen = true;

        AnimationMoveUpwardBehavior(this,fab);
       // motherLayout.setVisibility(View.VISIBLE);
       // fabLayout2.setVisibility(View.VISIBLE);
       // fabLayout3.setVisibility(View.VISIBLE);
       // fabLayout4.setVisibility(View.VISIBLE);
      //  fabBGLayout.setVisibility(View.VISIBLE);

        fab3.animate().rotationBy(180);
        fab.setVisibility(View.VISIBLE);
        fab2.setVisibility(View.VISIBLE);



       // fab2.animate().translationY(-getResources().getDimension(R.dimen.standard_55));
       // fab.animate().translationY(-getResources().getDimension(R.dimen.standard_100));
      //  fabLayout3.animate().translationY(-getResources().getDimension(R.dimen.standard_145));
       // fabLayout4.animate().translationY(-getResources().getDimension(R.dimen.standard_190));
    }

    private void closeFABMenu() {
        isFABOpen = false;
       // fabBGLayout.setVisibility(View.GONE);
        fab3.animate().rotationBy(-180);

        fab.setVisibility(View.GONE);
        fab2.setVisibility(View.GONE);
        //motherLayout.animate().translationY(0);
       // fabLayout2.animate().translationY(0);
       // fabLayout3.animate().translationY(0);
    /*    fabLayout4.animate().translationY(0).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (!isFABOpen) {
                    motherLayout.setVisibility(View.GONE);
                    fabLayout2.setVisibility(View.GONE);
                    fabLayout3.setVisibility(View.GONE);
                    fabLayout4.setVisibility(View.GONE);
                }

            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });*/


    }

    @Override
    public void onBackPressed() {
        if (isFABOpen) {
            closeFABMenu();
        } else {
            super.onBackPressed();
        }
    }
}
