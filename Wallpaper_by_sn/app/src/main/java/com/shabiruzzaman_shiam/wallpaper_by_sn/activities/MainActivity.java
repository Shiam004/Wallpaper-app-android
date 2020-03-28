package com.shabiruzzaman_shiam.wallpaper_by_sn.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.shabiruzzaman_shiam.wallpaper_by_sn.R;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    ImageView imageView;
    Animation animation_top,animation_bottom;

    private static int SPLASH_SCREEN=4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        animation_top = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        animation_bottom = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        textView1 = findViewById(R.id.logotext);
        imageView = findViewById(R.id.logo);

        imageView.setAnimation(animation_top);
        textView1.setAnimation(animation_bottom);

        //rest of the code we have done in the previous video...
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Dashboard.class);

                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View,String>(imageView,"logo_image");
                pairs[1] = new Pair<View,String>(textView1,"logo_text");

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                    startActivity(intent,options.toBundle());

                }
            }
        },SPLASH_SCREEN);





    }
}
