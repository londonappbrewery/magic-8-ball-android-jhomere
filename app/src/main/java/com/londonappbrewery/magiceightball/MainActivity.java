package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = findViewById(R.id.askButton);

       final int[] theAnswers = {
                            R.drawable.ball1,
                            R.drawable.ball2,
                            R.drawable.ball3,
                            R.drawable.ball4,
                            R.drawable.ball5
       };

        final ImageView the8Ball = findViewById(R.id.image_eightBall);

        askButton.setOnClickListener((v) -> {

            Log.d("Magic 8 Ball", "The Button has Been Pressed");

            Random randomAnswerGenerator = new Random();
            int currentAnswer =randomAnswerGenerator.nextInt(5);

            the8Ball.setImageResource(theAnswers[currentAnswer]);

        });
    }
}
