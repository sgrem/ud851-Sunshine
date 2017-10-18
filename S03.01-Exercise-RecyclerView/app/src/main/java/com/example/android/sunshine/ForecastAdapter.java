package com.example.android.sunshine;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Steve on 10/17/2017.
 */

// Within ForecastAdapter.java /////////////////////////////////////////////////////////////////
// TODO COMPLETED (15) Add a class file called ForecastAdapter
// TODO COMPLETED (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>

// TODO COMPLETED (23) Create a private string array called mWeatherData

// TODO COMPLETED (47) Create the default constructor (we will pass in parameters in a later lesson)

// TODO COMPLETED (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
// TODO COMPLETED (17) Extend RecyclerView.ViewHolder

// Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////
// TODO COMPLETED (18) Create a public final TextView variable called mWeatherTextView
// TODO COMPLETED (19) Create a constructor for this class that accepts a View as a parameter
// TODO COMPLETED (20) Call super(view) within the constructor for ForecastAdapterViewHolder
// TODO COMPLETED (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
// Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////


// TODO COMPLETED (24) Override onCreateViewHolder
// TODO COMPLETED (25) Within onCreateViewHolder, inflate the list item xml into a view
// TODO COMPLETED (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter

// TODO COMPLETED (27) Override onBindViewHolder
// TODO COMPLETED (28) Set the text of the TextView to the weather for this list item's position

// TODO COMPLETED (29) Override getItemCount
// TODO COMPLETED (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null

// TODO COMPLETED (31) Create a setWeatherData method that saves the weatherData to mWeatherData
// TODO COMPLETED (32) After you save mWeatherData, call notifyDataSetChanged
// Within ForecastAdapter.java //////////////////////////////////////////////////////////////

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String[] mWeatherData;

    public ForecastAdapter() {
        super();
    }

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.forecast_list_item, parent, false );
        return new ForecastAdapterViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        holder.bind(mWeatherData[position]);
    }

    @Override
    public int getItemCount() {
        if (mWeatherData == null) {
            return 0;
        }
        return mWeatherData.length;
    }

    public void setWeatherData(String[] weatherData){
        int index = 0;
        mWeatherData = weatherData.clone();
        notifyDataSetChanged();
    }

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View itemView) {
            super(itemView);
            this.mWeatherTextView = itemView.findViewById(R.id.tv_weather_data);
        }

        void bind(String weather){
            mWeatherTextView.setText(weather);
        }
    }
}
