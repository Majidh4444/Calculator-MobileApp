package com.example.caluclatorusingoops;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText e1, e2;
    private TextView t1;
    private AdvancedCalculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.num1);
        e2 = findViewById(R.id.num2);
        t1 = findViewById(R.id.result);
    }

    private boolean getNumbers() {
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        if (s1.isEmpty() || s2.isEmpty()) {
            t1.setText("Error: Please enter both values");
            return false;
        }

        try {
            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);
            calculator = new AdvancedCalculator(num1, num2);
            return true;
        } catch (NumberFormatException e) {
            t1.setText("Error: Invalid number format");
            return false;
        }
    }

    public void doSum(View v) {
        if (getNumbers()) {
            t1.setText(String.valueOf(calculator.add()));
        }
    }

    public void doSub(View v) {
        if (getNumbers()) {
            t1.setText(String.valueOf(calculator.subtract()));
        }
    }

    public void doMul(View v) {
        if (getNumbers()) {
            t1.setText(String.valueOf(calculator.multiply()));
        }
    }

    public void doDiv(View v) {
        if (getNumbers()) {
            try {
                t1.setText(String.valueOf(calculator.divide()));
            } catch (ArithmeticException e) {
                t1.setText("Error: Division by zero");
            }
        }
    }

    public void doPow(View v) {
        if (getNumbers()) {
            t1.setText(String.valueOf(calculator.power()));
        }
    }

    public void doMod(View v) {
        if (getNumbers()) {
            try {
                t1.setText(String.valueOf(calculator.modulus()));
            } catch (ArithmeticException e) {
                t1.setText("Error: Modulus by zero");
            }
        }
    }

    public void clearTextNum1(View v) {
        e1.getText().clear();
    }

    public void clearTextNum2(View v) {
        e2.getText().clear();
    }
}