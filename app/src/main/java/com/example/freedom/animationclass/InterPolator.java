package com.example.freedom.animationclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class InterPolator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter_polator);


        RelativeLayout layout = (RelativeLayout)findViewById(R.id.layout);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);

        Animation anim = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0f
                , Animation.RELATIVE_TO_PARENT, 0f
                , Animation.RELATIVE_TO_PARENT, 1f
                , Animation.RELATIVE_TO_PARENT, 0f);
        anim.initialize(imageView.getWidth(), imageView.getHeight()
                , layout.getWidth(), layout.getHeight());
        anim.setDuration(2000);
        anim.setFillAfter(true);

        anim.setInterpolator(new AccelerateInterpolator(0.5f));

        imageView.startAnimation(anim);

    }
}
