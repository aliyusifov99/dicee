package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView firstDice;
    ImageView secondDice;
    Button button;
    int num1;
    int num2;
    TextView tv1;
    TextView tv2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        firstDice = findViewById(R.id.firstDice);
        secondDice = findViewById(R.id.secondDice);
        tv1 = findViewById(R.id.tv1);
        tv1 = findViewById(R.id.tv1);
    }

    public void roll(View view) {
        num1 = new Random().nextInt(7)+1;
        num2 = new Random().nextInt(7)+1;
        switch (num1)
        {
            case 1:
                firstDice.setImageResource(R.drawable.dice1);
                tv1.setText("1");
                break;
            case 2:
                firstDice.setImageResource(R.drawable.dice2);
                tv1.setText("2");
                break;
            case 3:
                firstDice.setImageResource(R.drawable.dice3);
                tv1.setText("3");
                break;
            case 4:
                firstDice.setImageResource(R.drawable.dice4);
                tv1.setText("4");
                break;
            case 5:
                firstDice.setImageResource(R.drawable.dice5);
                tv1.setText("5");
                break;
            case 6:
                firstDice.setImageResource(R.drawable.dice6);
                tv1.setText("6");
                break;
            default:
                break;
        }
        switch (num2)
        {
            case 1:
                secondDice.setImageResource(R.drawable.dice1);
                tv2.setText("1");
                break;
            case 2:
                secondDice.setImageResource(R.drawable.dice2);
                tv2.setText("2");
                break;
            case 3:
                secondDice.setImageResource(R.drawable.dice3);
                tv2.setText("3");
                break;
            case 4:
                secondDice.setImageResource(R.drawable.dice4);
                tv2.setText("4");
                break;
            case 5:
                secondDice.setImageResource(R.drawable.dice5);
                tv2.setText("5");
                break;
            case 6:
                secondDice.setImageResource(R.drawable.dice6);
                tv2.setText("6");
                break;
            default:
                break;
        }

    }
}