package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public EditText num1, num2;
    public Button add, sub, mul, div;
    public TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = findViewById(R.id.na2);
        num2 = findViewById(R.id.na3);

        int n1 = getIntent().getIntExtra("keynum1",0);
        int n2  = getIntent().getIntExtra("keynum2",0);

        num1.setText(String.valueOf(n1));
        num2.setText(String.valueOf(n2));


        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        res = (TextView) findViewById(R.id.tx3);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                res.setText(String.valueOf(number1) + "  +  " + String.valueOf(number2)+ "  =  " + String.valueOf(sum));
            }

        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sub = number1 - number2;
                res.setText(String.valueOf(number1) + "  -  " + String.valueOf(number2)+ "  =  " + String.valueOf(sub));
            }

        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int mul = number1 * number2;
                res.setText(String.valueOf(number1) + "  *  " + String.valueOf(number2)+ "  =  " + String.valueOf(mul));
            }

        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int div = number1 / number2;
                res.setText(String.valueOf(number1) + "  /  " + String.valueOf(number2)+ "  =  " + String.valueOf(div));
            }

        });
    }
}