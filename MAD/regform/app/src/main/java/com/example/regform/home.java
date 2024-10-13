package com.example.regform;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class home extends AppCompatActivity {
    TextView n,e,p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        n=(TextView) findViewById(R.id.name);
        e=(TextView) findViewById(R.id.email);
        p=(TextView) findViewById(R.id.phno);
        Intent i=getIntent();
        String name=i.getStringExtra("name");
        String email=i.getStringExtra("email");
        String phno=i.getStringExtra("phno");
        n.setText(name);
        e.setText(email);
        p.setText(phno);
    }
}