package com.example.radiocheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    RadioGroup rg;
    RadioButton r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.submit);
        r1=(RadioButton) findViewById(R.id.male);
        r2=(RadioButton) findViewById(R.id.female);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked())
                {
                    String s=r1.getText().toString();
                    Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String s=r2.getText().toString();
                    Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
                }

            }
        });

        rg=(RadioGroup) findViewById(R.id.rg);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.female)
                {
                    Toast.makeText(getApplicationContext(),r2.getText().toString(),Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),r1.getText().toString(),Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}