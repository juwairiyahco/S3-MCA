package com.example.intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.File;

public class MainActivity extends AppCompatActivity {
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
        b=(Button) findViewById(R.id.b1);
        b.setOnClickListener(v -> {
            Intent email=new Intent(Intent.ACTION_SEND);
            email.putExtra(Intent.EXTRA_EMAIL,new String[]{"mohanvyshnav@yahoo.co.in"});
            email.putExtra(Intent.EXTRA_SUBJECT,"sub");
            email.putExtra(Intent.EXTRA_TEXT,"cont");
            email.setType("message/rfc822");
            startActivity(Intent.createChooser(email,"Select Email"));

        });
    }
}