package com.elaine.testpattern.builder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.elaine.testpattern.R;

/**
 * @author elaine
 */
public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        use();
    }

    private void use() {
        ProductBuilder specialConcreteProductBuilder = new SpecialConcreteProductBuilder();
        Director director = new Director(specialConcreteProductBuilder);
        Product product = director.makeProduct("productNameXXXX", "companyName", "part1", "part2", "part3", "part4");
        System.out.println(product);
        Product product1 = director.makeProduct("productNameXXX", "companyName", "part1", "part2", "part3", "part4");
        System.out.println(product1);
    }
}