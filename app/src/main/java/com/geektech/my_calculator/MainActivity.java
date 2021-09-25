package com.geektech.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Integer firstValue, secondValue;
    private String operation = "";
    private Boolean tv_result_is_EMPTY = true;
    private String result;
    private String secondValueString;


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

            case R.id.button_3:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("3");
                } else {
                    tvResult.append("3");
                }
                break;

            case R.id.button_4:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("5");
                } else {
                    tvResult.append("4");
                }
                break;

            case R.id.button_5:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("5");
                } else {
                    tvResult.append("5");
                }
                break;

            case R.id.button_6:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("6");
                } else {
                    tvResult.append("6");
                }
                break;

            case R.id.button_7:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("7");
                } else {
                    tvResult.append("7");
                }
                break;

            case R.id.button_8:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("8");
                } else {
                    tvResult.append("8");
                }
                break;

            case R.id.button_9:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("9");
                } else {
                    tvResult.append("9");
                }
                break;

            case R.id.button_zero:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("0");
                } else {
                    tvResult.append("0");
                }
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

            case R.id.button_minus:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "-";
                tvResult.setText(firstValue + operation);
                break;

            case R.id.button_Division_of_numbers:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "÷";
                tvResult.setText(firstValue + operation);
                break;

            case R.id.button_multiplication:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "×";
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

    public void computeCalculation(View view) {

        switch (operation) {
            case "":
                tvResult.setText("0");
                break;


            case "+":
                secondValueString = tvResult.getText().toString().replace(firstValue + operation, "");
                secondValue = Integer.parseInt(secondValueString);
                result = String.valueOf(firstValue + secondValue);
                tvResult.setText(firstValue + operation + secondValueString + "=" + result);
                operation = "";
                break;
            case "-":
                secondValueString = tvResult.getText().toString().replace(firstValue + operation, "");
                secondValue = Integer.parseInt(secondValueString);
                result = String.valueOf(firstValue - secondValue);
                tvResult.setText(firstValue + operation + secondValueString + "=" + result);
                operation = "";
                break;
            case "×":
                secondValueString = tvResult.getText().toString().replace(firstValue + operation, "");
                secondValue = Integer.parseInt(secondValueString);
                result = String.valueOf(firstValue * secondValue);
                tvResult.setText(firstValue + operation + secondValueString + "=" + result);
                operation = "";
                break;
            case "÷":
                secondValueString = tvResult.getText().toString().replace(firstValue + operation, "");
                secondValue = Integer.parseInt(secondValueString);
                result = String.valueOf(firstValue / secondValue);
                tvResult.setText(firstValue + operation + secondValueString + "=" + result);
                operation = "";
                break;

            default:
                tvResult.setText("0");
        }

    }

    public void clear(View view) {
        tvResult.setText("0");
    }
}