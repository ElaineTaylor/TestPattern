package com.elaine.testpattern.observer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.elaine.testpattern.R;

/**
 * 观察者模式
 */
public class ObserverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
        use();
    }

    private void use() {
        Subject subject = new Subject();
        new AObserver(subject);
        new BObserver(subject);

        Log.e("data===", "old data is 15");
        subject.setData(15);
        Log.e("data===", "new data is 35");
        subject.setData(35);
    }
}