package com.example.icare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView;

public class Emotional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotional);

        ImageView diary = (ImageView)findViewById(R.id.MyDiary);

        diary.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Emotional.this, MyDiary.class);
                startActivity(i);
            }
        });

        ImageView think = (ImageView)findViewById(R.id.ThinkPos);

        think.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Emotional.this, ThinkPositive.class);
                startActivity(i);
            }
        });

        ImageView smt = (ImageView)findViewById(R.id.SMT);

        smt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Emotional.this, SMT.class);
                startActivity(i);
            }
        });

        ImageView insp = (ImageView)findViewById(R.id.Inspired);

        insp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Emotional.this, Inspirational.class);
                startActivity(i);
            }
        });

        ImageView alone = (ImageView)findViewById(R.id.Alone);

        alone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Emotional.this, AloneTime.class);
                startActivity(i);
            }
        });

        ImageView self = (ImageView)findViewById(R.id.SelfDis);

        self.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Emotional.this, SelfDiscovery.class);
                startActivity(i);
            }
        });
    }
}
