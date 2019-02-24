package com.example.icare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Wellness extends AppCompatActivity {

    Intent goOther;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellness);
    }

    public void GoOther()
    {
        goOther = new Intent(getApplicationContext(), Other_activity.class);
        startActivity(goOther);

        overridePendingTransition(R.anim.goup, R.anim.godown);
    }

    public void onClick(View view)
    {
        GoOther();
    }

}
