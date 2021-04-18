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
        //创建抽象工厂，传入约定的值，得到形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        //传入形状的约定值，得到各类形状，就可以调用绘制方法
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
        //创建抽象工厂，传入约定的值，得到颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        //传入颜色的约定值，得到各类颜色，就可以调用填充方法
        Color red = colorFactory.getColor("RED");
        red.fill();
        Color green = colorFactory.getColor("GREEN");
        green.fill();
        Color blue = colorFactory.getColor("BLUE");
        blue.fill();
    }
}