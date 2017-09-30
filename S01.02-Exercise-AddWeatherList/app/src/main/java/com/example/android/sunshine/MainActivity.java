/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    private TextView tv_weather_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        tv_weather_data = (TextView) findViewById(R.id.tv_weather_data);

        // TODO (3) Create an array of Strings that contain fake weather data
        String[] weatherStringArray = {"Forcast for Sunday 9/31/17\n\n", "Sunny\n\n", "Humidity: 30%\n\n",
                "Chance of Precipitation: 20%\n\n", "High: 90 degrees\n\n", "Low: 75 degrees\n\n",
                "Forcast for Monday 10/1/17\n\n", "Overcast\n\n", "Humidity: 40%\n\n",
                "Chance of Precipitation: 30%\n\n", "High: 87 degrees\n\n", "Low: 72 degrees\n\n",
                "Forcast for Monday 10/2/17\n\n", "Thunder Storms\n\n", "Humidity: 60%\n\n",
                "Chance of Precipitation: 60%\n\n", "High: 82 degrees\n\n", "Low: 68 degrees\n\n"};

        // TODO (4) Append each String from the fake weather data array to the TextView
        for (String weatherString: weatherStringArray){
            tv_weather_data.append(weatherString);
        }
    }
}