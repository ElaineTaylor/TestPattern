package com.elaine.testpattern.template;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.elaine.testpattern.R;

public class TemplateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);
        use();
    }

    private void use() {
        Sport sport = new PlayTableTennis();
        sport.exercise();

        Sport run = new Run();
        run.exercise();
    }
}