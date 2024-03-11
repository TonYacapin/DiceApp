package com.example.cc10624diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnRoll, btnReset, btnClose;
    private ImageView imgDice;

    private Button btn4Sided, btn6Sided, btn8Sided;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind the buttons and image view from the layout
        btnRoll = findViewById(R.id.btnRoll);
        btnReset = findViewById(R.id.btnReset);
        btnClose = findViewById(R.id.btnClose);
        imgDice = findViewById(R.id.imageViewDice);

        btn4Sided = findViewById(R.id.radioButton4Sided);
        btn6Sided = findViewById(R.id.radioButton6Sided);
        btn8Sided = findViewById(R.id.radioButton8Sided);


        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgDice.setImageResource(R.drawable.cleverbaby);
            }
        });

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDice();
            }
        });

        btn4Sided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4Sided.setSelected(true);
                btn6Sided.setSelected(false);
                btn8Sided.setSelected(false);
            }
        });
        btn6Sided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4Sided.setSelected(false);
                btn6Sided.setSelected(true);
                btn8Sided.setSelected(false);
            }
        });
        btn8Sided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4Sided.setSelected(false);
                btn6Sided.setSelected(false);
                btn8Sided.setSelected(true);
            }
        });

    }


    public void showDice() {
        Random rnd = new Random();
        int dieType = 6;


        if (btn4Sided.isSelected()) {
            dieType = 4;
        } else if (btn8Sided.isSelected()) {
            dieType = 8;
        }

        int randomNum = rnd.nextInt(dieType) + 1;

        switch (randomNum) {
            case 1:
                switch (dieType) {
                    case 4:
                        imgDice.setImageResource(R.drawable.fourside_one);
                        break;
                    case 6:
                        imgDice.setImageResource(R.drawable.sixsided_one);
                        break;
                    case 8:
                        imgDice.setImageResource(R.drawable.eightsided_one);
                        break;
                }
                break;
            case 2:
                switch (dieType) {
                    case 4:
                        imgDice.setImageResource(R.drawable.fourside_two);
                        break;
                    case 6:
                        imgDice.setImageResource(R.drawable.sixsided_two);
                        break;
                    case 8:
                        imgDice.setImageResource(R.drawable.eightsided_two);
                        break;
                }
                break;
            case 3:
                switch (dieType) {
                    case 4:
                        imgDice.setImageResource(R.drawable.fourside_three);
                        break;
                    case 6:
                        imgDice.setImageResource(R.drawable.sixsided_three);
                        break;
                    case 8:
                        imgDice.setImageResource(R.drawable.eightsided_three);
                        break;
                }
                break;
            case 4:
                switch (dieType) {
                    case 4:
                        imgDice.setImageResource(R.drawable.fourside_four);
                        break;
                    case 6:
                        imgDice.setImageResource(R.drawable.sixsided_four);
                        break;
                    case 8:
                        imgDice.setImageResource(R.drawable.eightsided_four);
                        break;
                }
                break;
            case 5:
                switch (dieType) {
                    case 4:
                        // Handle 4-sided die
                        break;
                    case 6:
                        imgDice.setImageResource(R.drawable.sixsided_five);
                        break;
                    case 8:
                        imgDice.setImageResource(R.drawable.eightsided_five);
                        break;
                }
                break;
            case 6:
                switch (dieType) {
                    case 4:
                        // Handle 4-sided die
                        break;
                    case 6:
                        imgDice.setImageResource(R.drawable.sixsided_six);
                        break;
                    case 8:
                        imgDice.setImageResource(R.drawable.eightsided_six);
                        break;
                }
                break;
            case 7:
                switch (dieType) {
                    case 8:
                        imgDice.setImageResource(R.drawable.eightsided_seven);
                        break;
                }
                break;
            case 8:
                switch (dieType) {
                    case 8:
                        imgDice.setImageResource(R.drawable.eightsided_eight);
                        break;
                }
                break;
        }
    }

}
