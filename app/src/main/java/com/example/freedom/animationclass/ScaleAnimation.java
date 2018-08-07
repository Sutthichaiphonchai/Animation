package com.example.freedom.animationclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

public class ScaleAnimation extends AppCompatActivity {

    ImageView imgLogo;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_animation);
        imgLogo = (ImageView)findViewById(R.id.imgLogo);

        Button btnNormalScale = (Button)findViewById(R.id.btnNormalScale);
        btnNormalScale.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                anim = new android.view.animation.ScaleAnimation(0, 1, 1, 1);
                anim.setDuration(1000);
                imgLogo.startAnimation(anim);
            }
        });

        Button btnToggleScale = (Button)findViewById(R.id.btnToggleScale);
        btnToggleScale.setOnClickListener(new View.OnClickListener() {
            float fromScale = 2, toScale = (float)0.5;
            public void onClick(View arg0) {
                anim = new android.view.animation.ScaleAnimation(fromScale
                        , toScale, fromScale, toScale
                        , imgLogo.getWidth() / 3
                        , imgLogo.getHeight() / 3);
                anim.setDuration(1000);
                anim.setFillEnabled(true);
                anim.setFillAfter(true);
                imgLogo.startAnimation(anim);
                float tempScale = fromScale;
                fromScale = toScale;
                toScale = tempScale;
            }
        });
    }
}
