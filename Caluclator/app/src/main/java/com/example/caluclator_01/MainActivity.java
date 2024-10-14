package com.example.caluclator_01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText e1, e2;
    private TextView t1;
    private int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.num1);
        e2 = findViewById(R.id.num2);
        t1 = findViewById(R.id.result);
    }

    private boolean getNumbers() {
        // defining the edit text 1 to e1
        e1 = findViewById(R.id.num1);

        // defining the edit text 2 to e2
        e2 = findViewById(R.id.num2);

        // defining the text view to t1
        t1 = findViewById(R.id.result);

        // taking input from text box 1
        String s1 = e1.getText().toString();

        // taking input from text box 2
        String s2 = e2.getText().toString();

        if (s1.equals("Please enter value 1") && s2.equals("")) {
            e2.setText("Please enter value 2");
            return false;
        }
        if (s1.equals("") && s2.equals("Please enter value 2")) {
            e1.setText("Please enter value 1");
            return false;
        }
        if (s1.equals("Please enter value 1") || s2.equals("Please enter value 2")) {
            return false;
        }

        if ((!s1.equals("") && s2.equals("")) || (!s1.equals("") && s2.equals(""))) {
            e2.setText("Please enter value 2");
            return false;
        }
        if ((s1.equals("") && !s2.equals("")) || (s1.equals("") && !s2.equals(""))) {
            e1.setText("Please enter value 1");
            return false;
        }
        if ((s1.equals("") && s2.equals(""))) {
            e1.setText("Please enter value 1");
            e2.setText("Please enter value 2");
            return false;
        }

        try {
            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);
        } catch (NumberFormatException e) {
            t1.setText("Error: Invalid number format");
            return false;
        }

        return true;
    }

    public void doSum(View v) {
        if (getNumbers()) {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        } else {
            t1.setText("Error: Please enter required values");
        }
    }

    public void clearTextNum1(View v) {
        e1.getText().clear();
    }

    public void clearTextNum2(View v) {
        e2.getText().clear();
    }

    public void doPow(View v) {
        if (getNumbers()) {
            double result = Math.pow(num1, num2);
            t1.setText(Double.toString(result));
        } else {
            t1.setText("Error: Please enter required values");
        }
    }

    public void doSub(View v) {
        if (getNumbers()) {
            int result = num1 - num2;
            t1.setText(Integer.toString(result));
        } else {
            t1.setText("Error: Please enter required values");
        }
    }

    public void doMul(View v) {
        if (getNumbers()) {
            int result = num1 * num2;
            t1.setText(Integer.toString(result));
        } else {
            t1.setText("Error: Please enter required values");
        }
    }

    public void doDiv(View v) {
        if (getNumbers()) {
            if (num2 != 0) {
                double result = (double) num1 / num2;
                t1.setText(Double.toString(result));
            } else {
                t1.setText("Error: Division by zero");
            }
        } else {
            t1.setText("Error: Please enter required values");
        }
    }

    public void doMod(View v) {
        if (getNumbers()) {
            if (num2 != 0) {
                int result = num1 % num2;
                t1.setText(Integer.toString(result));
            } else {
                t1.setText("Error: Division by zero");
            }
        } else {
            t1.setText("Error: Please enter required values");
        }
    }
}


