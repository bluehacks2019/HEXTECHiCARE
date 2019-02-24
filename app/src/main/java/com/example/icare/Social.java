package com.example.icare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Social extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        Button health = (Button)findViewById(R.id.Tipstomake);

        health.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Social.this, Tips.class);
                startActivity(i);
            }
        });

    }


    public void onClick(View view)
    {
        Intent goOther = new Intent(getApplicationContext(), Login.class);
        startActivity(goOther);

    }
}
