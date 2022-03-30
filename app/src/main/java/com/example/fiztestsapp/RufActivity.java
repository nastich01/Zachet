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

public class RufActivity extends AppCompatActivity {

    private static final String LOG_TAG = "RufActivity";

    Button rufresultButton;
    Button ortoButton;
    Button mainButton;
    EditText p1Field;
    EditText p2Field;
    EditText p3Field;
    TextView resultField;
    TextView resultTextField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruf);

        rufresultButton = (Button)findViewById(R.id.button5);
        ortoButton = (Button)findViewById(R.id.button7);
        mainButton = (Button)findViewById(R.id.button8);
        p1Field = (EditText) findViewById(R.id.editTextNumber3);
        p2Field = (EditText) findViewById(R.id.editTextNumber5);
        p3Field = (EditText) findViewById(R.id.editTextNumber4);
        resultField = (TextView) findViewById(R.id.resultField);
        resultTextField = (TextView) findViewById(R.id.resultField4);

        ortoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RufActivity.this, OrtoActivity.class);
                startActivity(intent);
            }
        });

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RufActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    // обработка нажатия на кнопку операции
    @SuppressLint("SetTextI18n")
    public void onOperationClick(View view){
        performOperation();
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
    }

    private void performOperation(){
        int p1 = Integer.parseInt(p1Field.getText().toString());
        int p2 = Integer.parseInt(p2Field.getText().toString());
        int p3 = Integer.parseInt(p3Field.getText().toString());
        System.out.println(p1+" "+p2+" "+p3);
        double result = (4*(p1+p2+p3)-200) * 0.1;
        System.out.println(result);
        resultField.setText(String.format("%.2f",result));
        if ((result>=0)&&(result<=5))
            resultTextField.setText("отлично");
        else if ((result>=5)&&(result<=10))
            resultTextField.setText("хорошо");
        else if ((result>=10)&&(result<=15))
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