package com.example.lipeijing.flappybird.flappybird;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lipeijing.flappybird.R;
import com.example.lipeijing.flappybird.game.GameSurface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        setContentView(new GameSurface(this));

    }
}
