package com.elaine.testpattern.flyweight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.elaine.testpattern.R;

public class FlyweightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flyweight);
        use();
    }

    private void use() {
        Cup cup = CupFactory.getCup(100);
        cup.setColor("红色");
        cup.setShape("圆形");
        Log.e("cup", cup.toString());

        Cup cup2 = CupFactory.getCup(200);
        cup2.setColor("黄色");
        cup2.setShape("方形");
        Log.e("cup2", cup2.toString());

        Cup cup3 = CupFactory.getCup(300);
        cup3.setColor("黄色");
        cup3.setShape("圆形");
        Log.e("cup3", cup3.toString());

        //这个对象第一个就创建了，所以不需要再创建了
        Cup cup4 = CupFactory.getCup(100);
        cup4.setColor("红色");
        cup4.setShape("长方形");
        Log.e("cup4", cup4.toString());
    }
}