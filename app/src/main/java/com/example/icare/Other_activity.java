package com.example.icare;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Other_activity extends AppCompatActivity {

    String Message;

    ImageView exer;

    @Override
    public void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.other_activity);

        exer = (ImageView)findViewById(R.id.Physicall);

        exer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Other_activity.this, Physical.class);
                startActivity(i);
            }
        });


        ImageView emot = (ImageView)findViewById(R.id.Emotional);

        emot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Other_activity.this, Emotional.class);
                startActivity(i);
            }
        });

        ImageView soc = (ImageView)findViewById(R.id.Social);

        soc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Other_activity.this, Social.class);
                startActivity(i);
            }
        });

        ImageView intt = (ImageView)findViewById(R.id.Intellectual);

        intt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Other_activity.this, Intellectual.class);
                startActivity(i);
            }
        });


        ImageView spi = (ImageView)findViewById(R.id.Spiritual);

        spi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Other_activity.this, Spiritual.class);
                startActivity(i);
            }
        });
    }
    public void onBackPressed(){
        super.onBackPressed();

        overridePendingTransition(R.anim.godown , R.anim.goup);
    }


}
