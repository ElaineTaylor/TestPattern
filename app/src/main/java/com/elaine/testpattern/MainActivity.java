package com.elaine.testpattern;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.elaine.testpattern.abstractfactory.AbstractFactoryActivity;
import com.elaine.testpattern.factory.FactoryActivity;
import com.elaine.testpattern.singleton.SingletonActivity;

/**
 * @author elaine
 */
public class MainActivity extends AppCompatActivity {

    private Button mBtnFactory;
    private Button mBtnAbstractFactory;
    private Button mBtnSingleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initView() {
        mBtnFactory = findViewById(R.id.btn_factory);
        mBtnAbstractFactory = findViewById(R.id.btn_abstract_factory);
        mBtnSingleton = findViewById(R.id.btn_singleton);
    }

    private void initListener() {
        mBtnFactory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FactoryActivity.class));
            }
        });
        mBtnAbstractFactory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AbstractFactoryActivity.class));
            }
        });
        mBtnSingleton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SingletonActivity.class));
            }
        });

    }
}