package com.beemo.moodsupport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContactNetwork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_network);
    }
    public void ContactNetworkEnd(View v) {
        Intent intent = new Intent(ContactNetwork.this, contactNetworkEnd.class);
        startActivity(intent);
        //todo : finished
    }
}
