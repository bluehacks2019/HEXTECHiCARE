package com.example.icare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Monday4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);

        Button sch = (Button)findViewById(R.id.Next);
        Toast.makeText(this, "4th", Toast.LENGTH_SHORT).show();
        sch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Monday4.this, Exercise.class);
                startActivity(i);
            }
        });
    }
}
