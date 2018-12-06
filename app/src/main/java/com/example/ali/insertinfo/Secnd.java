package com.example.ali.insertinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Secnd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secnd);
        {
                Intent intent=getIntent();
                String name=intent.getStringExtra("name");
                String familly=intent.getStringExtra("familly");
                String age=intent.getStringExtra("age");
                String phone=intent.getStringExtra("phone");
                TextView nametxt=findViewById(R.id.name);
                nametxt.setText(name);
                TextView famillytxt=findViewById(R.id.familly);
               famillytxt.setText(familly);
                TextView agetxt=findViewById(R.id.age);
                agetxt.setText(age);
                TextView phonetxt=findViewById(R.id.phone);
                phonetxt.setText(phone);

        };
    }

}
