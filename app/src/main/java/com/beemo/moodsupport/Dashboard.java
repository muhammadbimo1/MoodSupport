package com.beemo.moodsupport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6),
                new DataPoint(5, 3),
                new DataPoint(6, 2)
        });
        graph.addSeries(series);

        GraphView graph2 = (GraphView) findViewById(R.id.graph2);
        LineGraphSeries<DataPoint> series2 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(1, 1),
                new DataPoint(2, 5),
                new DataPoint(3, 3),
                new DataPoint(4, 2)
        });
        graph2.addSeries(series2);
    }
    public void moodtest(View v) {
        Intent intent = new Intent(Dashboard.this, Moodtest.class);
        startActivity(intent);
        //todo : finished
    }
    public void dasstest(View v) {
        Intent intent = new Intent(Dashboard.this, DASSTest.class);
        startActivity(intent);
        //todo : finished
    }
    public void healing(View v) {
        Intent intent = new Intent(Dashboard.this, SelfHealing.class);
        startActivity(intent);
        //todo : finished
    }

}
