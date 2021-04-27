package com.elaine.testpattern.facade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.elaine.testpattern.R;

public class FacadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade);
        use();
    }

    private void use() {
        PlayerFacade playerFacade = new PlayerFacade();
        playerFacade.play();
    }
}