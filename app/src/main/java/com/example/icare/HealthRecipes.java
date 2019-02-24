package com.example.icare;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HealthRecipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_recipes);

        Button exer = (Button)findViewById(R.id.MBBreakfast);

        exer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertadd = new AlertDialog.Builder(HealthRecipes.this);
                LayoutInflater factory = LayoutInflater.from(HealthRecipes.this);
                final View view = factory.inflate(R.layout.activity_sample, null);
                alertadd.setMessage("Breakfast –  Sun Butter, Banana & Chia Seed Toast" +"\n"+ "Ingredients:" +"\n"+ "1 Slice 100% Whole Wheat Bread (I used one that was 50 cal. per slice.)"
                + "\n" + "1 Tbsp. Sunbutter" + "\n" + "1/2 Medium Banana, Sliced" + "\n" + "1/2 Tsp. Chia Seeds"+ "\n"+"\n" + "1/2 Medium Banana, Sliced"+ "\n" + "Toast the bread and spread the sunbutter over the top"+ "\n" + "Place banana slices over the sun butter and top it off with chia seeds."
                        + "\n" + "Serve right away and enjoy!");
                alertadd.show();
            }
        });

        Button lunch = (Button)findViewById(R.id.MBLunch);

        lunch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertadd = new AlertDialog.Builder(HealthRecipes.this);
                LayoutInflater factory = LayoutInflater.from(HealthRecipes.this);
                final View view = factory.inflate(R.layout.activity_sample, null);
                alertadd.setMessage("Lunch –   Grilled Steak Tortilla Salad" +"\n"+
                        "Ingredients:" +"\n"+
                        "1 1/2 lb. skirt steak" + "\n" +
                        "1 tsp. chili powder" + "\n" +
                        "Kosher salt" + "\n" +
                        "Pepper"+ "\n"+"\n" +
                        "1 1/2 lb. plum tomatoes, cut into pieces"+ "\n" +
                        "2 scallions, sliced"+ "\n" +
                        "1 jalapeño, thinly sliced" + "\n" +
                        "2 tbsp. fresh lime juice" + "\n" +
                        "1 bunch arugula, thick stems discarded" + "\n" +
                        "1 c. fresh cilantro" + "\n" +
                        "Charred flour tortillas, for serving" + "\n" +
                        "Directions" + "\n" +
                        "Season steak with chili powder and ½ teaspoon each salt and pepper. Broil or grill to desired doneness, 3 to 4 minutes per side for medium-rare. Let rest before slicing. " + "\n" +
                        "In bowl, toss plum tomatoes, scallions, jalapeño, lime juice, 1/2 teaspoon salt and 1/4 teaspoon pepper. Toss with cilantro and arugula; fold in steak. " + "\n" +
                        "Serve with charred flour tortillas.");
                alertadd.show();
            }
        });

        Button dinner = (Button)findViewById(R.id.MBDinner);

        dinner.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertadd = new AlertDialog.Builder(HealthRecipes.this);
                LayoutInflater factory = LayoutInflater.from(HealthRecipes.this);
                final View view = factory.inflate(R.layout.activity_sample, null);
                alertadd.setMessage("Dinner –  Chicken and tomato spiced curry recipe" +"\n"+
                        "Ingredients:" +"\n"+
                        "2 tbsp vegetable oil" + "\n" +
                        "450g chicken breast, cut into cubes" + "\n" +
                        "1 onion, chopped" + "\n" +
                        "1 red pepper, deseeded and sliced"+ "\n"+"\n" +
                        "2 garlic cloves, finely chopped"+ "\n" +
                        "1cm piece ginger, peeled and finely chopped"+ "\n" +
                        "2 tbsp Madras curry paste" + "\n" +
                        "400g tin chopped tomatoes" + "\n" +
                        "300g basmati rice" + "\n" +
                        "handful coriander, chopped, to serve");
                alertadd.show();
            }
        });
    }
}
