package com.beemo.moodsupport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PersonalityAnalysisEnd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_analysis_end);
    }
    public void backmenu(View v) {
        Intent intent = new Intent(PersonalityAnalysisEnd.this, LoginActivity.class);
        startActivity(intent);
        //todo : finished
    }
}
