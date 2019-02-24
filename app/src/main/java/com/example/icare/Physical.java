package com.example.icare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Physical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical);


        ImageView exer = (ImageView)findViewById(R.id.Exercise);

        exer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Physical.this, Exercise.class);
                startActivity(i);
            }
        });

        ImageView rest = (ImageView)findViewById(R.id.RestTime);

        rest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Physical.this, RestTime.class);
                startActivity(i);
            }
        });

        ImageView health = (ImageView)findViewById(R.id.Healthy);

        health.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Physical.this, HealthRecipes.class);
                startActivity(i);
            }
        });

        ImageView healthfacts = (ImageView)findViewById(R.id.HealthF);

        healthfacts.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Physical.this, HealthFact.class);
                startActivity(i);
            }
        });
    }
}
