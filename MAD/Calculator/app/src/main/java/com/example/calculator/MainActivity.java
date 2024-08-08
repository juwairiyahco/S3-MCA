package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ba,bs,bd,bx,beq,bac,bdo,bsp;
EditText t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        b0=(Button) findViewById(R.id.b0);
        beq=(Button) findViewById(R.id.beq);
        ba=(Button) findViewById(R.id.bp);
        bx=(Button) findViewById(R.id.bx);
        bd=(Button) findViewById(R.id.bd);
        bs=(Button) findViewById(R.id.bm);
        bac=(Button) findViewById(R.id.bac);
        bdo=(Button) findViewById(R.id.bdt);
        bsp=(Button) findViewById(R.id.back);
        t1=(EditText)findViewById(R.id.t1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t= String.valueOf(t1.getText());
                t=t+"1";
                t1.setText(String.valueOf(t));

            }
        });

    }
}