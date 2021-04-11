package com.elaine.testpattern.simplefactory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.elaine.testpattern.R;

/**
 * 简单工厂模式实现类
 *
 * @author elaine
 */
public class SimpleFactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_factory);
        use();
    }

    private void use() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeOne = shapeFactory.getShape("CIRCLE");
        shapeOne.draw();
        Shape shapeTwo = shapeFactory.getShape("RECTANGLE");
        shapeTwo.draw();
        Shape shapeThree = shapeFactory.getShape("SQUARE");
        shapeThree.draw();
    }

}