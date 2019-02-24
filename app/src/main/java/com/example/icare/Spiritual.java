package com.example.icare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Spiritual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiritual);

        ImageView insp = (ImageView)findViewById(R.id.Inspirational);

        insp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Spiritual.this, InspirationalQ.class);
                startActivity(i);
            }
        });

        ImageView bible = (ImageView)findViewById(R.id.BibleV);

        bible.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Spiritual.this, BibleVerses.class);
                startActivity(i);
            }
        });

        ImageView life = (ImageView)findViewById(R.id.LifeTB);

        life.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Spiritual.this, LifeTeaching.class);
                startActivity(i);
            }
        });

        ImageView prayer = (ImageView)findViewById(R.id.Prayer);

        prayer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Spiritual.this, Prayer.class);
                startActivity(i);
            }
        });

    }
}
