package com.beemo.moodsupport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Addcontact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcontact);
    }

    public void register(View v){
        Intent intent = new Intent(Addcontact.this,PersonalityAnalysis.class);
        startActivity(intent);
        //todo : add fade transition

    }
}
