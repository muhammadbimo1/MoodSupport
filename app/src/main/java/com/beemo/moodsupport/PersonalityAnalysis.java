package com.beemo.moodsupport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PersonalityAnalysis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_analysis);
    }
    public void start(View v){
        Intent intent = new Intent(PersonalityAnalysis.this,personalityAnalysisStart.class);
        startActivity(intent);
        //todo : add fade transition

    }
}
