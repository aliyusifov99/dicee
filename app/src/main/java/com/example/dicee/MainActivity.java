package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView firstDice;
    ImageView secondDice;
    Button button;
    int num1;
    int num2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        firstDice = findViewById(R.id.firstDice);
        secondDice = findViewById(R.id.secondDice);

    }

    public void roll(View view) {
        num1 = new Random().nextInt(7)+1;
        num2 = new Random().nextInt(7)+1;
        switch (num1)
        {
            case 1:
                firstDice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                firstDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                firstDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                firstDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                firstDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                firstDice.setImageResource(R.drawable.dice6);
                break;
            default:
                break;
        }
        switch (num2)
        {
            case 1:
                secondDice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                secondDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                secondDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                secondDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                secondDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                secondDice.setImageResource(R.drawable.dice6);
                break;
            default:
                break;
        }

    }
}