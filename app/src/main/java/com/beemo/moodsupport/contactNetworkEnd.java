package com.beemo.moodsupport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class contactNetworkEnd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_network_end);
    }
    public void backmenu(View v) {
        Intent intent = new Intent(contactNetworkEnd.this, Dashboard.class);
        startActivity(intent);
        //todo : finished
    }
}
