package com.example.mail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1,e2,e3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.b1);
        e1=(EditText) findViewById(R.id.mail);
        e2=(EditText) findViewById(R.id.sub);
        e3=(EditText) findViewById(R.id.con);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to=e1.getText().toString();
                String sub=e2.getText().toString();
                String cont=e3.getText().toString();

                Intent email=new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT,sub);
                email.putExtra(Intent.EXTRA_TEXT,cont);
                email.setType("text/plain");
                startActivity(Intent.createChooser(email,"Select Email"));
            }
        });
    }
}