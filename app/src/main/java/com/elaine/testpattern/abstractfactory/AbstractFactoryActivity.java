package com.elaine.testpattern.abstractfactory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.elaine.testpattern.R;

/**
 * @author elaine
 */
public class AbstractFactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);
        use();
    }

    private void use() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shapeOne = shapeFactory.getShape("CIRCLE");
        shapeOne.draw();
        Shape shapeTwo = shapeFactory.getShape("RECTANGLE");
        shapeTwo.draw();
        Shape shapeThree = shapeFactory.getShape("SQUARE");
        shapeThree.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color colorOne = colorFactory.getColor("RED");
        colorOne.fill();
        Color colorTwo = colorFactory.getColor("GREEN");
        colorTwo.fill();
        Color colorThree = colorFactory.getColor("BLUE");
        colorThree.fill();
    }
}