package com.example.icare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Occupational extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_occupational);

        ImageButton ins = (ImageButton)findViewById(R.id.Inspirational);

        ins.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Occupational.this, InspirationalB.class);
                startActivity(i);
            }
        });



        ImageButton sch = (ImageButton)findViewById(R.id.ScheduleP);

        sch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Occupational.this, SchedulePlanner.class);
                startActivity(i);
            }
        });



        ImageButton emp = (ImageButton)findViewById(R.id.Employment);

        emp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Occupational.this, Employment.class);
                startActivity(i);
            }
        });


    }
}
