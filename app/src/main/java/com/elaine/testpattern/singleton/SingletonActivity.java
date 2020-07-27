package com.elaine.testpattern.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.elaine.testpattern.R;

/**
 * @author elaine
 */
public class SingletonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);
        use();
    }

    private void use() {
        LazySingleton.getInstance().showMessage();
        HungrySingleton.getInstance().showMessage();
        InnerClassSingleton.getInstance().showMessage();
        EnumSingleton.INSTANCE.showMessage();
    }
}