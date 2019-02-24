package com.example.icare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MyDiary2 extends AppCompatActivity {

    EditText a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_diary2);

        a = findViewById(R.id.diary);

        Button sch = (Button)findViewById(R.id.Submit);

        sch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String diary = a.getText().toString();

                String type = "login";
                BackgroundWorker backgroundWorker = new BackgroundWorker(MyDiary2.this);
                backgroundWorker.execute(type, diary);

            }
        });
       getIncomingIntent();
    }

    private void getIncomingIntent(){

        if(getIntent().hasExtra("price")){

            String name = getIntent().getStringExtra("price");

            setImage(name);
        }
    }

    private void setImage(String name){

        TextView diary = findViewById(R.id.diary);
        diary.setText(name);

    }
}
