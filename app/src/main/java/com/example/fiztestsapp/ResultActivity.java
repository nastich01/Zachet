package com.example.fiztestsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {
    private static final String LOG_TAG = "ResultActivity";

    ArrayList<Result> results = new ArrayList<Result>();
    ListView resultsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        // начальная инициализация списка
        setInitialData();
        // получаем элемент ListView
        resultsList = findViewById(R.id.resultsList);
        // создаем адаптер
        ResultAdapter resultAdapter = new ResultAdapter(this, R.layout.list_item, results);
        // устанавливаем адаптер
        resultsList.setAdapter(resultAdapter);
        // слушатель выбора в списке
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // получаем выбранный пункт
                Result selectedItem = (Result)parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Ваш результат " + selectedItem.getTextValue(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        resultsList.setOnItemClickListener(itemListener);
    }
    private void setInitialData(){

        results.add(new Result ("0-12 уд/мин", "отлично", R.drawable.otl));
        results.add(new Result ("13-18 уд/мин", "хорошо", R.drawable.hor));
        results.add(new Result ("18-25 уд/мин", "удовлетворительно", R.drawable.udovl));
        results.add(new Result ("25- уд/мин", "неудовлетворительно", R.drawable.neudovl));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_TAG, "onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(LOG_TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LOG_TAG, "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOG_TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(LOG_TAG, "onResume");
    }
}