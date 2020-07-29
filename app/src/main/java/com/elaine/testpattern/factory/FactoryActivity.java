package com.elaine.testpattern.factory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.elaine.testpattern.R;

/**
 * @author elaine
 */
public class FactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        use();
    }

    private void use() {
        Factory bmwFactory = new BMWFactory();
        System.out.println(bmwFactory.getCar().getName());
        Factory benzFactory = new BenzFactory();
        System.out.println(benzFactory.getCar().getName());
    }
}