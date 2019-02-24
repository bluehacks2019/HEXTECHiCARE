package com.example.icare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Intellectual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intellectual);

        ImageView lh = (ImageView)findViewById(R.id.LifeHacks);

        lh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intellectual.this, LifeHacks.class);
                startActivity(i);
            }
        });

        ImageView mr = (ImageView)findViewById(R.id.MustRead);

        mr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intellectual.this, MustRead.class);
                startActivity(i);
            }
        });

        ImageView arts = (ImageView)findViewById(R.id.Arts);

        arts.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intellectual.this, Arts.class);
                startActivity(i);
            }
        });

    }
}
