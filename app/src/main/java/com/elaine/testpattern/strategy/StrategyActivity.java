package com.elaine.testpattern.strategy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.elaine.testpattern.R;

public class StrategyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);
        use();
    }

    private void use() {
        People people = new People(new Draw());
        people.play();

        people = new People(new PlayBall());
        people.play();
    }
}