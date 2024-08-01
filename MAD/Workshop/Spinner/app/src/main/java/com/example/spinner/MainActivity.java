package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] state={"Select","Kerala","TN","AP","Karnataka"};
Spinner s;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s=(Spinner) findViewById(R.id.sp);
        b=(Button)findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter ap = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,state);
                ap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                s.setAdapter(ap);
            }
        });
    }
}