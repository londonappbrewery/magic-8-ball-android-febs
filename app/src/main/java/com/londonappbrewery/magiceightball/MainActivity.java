package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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
                String nuovaFrase;
                String currentText;
                // assign a new string only if it's different from the current one. Otherwise pick another until you got a valid one.
                do {
                    nuovaFrase = frasi[new Random().nextInt(frasi.length)];
                    currentText = (String) mainText.getText();
                } while (nuovaFrase.compareTo(currentText) == 0);
                mainText.setText(nuovaFrase);
            }
        });


    }
}
