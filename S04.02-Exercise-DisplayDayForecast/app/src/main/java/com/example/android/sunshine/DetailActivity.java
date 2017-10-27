package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView mTvWeatherDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // TODO COMPLETED (2) Display the weather forecast that was passed from MainActivity
        Intent weatherDetailIntent = getIntent();
        if (weatherDetailIntent != null) {
            if (weatherDetailIntent.hasExtra(Intent.EXTRA_TEXT)) {
                String weatherDetail = weatherDetailIntent.getStringExtra(Intent.EXTRA_TEXT);
                mTvWeatherDetail = (TextView) findViewById(R.id.tv_weather_detail);
                mTvWeatherDetail.setText(weatherDetail);
            }
        }

    }
}