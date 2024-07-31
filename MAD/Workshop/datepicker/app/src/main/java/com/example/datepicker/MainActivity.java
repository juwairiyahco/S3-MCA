package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    Button b1,b2;
    TextView d1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp=(DatePicker) findViewById(R.id.date);
        Calendar c=Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        int m=c.get(Calendar.MONDAY);
        int d=c.get(Calendar.DATE);
        dp.updateDate(y,m,d);

        b1=(Button) findViewById(R.id.b1);
        d1=(TextView) findViewById(R.id.d1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day=dp.getDayOfMonth();
                int mont=dp.getDayOfMonth();
                int year=dp.getYear();
                d1.setText(day+"/"+mont+"/"+year);
            }
        });

        b2=(Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MainActivity.this,time.class);
                startActivity(j);
            }
        });

    }
}