package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText t1;
    Button bac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText) findViewById(R.id.t1);
        bac=(Button) findViewById(R.id.bac);
        int b[]=new int[11];
        for(int i=0;i<=10;i++)
        {
            String s="b"+(i);
            int rid=getResources().getIdentifier(s,"id",getPackageName());
            b[i]=rid;
        }
        for(int id:b)
        {
            Button button=findViewById(id);
            if(button !=null)
            {
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        handleButtonClick(view.getId());
                    }
                });
            }
        }

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
            }
        });
    }

    private void handleButtonClick(int id) {
            String txt=t1.getText().toString();

            t1.setText(txt+((Button)findViewById(id)).getText());

    }


}