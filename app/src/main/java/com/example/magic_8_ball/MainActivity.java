package com.example.magic_8_ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        TextView tvDescription = findViewById(R.id.tvDescription);
        final ImageView ivBall = findViewById(R.id.ivBall);
        Button btnAsk = findViewById(R.id.btnAsk);

        final int[] ballArray = {
                R.drawable.ans_is_yes,
                R.drawable.ask_later,
                R.drawable.no,
                R.drawable.no_idea,
                R.drawable.yes
        };

        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNum = new Random();
                int number = randomNum.nextInt(5);

                ivBall.setImageResource(ballArray[number]);
            }
        });
    }
}
