package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //create objects for view containing
    EditText firstNumView = null;
    EditText secondNumView = null;
    Button btnMultiply = null;
    Button btnDivide = null;
    Button btnPlus = null;
    Button btnMinus = null;
    TextView resultView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting views from layout
        firstNumView = findViewById(R.id.firstNum);
        secondNumView = findViewById(R.id.secondNum);
        btnMultiply =  findViewById(R.id.buttonMultiply);
        btnDivide = findViewById(R.id.buttonDivide);
        btnPlus = findViewById(R.id.buttonPlus);
        btnMinus = findViewById(R.id.buttonMinus);
        resultView = findViewById(R.id.resultView);

        //creating click listener for multiply button
        OnClickListener onClickListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstNumber = Double.parseDouble(firstNumView.getText().toString());
                double secondNumber = Double.parseDouble(secondNumView.getText().toString());
                double result = firstNumber * secondNumber;
                resultView.setText(String.valueOf(result));
            }
        };
        btnMultiply.setOnClickListener(onClickListener);//setting click listener for button

        //creating click listener for divide button
        OnClickListener onClickListener2 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstNumber = Double.parseDouble(MainActivity.this.firstNumView.getText().toString());
                double secondNumber = Double.parseDouble(MainActivity.this.secondNumView.getText().toString());
                double result = firstNumber / secondNumber;
                resultView.setText(String.valueOf(result));
            }
        };
        btnDivide.setOnClickListener(onClickListener2);//setting click listener for button
    }

    //creating click function for plus button and setting it from layout
    public void plus(View view){
        double firstNumber = Double.parseDouble(this.firstNumView.getText().toString());
        double secondNumber = Double.parseDouble(this.secondNumView.getText().toString());
        double result = firstNumber + secondNumber;
        resultView.setText(String.valueOf(result));
    }

    //creating click function for minus button and setting it from layout
    public void minus(View view){
        double firstNumber = Double.parseDouble(this.firstNumView.getText().toString());
        double secondNumber = Double.parseDouble(this.secondNumView.getText().toString());
        double result = firstNumber - secondNumber;
        resultView.setText(String.valueOf(result));
    }
}

