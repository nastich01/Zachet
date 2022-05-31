package com.example.fiztestsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CarAdapter extends ArrayAdapter<Car> {
    private LayoutInflater inflater;
    private int layout;
    private List<Car> cars;

    public CarAdapter(Context context, int resource, List<Car> cars) {
        super(context, resource, cars);
        this.cars = cars;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView imgView = view.findViewById(R.id.image);
        TextView markaView = view.findViewById(R.id.markaText);
        TextView countryView = view.findViewById(R.id.countryText);
        TextView capitalView = view.findViewById(R.id.capitalText);

        Car car = cars.get(position);

        imgView.setImageResource(car.getImgResource());
        markaView.setText(car.getMarka());
        countryView.setText(car.getCountry());
        capitalView.setText(car.getCapital());

        /*flagView.setImageResource(result.getValueResource());
        nameView.setText(result.getTextValue());
        capitalView.setText(String.valueOf(result.getValue()));*/

        return view;
    }
}
