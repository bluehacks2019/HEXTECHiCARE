package com.example.icare;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AloneTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alone_time);



        Button set = (Button)findViewById(R.id.Set);

        set.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

//                boolean isEnabled = Settings.System.getInt(
//                        getContentResolver(),
//                        Settings.System.AIRPLANE_MODE_ON, 0) == 1;
//
//                Settings.System.putInt(
//                        getContentResolver(),
//                        Settings.System.AIRPLANE_MODE_ON, isEnabled ? 0 : 1);
//
//
//                Intent intent = new Intent(Intent.ACTION_AIRPLANE_MODE_CHANGED);
//                intent.putExtra("state", !isEnabled);
//                sendBroadcast(intent);

            }
        });
    }
}
