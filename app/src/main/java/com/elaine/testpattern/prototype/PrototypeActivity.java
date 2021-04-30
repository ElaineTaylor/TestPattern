package com.elaine.testpattern.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.elaine.testpattern.R;

public class PrototypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proto_type);
        use();
    }

    private void use() {
        ColorCache.loadCache();

        Color red = ColorCache.getColor(1);
        red.fill();
        Log.e("color===", red.getType());

        Color green = ColorCache.getColor(2);
        green.fill();
        Log.e("color===", green.getType());

        Color white = ColorCache.getColor(3);
        white.fill();
        Log.e("color===", white.getType());
    }
}