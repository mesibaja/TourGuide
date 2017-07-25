package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.tourguide.R.id.entdecken;
import static com.example.android.tourguide.R.id.leben;
import static com.example.android.tourguide.R.id.rathaus;
import static com.example.android.tourguide.R.id.stadtraum;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        // Find the View that shows the rathaus category
        TextView rathaus = (TextView) findViewById(R.id.rathaus);

        // Set a click listener on that View
        rathaus.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the rathaus category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rathausIntent = new Intent(MainActivity.this, RathausActivity.class);

                // Start the new activity
                startActivity(rathausIntent);
            }
        });

        // Find the View that shows the leben category
        TextView leben = (TextView) findViewById(R.id.leben);

        // Set a click listener on that View
        leben.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the leben category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Leben}
                Intent lebenIntent = new Intent(MainActivity.this, LebenActivity.class);

                // Start the new activity
                startActivity(lebenIntent);
            }
        });

        // Find the View that shows the entdecken category
        TextView entdecken = (TextView) findViewById(R.id.entdecken);

        // Set a click listener on that View
        entdecken.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the entdecken category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Entdecken}
                Intent entdeckenIntent = new Intent(MainActivity.this, EntdeckenActivity.class);

                // Start the new activity
                startActivity(entdeckenIntent);
            }
        });

        // Find the View that shows the stadtraum category
        TextView stadtraum = (TextView) findViewById(R.id.stadtraum);

        // Set a click listener on that View
        stadtraum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the stadtraum category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Stadtraum}
                Intent stadtraumIntent = new Intent(MainActivity.this, StadtraumActivity.class);

                // Start the new activity
                startActivity(stadtraumIntent);
            }
        });
    }
}