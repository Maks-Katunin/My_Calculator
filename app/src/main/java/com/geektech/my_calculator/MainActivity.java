package com.geektech.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Integer firstValue, secondValue;
    private String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);

    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.button_1:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("1");
                } else {
                    tvResult.append("1");
                }
                break;
            case R.id.button_2:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("2");
                } else {
                    tvResult.append("2");
                }
                break;
            case R.id.button_clear:
                tvResult.setText("0");
                tvResult.setTextSize(70f); // не работает
                break;
        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.button_plus:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "+";
                tvResult.setText(firstValue + operation);
                break;
            case R.id.button_equals:
                String two = tvResult.getText().toString().replace(firstValue + operation, "");
                secondValue = Integer.parseInt(two);
                String result = String.valueOf(firstValue + secondValue);
                tvResult.setText(firstValue + operation + two + "=" + result);
                break;
        }
    }
}