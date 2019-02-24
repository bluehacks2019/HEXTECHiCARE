package com.example.icare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class Exercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.settings:
                //Intent myIntent = new Intent(getBaseContext(),Viewcart.class);
                // startActivity(myIntent);
//                Intent myIntent = new Intent( this, Viewcart.class);
//
//                myIntent.putExtra("ex", MainActivity.username);
//
//                startActivity(myIntent);
                Toast.makeText(this, "DATE", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void Monds(View view)
    {
        Intent monday = new Intent(getApplicationContext(), Monday.class);
        startActivity(monday);
    }

    public void Tues(View view)
    {
        Intent monday = new Intent(getApplicationContext(), Tuesday.class);
        startActivity(monday);
    }

    public void Wed(View view)
    {
        Intent monday = new Intent(getApplicationContext(), Wednesday.class);
        startActivity(monday);
    }
}
