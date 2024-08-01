package com.example.database;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,pass,place;
    Button insert,view,update,del;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        insert=(Button)findViewById(R.id.insert);
        view=(Button)findViewById(R.id.insert);
        update=(Button)findViewById(R.id.insert);
        del=(Button)findViewById(R.id.insert);
        name=(EditText) findViewById(R.id.name);
        pass=(EditText) findViewById(R.id.pass);
        place=(EditText) findViewById(R.id.place);

        final databasein db=new databasein(MainActivity.this);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=name.getText().toString();
                String s2=pass.getText().toString();
                String s3=place.getText().toString();

                db.InsertValues(s1,s2,s3);
            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=db.getAllData();
                StringBuffer buffer=new StringBuffer();
                while(res.moveToNext())
                {
                    buffer.append("Name: "+res.getString(0)+"\n");
                    buffer.append("Password: "+res.getString(1)+"\n");
                    buffer.append("Place: "+res.getString(2)+"\n");
                }
                showMessage("DATA",buffer.toString());
            }
        });
    }

    private void showMessage(String data, String toString) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(data);
        builder.setMessage(toString);
        builder.show();
    }
}