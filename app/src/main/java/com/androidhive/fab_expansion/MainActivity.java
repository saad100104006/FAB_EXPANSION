package com.androidhive.fab_expansion;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab3, fab1, fab4, fabRoot, fab2;
    LinearLayout motherLayout, fabLayout2, fabLayout3, fabLayout4;
    View fabBGLayout;
    boolean isFABOpen = false;
    TypedArray imgs;
    int[] colors = new int[]{
            Color.BLACK,
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.YELLOW
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floating_action_button);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //findViewById();
        // onClickListerner();
        // getFab(this,motherLayout);
        // getFab(this,fabLayout2);

        motherLayout = (LinearLayout) findViewById(R.id.fabLayout1);
        imgs = getResources().obtainTypedArray(R.array.fab_imgs);



//setting child fabs programetically

//ONE
        fab1 = new FloatingActionButton(this);
        fab1.setId(View.generateViewId());
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG", "onFabFoo");
            }
        });
        fab1.setImageResource(imgs.getResourceId(4, -1));
        fab1.setBackgroundTintList(ColorStateList.valueOf(colors[3]));
        fab1.setElevation(6);
        fab1.setSize(FloatingActionButton.SIZE_MINI);
        fab1.setFocusable(true);
        RelativeLayout.LayoutParams lay5 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        lay5.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        // lay.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        lay5.setMargins(2, 2, 2, 2);
        fab1.setLayoutParams(lay5);
        motherLayout.addView(fab1);
        fab1.hide();


        //TWO
        fab2 = new FloatingActionButton(this);
        fab2.setId(View.generateViewId());
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG", "onFabFoo");
            }
        });
        fab2.setImageResource(imgs.getResourceId(3, -1));
        fab2.setBackgroundTintList(ColorStateList.valueOf(colors[4]));
        fab2.setElevation(6);
        fab2.setSize(FloatingActionButton.SIZE_MINI);
        fab2.setFocusable(true);
        RelativeLayout.LayoutParams lay4 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        lay4.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        // lay.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        lay4.setMargins(2, 2, 2, 2);
        fab2.setLayoutParams(lay4);
        motherLayout.addView(fab2);
        fab2.hide();

//THREE

        fab3 = new FloatingActionButton(this);
        fab3.setId(View.generateViewId());
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG", "onFabFoo");
            }
        });
        fab3.setImageResource(imgs.getResourceId(2, -1));
        fab3.setBackgroundTintList(ColorStateList.valueOf(colors[2]));
        fab3.setElevation(6);
        fab3.setSize(FloatingActionButton.SIZE_MINI);
        fab3.setFocusable(true);
        RelativeLayout.LayoutParams lay = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        lay.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        // lay.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        lay.setMargins(2, 2, 2, 2);
        fab3.setLayoutParams(lay);
        motherLayout.addView(fab3);
        fab3.hide();





//FOUR


        fab4 = new FloatingActionButton(this);
        fab4.setId(View.generateViewId());
        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG", "onFabFoo");
            }
        });
        fab4.setImageResource(imgs.getResourceId(1, -1));
        fab4.setElevation(6);
        fab4.setSize(FloatingActionButton.SIZE_MINI);
        fab4.setFocusable(true);
        fab4.setBackgroundColor(getResources().getColor(R.color.colorFAB1));

        fab4.setBackgroundTintList(ColorStateList.valueOf(colors[1]));
        // fab4.setBackgroundTintList(getResources().getColor(R.color.colorFAB1));
        RelativeLayout.LayoutParams lay2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        lay2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        //  lay2.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        lay2.setMargins(2, 6, 2, 2);
        fab4.setLayoutParams(lay2);

        motherLayout.addView(fab4);
        fab4.hide();




      /*  TextView valueTV = new TextView(this);
        valueTV.setId(View.generateViewId());
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.RIGHT_OF, fab4.getId());
        valueTV.setLayoutParams(params);
        valueTV.setTextSize(16);
        valueTV.setPadding(0, 0, 0, 0);
        // valueTV.setTypeface(null, Typeface.ITALIC);
        valueTV.setGravity(Gravity.RIGHT );
        valueTV.setText("hallo hallo");
        motherLayout.addView(valueTV);*/







//setting main fab3 programetically


        fabRoot = new FloatingActionButton(this);
        fabRoot.setId(View.generateViewId());
        fabRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isFABOpen) {
                    showFABMenu();
                } else {
                    closeFABMenu();
                }
            }
        });
        fabRoot.setImageResource(imgs.getResourceId(0, -1));
        fabRoot.setBackgroundTintList(ColorStateList.valueOf(colors[3]));
        fabRoot.setElevation(6);
        fabRoot.setSize(FloatingActionButton.SIZE_NORMAL);
        fabRoot.setFocusable(true);
        RelativeLayout.LayoutParams lay3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        lay3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        // lay3.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        lay3.setMargins(2, 10, 2, 2);
        //  lay3.setMargins();
        fabRoot.setLayoutParams(lay3);
        motherLayout.addView(fabRoot);


    }

  /*  public LinearLayout getFab(Context context, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        return (LinearLayout) inflater.inflate(R.layout.floating_action_button, parent, false);
    }

*/
   /* private void findViewById() {
        motherLayout = (LinearLayout) findViewById(R.id.fabLayout1);
        fabLayout2 = (LinearLayout) findViewById(R.id.fabLayout2);
        fabLayout3 = (LinearLayout) findViewById(R.id.fabLayout3);
        fabLayout4 = (LinearLayout) findViewById(R.id.fabLayout4);
        fab3 = (FloatingActionButton) findViewById(R.id.fab3);
        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab4 = (FloatingActionButton) findViewById(R.id.fab4);
        fabRoot = (FloatingActionButton) findViewById(R.id.fabRoot);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fabBGLayout = findViewById(R.id.fabBGLayout);

    }*/

 /*   private void onClickListerner() {


        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "message is tapped", Toast.LENGTH_SHORT).show();

            }
        });

        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "done is tapped", Toast.LENGTH_SHORT).show();

            }
        });

        fabRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "call is tapped", Toast.LENGTH_SHORT).show();

            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "facebook is tapped", Toast.LENGTH_SHORT).show();

            }
        });

        fab3.setOnClickListener(new View.OnClickListener() {
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


    }*/

    private void showFABMenu() {
        isFABOpen = true;


        // motherLayout.setVisibility(View.VISIBLE);
        // fabLayout2.setVisibility(View.VISIBLE);
        // fabLayout3.setVisibility(View.VISIBLE);
        // fabLayout4.setVisibility(View.VISIBLE);
        //  fabBGLayout.setVisibility(View.VISIBLE);

        fabRoot.animate().rotationBy(180);
        fab3.show();
        fab4.show();
        fab2.show();
        fab1.show();


        // fab4.animate().translationY(-getResources().getDimension(R.dimen.standard_55));
        // fab3.animate().translationY(-getResources().getDimension(R.dimen.standard_100));
        //  fabLayout3.animate().translationY(-getResources().getDimension(R.dimen.standard_145));
        // fabLayout4.animate().translationY(-getResources().getDimension(R.dimen.standard_190));
    }

    private void closeFABMenu() {
        isFABOpen = false;
        // fabBGLayout.setVisibility(View.GONE);
        fabRoot.animate().rotationBy(-180);

        fab3.hide();
        fab4.hide();
        fab2.hide();
        fab1.hide();
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
