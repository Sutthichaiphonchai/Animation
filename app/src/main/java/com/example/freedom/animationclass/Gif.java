package com.example.freedom.animationclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Gif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif);

        GifMovieView gmv = (GifMovieView)findViewById(R.id.gifMovieView);
        gmv.setMovieResource(R.drawable.noproblem);
    }
}
