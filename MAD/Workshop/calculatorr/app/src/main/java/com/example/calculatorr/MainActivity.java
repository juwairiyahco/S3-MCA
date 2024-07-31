package com.example.calculatorr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button add,sub,mul,div,mer;
    EditText n1,n2,res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.add);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        sub = (Button) findViewById(R.id.sub);
        mer = (Button) findViewById(R.id.mer);
        res = (EditText) findViewById(R.id.res);
        n1 = (EditText) findViewById(R.id.num1);
        n2 = (EditText) findViewById(R.id.num2);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a= Double.parseDouble(n1.getText().toString());
                double b= Double.parseDouble(n2.getText().toString());
                double c= a+b;
                res.setText(String.valueOf(c));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a= Double.parseDouble(n1.getText().toString());
                double b= Double.parseDouble(n2.getText().toString());
                double c= a-b;
                res.setText(String.valueOf(c));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a= Double.parseDouble(n1.getText().toString());
                double b= Double.parseDouble(n2.getText().toString());
                double c= a*b;
                res.setText(String.valueOf(c));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a= Double.parseDouble(n1.getText().toString());
                double b= Double.parseDouble(n2.getText().toString());
                double c= a/b;
                res.setText(String.valueOf(c));
            }
        });

        mer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a= Double.parseDouble(n1.getText().toString());
                double b= Double.parseDouble(n2.getText().toString());
                double c= (a*10)+b;
                res.setText(String.valueOf(c));
            }
        });

    }
}