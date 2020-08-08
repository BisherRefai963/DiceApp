package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView diceImage1=findViewById(R.id.imgDice1);
        final ImageView diceImage2=findViewById(R.id.imgDice2);
        final int [] diceImages=
                {R.drawable.dice1,R.drawable.dice2
                ,R.drawable.dice3
                ,R.drawable.dice4
                ,R.drawable.dice5
                ,R.drawable.dice6};
        Button btn = findViewById(R.id.btnRoll);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rndObject=new Random();
                int myRandomNumbers=rndObject.nextInt(6);

            }
        });

    }
}
