package com.example.icare;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class SelfDiscovery extends AppCompatActivity {

    RadioButton a,b,c,d,e,f,g,h,i,j,k,l,m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_discovery);

        Button sch = (Button)findViewById(R.id.Submit);


        a = (RadioButton)findViewById(R.id.a);
        d = (RadioButton)findViewById(R.id.d);
        g = (RadioButton)findViewById(R.id.g);
        j = (RadioButton)findViewById(R.id.j);
        m = (RadioButton)findViewById(R.id.m);

        sch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(a.isChecked())
                {
                    if(d.isChecked())
                    {
                        if(g.isChecked())
                        {
                            if(j.isChecked())
                            {
                                if(m.isChecked())
                                {
                                    AlertDialog.Builder alertadd = new AlertDialog.Builder(SelfDiscovery.this);
                                    alertadd.setMessage("You are an Introvert");
                                    alertadd.show();
                                }
                            }
                        }
                    }
                }
                else
                {
                    // not checked
                }
            }
        });


    }
}
