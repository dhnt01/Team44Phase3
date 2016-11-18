package com.example.hungdo.team44phase3;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AdminScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_screen);

        TextView viewApp = (TextView) findViewById(R.id.btnViewApp);
        viewApp.setPaintFlags(viewApp.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

        TextView viewPopularApp = (TextView) findViewById(R.id.btnViewPopularApp);
        viewPopularApp.setPaintFlags(viewPopularApp.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

        TextView viewAppReport = (TextView) findViewById(R.id.btnViewAppReport);
        viewAppReport.setPaintFlags(viewAppReport.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.btnViewApp) {
            //TODO: Navigate to new Activitive
        }
        if (v.getId() == R.id.btnViewPopularApp) {
            //TODO: Navigate to new Activitive
        }
        if (v.getId() == R.id.btnViewAppReport) {
            //TODO: Navigate to new Activitive
        }
    }
}