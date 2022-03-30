package com.example.fiztestsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OrtoActivity extends AppCompatActivity {

    private static final String LOG_TAG = "OrtoActivity";

    Button ortoresultButton;
    Button rufButton;
    Button mainButton;
    EditText p1Field;
    EditText p2Field;
    TextView resultField;
    TextView resultTextField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orto);

        ortoresultButton = (Button)findViewById(R.id.button4);
        rufButton = (Button)findViewById(R.id.button6);
        mainButton = (Button)findViewById(R.id.button9);
        p1Field = (EditText) findViewById(R.id.editTextNumber);
        p2Field = (EditText) findViewById(R.id.editTextNumber2);
        resultField = (TextView) findViewById(R.id.resultField2);
        resultTextField = (TextView) findViewById(R.id.resultField3);

        rufButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(OrtoActivity.this, RufActivity.class);
                startActivity(intent);
            }
        });

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(OrtoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Log.i(LOG_TAG, "onСreate");
    }

    // обработка нажатия на кнопку операции
    //@SuppressLint("SetTextI18n")
    public void onOperationClick(View view){
        performOperation();
    }

    private void performOperation(){
        int p1 = Integer.parseInt(p1Field.getText().toString());
        int p2 = Integer.parseInt(p2Field.getText().toString());
        System.out.println(p1+" "+p2);
        int result = p2-p1;
        System.out.println(result);
        resultField.setText(String.valueOf(result));
        if ((result>=0)&&(result<=12))
            resultTextField.setText("отлично");
        else if ((result>=13)&&(result<=18))
            resultTextField.setText("хорошо");
        else if ((result>=18)&&(result<=25))
            resultTextField.setText("удовлетворительно");
        else
            resultTextField.setText("неудовлетворительно");
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


//resultTextField.setText("111");
        /*// если введенно что-нибудь
        if((p1Field.length()>0)&&(p2Field.length()>0)){
            try{
                performOperation();
                resultTextField.setText("111");
            }catch (NumberFormatException ex){
                resultField.setText("");
                resultTextField.setText("");
            }
        }*/