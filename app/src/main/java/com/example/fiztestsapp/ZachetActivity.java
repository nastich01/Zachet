package com.example.fiztestsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ZachetActivity extends AppCompatActivity {

    ArrayList<Car> cars = new ArrayList<Car>();
    ListView carsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zachet);
        // начальная инициализация списка
        setInitialData();
        // получаем элемент ListView
        carsList = findViewById(R.id.carsList);
        // создаем адаптер
        CarAdapter carAdapter = new CarAdapter(this, R.layout.list_car, cars);
        // устанавливаем адаптер
        carsList.setAdapter(carAdapter);
        // слушатель выбора в списке
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // получаем выбранный пункт
                Car selectedItem = (Car)parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Марка " + selectedItem.getMarka(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        carsList.setOnItemClickListener(itemListener);
    }
    private void setInitialData(){
        cars.add(new Car ("Мерседес", "Германия", R.drawable.mers, "5 056,05 Млрд"));
        cars.add(new Car ("БМВ", "Германия", R.drawable.bmw, "3 386,24 Млрд"));
        cars.add(new Car ("Ауди", "Германия", R.drawable.audi, "19 204,05 Млрд"));
        cars.add(new Car ("Форд", "Америка", R.drawable.ford, "4 078,05 Млрд"));
        cars.add(new Car ("Лексус", "Япония", R.drawable.lek, "13 021,05 Млрд"));
        /*results.add(new Result ("0-12 уд/мин", "отлично", R.drawable.otl));
        results.add(new Result ("13-18 уд/мин", "хорошо", R.drawable.hor));
        results.add(new Result ("18-25 уд/мин", "удовлетворительно", R.drawable.udovl));
        results.add(new Result ("25- уд/мин", "неудовлетворительно", R.drawable.neudovl));*/
    }
}