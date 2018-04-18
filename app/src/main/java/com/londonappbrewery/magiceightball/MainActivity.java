package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] frasi = {
                "Garofalo",
                "Simpa",
                "Canoli",
        };

        final TextView mainText = findViewById(R.id.text_body);
        final Button askButton = findViewById(R.id.button_main);

        askButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // assigns a random image. This line creates the Random object on the fly and uses as bound the very length of the array so to avoid OutOfBoundExceptions
                mainText.setText(frasi[new Random().nextInt(frasi.length)]);
            }
        });


    }
}
