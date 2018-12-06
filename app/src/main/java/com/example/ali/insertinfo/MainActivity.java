package com.example.ali.insertinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       final String name,familly,phone,age;

        setContentView(R.layout.activity_main);
        EditText txtneme=findViewById(R.id.name);
        name=txtneme.getText().toString();
        EditText txtfamiily=findViewById(R.id.famiily);
        familly= txtfamiily.getText().toString();
        EditText txtage=findViewById(R.id.age);
        age=txtage.getText().toString();
        EditText txtphone=findViewById(R.id.age);
        phone=txtphone.getText().toString();


        Button btn1=findViewById(R.id.send);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Secnd.class);
                intent.putExtra("name",name.toString());
                intent.putExtra("familly",familly.toString());
                intent.putExtra("age",age);
                intent.putExtra("phone",phone.toString());
                startActivity(intent);
            }
        });


    }

}
