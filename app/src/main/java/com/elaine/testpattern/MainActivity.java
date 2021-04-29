package com.elaine.testpattern;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.elaine.testpattern.abstractfactory.AbstractFactoryActivity;
import com.elaine.testpattern.adapter.AdapterActivity;
import com.elaine.testpattern.builder.BuilderActivity;
import com.elaine.testpattern.chain.ChainActivity;
import com.elaine.testpattern.decorator.DecoratorActivity;
import com.elaine.testpattern.facade.FacadeActivity;
import com.elaine.testpattern.factory.FactoryActivity;
import com.elaine.testpattern.flyweight.FlyweightActivity;
import com.elaine.testpattern.observer.ObserverActivity;
import com.elaine.testpattern.simplefactory.SimpleFactoryActivity;
import com.elaine.testpattern.singleton.SingletonActivity;
import com.elaine.testpattern.strategy.StrategyActivity;
import com.elaine.testpattern.template.TemplateActivity;

/**
 * @author elaine
 */
public class MainActivity extends AppCompatActivity {

    private Button mBtnFactory;
    private Button mBtnAbstractFactory;
    private Button mBtnSingleton;
    private Button mBtnBuilder;
    private Button mBtnSimpleFactory;
    private Button mBtnObserver;
    private Button mBtnStrategy;
    private Button mBtnDecorator;
    private Button mBtnAdapter;
    private Button mBtnFlyweight;
    private Button mBtnFacade;
    private Button mBtnTemplate;
    private Button mBtnChain;

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
        mBtnBuilder = findViewById(R.id.btn_builder);
        mBtnSimpleFactory = findViewById(R.id.btn_simple_factory);
        mBtnObserver = findViewById(R.id.btn_observer);
        mBtnStrategy = findViewById(R.id.btn_strategy);
        mBtnDecorator = findViewById(R.id.btn_decorator);
        mBtnAdapter = findViewById(R.id.btn_adapter);
        mBtnFlyweight = findViewById(R.id.btn_flyweight);
        mBtnFacade = findViewById(R.id.btn_facade);
        mBtnTemplate = findViewById(R.id.btn_template);
        mBtnChain = findViewById(R.id.btn_chain);
    }

    private void initListener() {
        mBtnSimpleFactory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SimpleFactoryActivity.class));
            }
        });
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
        mBtnBuilder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BuilderActivity.class));
            }
        });
        mBtnObserver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ObserverActivity.class));
            }
        });
        mBtnStrategy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StrategyActivity.class));
            }
        });
        mBtnDecorator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DecoratorActivity.class));
            }
        });
        mBtnAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AdapterActivity.class));
            }
        });
        mBtnFlyweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FlyweightActivity.class));
            }
        });
        mBtnFacade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FacadeActivity.class));
            }
        });
        mBtnTemplate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TemplateActivity.class));
            }
        });
        mBtnChain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ChainActivity.class));
            }
        });
    }
}