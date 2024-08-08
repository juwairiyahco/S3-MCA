package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=1;i<=10;i++)
        {
            String b="b"+i;
            int r=getResources().getIdentifier(b,"id",getPackageName());
            Button bu= findViewById(r);
            bu.setOnClickListener(this);
        }
    }
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.b1:
                break;
            default:break;
        }
    }
}