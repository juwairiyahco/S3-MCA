package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b;
EditText u,p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.b);
        u=(EditText) findViewById(R.id.user);
        p=(EditText) findViewById(R.id.pass);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=u.getText().toString();
                String pass=p.getText().toString();
                if (user.equals("juwi")&& pass.equals("123"))
                    Toast.makeText(getApplicationContext(),"logged in successfully",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"Invalid credentials",Toast.LENGTH_SHORT).show();
            }
        });

    }
}