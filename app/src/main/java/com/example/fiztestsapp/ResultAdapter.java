package com.example.fiztestsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ResultAdapter extends ArrayAdapter<Result> {
    private LayoutInflater inflater;
    private int layout;
    private List<Result> results;

    public ResultAdapter(Context context, int resource, List<Result> results) {
        super(context, resource, results);
        this.results = results;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView flagView = view.findViewById(R.id.image);
        TextView nameView = view.findViewById(R.id.textValue);
        TextView capitalView = view.findViewById(R.id.value);

        Result result = results.get(position);

        flagView.setImageResource(result.getValueResource());
        nameView.setText(result.getTextValue());
        capitalView.setText(String.valueOf(result.getValue()));

        return view;
    }
}
