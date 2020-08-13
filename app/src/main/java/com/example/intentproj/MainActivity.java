package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button button;
    public EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        button = (Button) findViewById(R.id.btn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int  n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("keynum1",n1);
                intent.putExtra("keynum2",n2);
                startActivity(intent);

                Toast toast = Toast.makeText( MainActivity.this,"Data Sent...", Toast.LENGTH_SHORT);
                toast.show();

            }
        });



    }
}