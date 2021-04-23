package com.elaine.testpattern.decorator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.elaine.testpattern.R;

public class DecoratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator);
        use();
    }

    private void use() {
        //可以拍照打电话计算的手机
        PhoneUse phoneUse = new PhotographUse(new CalculateUse(new CallUse()));
        phoneUse.use();
    }
}