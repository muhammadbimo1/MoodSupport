package com.beemo.moodsupport;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class SelfHealing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_healing);
    }
    public void startbreath(View v) {
        Intent intent = new Intent(SelfHealing.this, Breathing.class);
        startActivity(intent);
        //todo : finished
    }
}
