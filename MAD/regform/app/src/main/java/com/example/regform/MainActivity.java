package com.example.regform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText n,e,p;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        n=(EditText) findViewById(R.id.name);
        e=(EditText) findViewById(R.id.email);
        p=(EditText) findViewById(R.id.phno);
        b=(Button) findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=n.getText().toString();
                String email=e.getText().toString();
                String phno=p.getText().toString();
                Intent i=new Intent(MainActivity.this,home.class);
                i.putExtra("name",name);
                i.putExtra("email",email);
                i.putExtra("phno",phno);
                startActivity(i);
            }
        });
    }
}