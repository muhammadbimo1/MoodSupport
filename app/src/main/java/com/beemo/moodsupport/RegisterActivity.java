package com.beemo.moodsupport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void addcontact(View v){
        Intent intent = new Intent(RegisterActivity.this,Addcontact.class);
        startActivity(intent);
        //todo : add fade transition
    }
}
