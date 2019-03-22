package com.beemo.moodsupport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Moodtest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodtest);
    }
    public void moodtestfinish(View v) {
        Intent intent = new Intent(Moodtest.this, Dashboard.class);
        startActivity(intent);
        Toast.makeText(this,"Successfully Recorded!",
                Toast.LENGTH_SHORT).show();
        //todo : finished
    }
}
