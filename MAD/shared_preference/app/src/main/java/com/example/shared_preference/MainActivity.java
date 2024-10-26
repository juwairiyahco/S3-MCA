package com.example.shared_preference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button br,bw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView) findViewById(R.id.text_status);
        bw=(Button) findViewById(R.id.btn_write);
        br=(Button) findViewById(R.id.btn_read);
        String usernamedemo="demo1po";
        String emaildemo="demo1@gmail.ou";

        SharedPreferences sp =getSharedPreferences("sp_abc",MODE_PRIVATE);
        bw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor se = sp.edit();
                se.putString("username",usernamedemo);
                se.putString("email",emaildemo);
                se.apply();
                txt.setText("written");

            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u,e;
                u=sp.getString("username","");
                e=sp.getString("email","");
                txt.setText("Username: "+u+" \nEmail: "+e);
            }
        });
    }
}