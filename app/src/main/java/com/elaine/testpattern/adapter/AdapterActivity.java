package com.elaine.testpattern.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.elaine.testpattern.R;

public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        use();
    }

    private void use() {
        HWTelevision hwTelevision = new HWTelevision();
        hwTelevision.showDigital("digital");
        hwTelevision.showDigital("online");
        hwTelevision.showDigital("aaaa");
    }
}