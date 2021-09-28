package com.geektech.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Integer firstValue;
    private String operation = "";
    private Boolean finish = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);

    }

    @SuppressLint("NonConstantResourceId")
    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.button_1:
                if (tvResult.getText().toString().equals("0") || finish) {
                    tvResult.setText("1");
                    finish = false;
                } else {
                    tvResult.append("1");

                }
                break;
            case R.id.button_2:
                if (tvResult.getText().toString().equals("0") || finish) {
                    tvResult.setText("2");
                    finish = false;
                } else {
                    tvResult.append("2");
                }
                break;

            case R.id.button_3:
                if (tvResult.getText().toString().equals("0") || finish) {
                    tvResult.setText("3");
                    finish = false;
                } else {
                    tvResult.append("3");
                }
                break;

            case R.id.button_4:
                if (tvResult.getText().toString().equals("0") || finish) {
                    tvResult.setText("4");
                    finish = false;
                } else {
                    tvResult.append("4");
                }
                break;

            case R.id.button_5:
                if (tvResult.getText().toString().equals("0") || finish) {
                    tvResult.setText("5");
                    finish = false;
                } else {
                    tvResult.append("5");
                }
                break;

            case R.id.button_6:
                if (tvResult.getText().toString().equals("0") || finish) {
                    tvResult.setText("6");
                    finish = false;
                } else {
                    tvResult.append("6");
                }
                break;

            case R.id.button_7:
                if (tvResult.getText().toString().equals("0") || finish) {
                    tvResult.setText("7");
                    finish = false;
                } else {
                    tvResult.append("7");
                }
                break;

            case R.id.button_8:
                if (tvResult.getText().toString().equals("0") || finish) {
                    tvResult.setText("8");
                    finish = false;
                } else {
                    tvResult.append("8");
                }
                break;

            case R.id.button_9:
                if (tvResult.getText().toString().equals("0") || finish) {
                    tvResult.setText("9");
                    finish = false;
                } else {
                    tvResult.append("9");
                }
                break;

            case R.id.button_zero:
                if (tvResult.getText().toString().equals("0") || finish) {
                    tvResult.setText("0");
                    finish = false;
                } else {
                    tvResult.append("0");
                }
                break;


        }
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.button_plus:
                if (!tvResult.getText().toString().contains("+")
                        && !tvResult.getText().toString().contains("-")
                        && !tvResult.getText().toString().contains("÷")
                        && !tvResult.getText().toString().contains("×")
                        && !tvResult.getText().toString().contains("=")) {
                    firstValue = Integer.parseInt(tvResult.getText().toString());
                    operation = "+";
                    tvResult.setText(firstValue + operation);
                }
                break;

            case R.id.button_minus:
                if (!tvResult.getText().toString().contains("+")
                    && !tvResult.getText().toString().contains("-")
                    && !tvResult.getText().toString().contains("÷")
                    && !tvResult.getText().toString().contains("×")
                    && !tvResult.getText().toString().contains("=")) {
                    firstValue = Integer.parseInt(tvResult.getText().toString());
                    operation = "-";
                    tvResult.setText(firstValue + operation);
                }
                break;

            case R.id.button_Division_of_numbers:
                if (!tvResult.getText().toString().contains("+")
                        && !tvResult.getText().toString().contains("-")
                        && !tvResult.getText().toString().contains("÷")
                        && !tvResult.getText().toString().contains("×")
                        && !tvResult.getText().toString().contains("=")) {
                    firstValue = Integer.parseInt(tvResult.getText().toString());
                    operation = "÷";
                    tvResult.setText(firstValue + operation);
                }
                break;

            case R.id.button_multiplication:
                if (!tvResult.getText().toString().contains("+")
                        && !tvResult.getText().toString().contains("-")
                        && !tvResult.getText().toString().contains("÷")
                        && !tvResult.getText().toString().contains("×")
                        && !tvResult.getText().toString().contains("=")) {
                    firstValue = Integer.parseInt(tvResult.getText().toString());
                    operation = "×";
                    tvResult.setText(firstValue + operation);
                }
                break;

        }
    }

    @SuppressLint("SetTextI18n")
    public void computeCalculation(View view) {
        finish = true;

        switch (operation) {
            case "+":
                String secondValueString = tvResult.getText().toString().replace(firstValue + operation, "");
                Integer secondValue = Integer.parseInt(secondValueString);
                String result = String.valueOf(firstValue + secondValue);
                tvResult.setText(firstValue + operation + secondValue + "=" + result);
                operation = "";
                break;
            case "-":
                secondValueString = tvResult.getText().toString().replace(firstValue + operation, "");
                secondValue = Integer.parseInt(secondValueString);
                result = String.valueOf(firstValue - secondValue);
                tvResult.setText(firstValue + operation + secondValue + "=" + result);
                operation = "";
                break;
            case "×":
                secondValueString = tvResult.getText().toString().replace(firstValue + operation, "");
                secondValue = Integer.parseInt(secondValueString);
                result = String.valueOf(firstValue * secondValue);
                tvResult.setText(firstValue + operation + secondValue + "=" + result);
                operation = "";
                break;
            case "÷":
                secondValueString = tvResult.getText().toString().replace(firstValue + operation, "");
                secondValue = Integer.parseInt(secondValueString);
                result = String.valueOf(firstValue / secondValue);
                tvResult.setText(firstValue + operation + secondValue + "=" + result);
                operation = "";
                break;

            default:
                tvResult.setText("0");
                break;
        }

    }

    public void clear(View view) {
        tvResult.setText("0");
    }
}