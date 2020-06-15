package com.example.kok_30_memorygame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv_p1, tv_p2;
    ImageView iv_11, iv_12, iv_13, iv_14, iv_21, iv_22, iv_23, iv_24, iv_31, iv_32, iv_33, iv_34;
    Integer[] cardsArr = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};
    int img101, img102, img103, img104, img105, img106, img201, img202, img203, img204, img205, img206;
    int firstCard, secCard, clickedFirst, clickedSec, cardNumber = 1, turn = 1, playerPoints = 0, cpuPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_p1 = findViewById(R.id.TV_P1);
        tv_p2 = findViewById(R.id.TV_P2);

        iv_11 = findViewById(R.id.IV_11);
        iv_12 = findViewById(R.id.IV_12);
        iv_13 = findViewById(R.id.IV_13);
        iv_14 = findViewById(R.id.IV_14);
        iv_21 = findViewById(R.id.IV_21);
        iv_22 = findViewById(R.id.IV_22);
        iv_23 = findViewById(R.id.IV_23);
        iv_24 = findViewById(R.id.IV_24);
        iv_31 = findViewById(R.id.IV_31);
        iv_32 = findViewById(R.id.IV_32);
        iv_33 = findViewById(R.id.IV_33);
        iv_34 = findViewById(R.id.IV_34);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");

        // To Load Cards In IMG
        frontOfCardsRes();

        // To Shuffle The Cards
        Collections.shuffle(Arrays.asList(cardsArr));

        // To Change Anther Player Color ( Like Inactive )
        tv_p2.setTextColor(Color.GRAY);

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_11, theCard);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_12, theCard);
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_13, theCard);
            }
        });

        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_14, theCard);
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_21, theCard);
            }
        });

        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_22, theCard);
            }
        });

        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_23, theCard);
            }
        });

        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_24, theCard);
            }
        });

        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_31, theCard);
            }
        });

        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_32, theCard);
            }
        });

        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_33, theCard);
            }
        });

        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_34, theCard);
            }
        });

    } // END On Create

    private void doStuff(ImageView iv, int card) {

        // To Set The Correct Image In ImageView
        switch (cardsArr[card]) {
            case 101:
                iv.setImageResource(img101);
                break;
            case 102:
                iv.setImageResource(img102);
                break;
            case 103:
                iv.setImageResource(img103);
                break;
            case 104:
                iv.setImageResource(img104);
                break;
            case 105:
                iv.setImageResource(img105);
                break;
            case 106:
                iv.setImageResource(img106);
                break;
            case 201:
                iv.setImageResource(img201);
                break;
            case 202:
                iv.setImageResource(img202);
                break;
            case 203:
                iv.setImageResource(img203);
                break;
            case 204:
                iv.setImageResource(img204);
                break;
            case 205:
                iv.setImageResource(img205);
                break;
            case 206:
                iv.setImageResource(img206);
                break;
        }

        // To Check Which IMG Is Selected And Save It In Temp Variable
        if (cardNumber == 1) {
            firstCard = cardsArr[card];
            if (firstCard > 200) firstCard = firstCard - 100;
            cardNumber = 2;
            clickedFirst = card;
        } else if (cardNumber == 2) {
            secCard = cardsArr[card];
            if (secCard > 200) secCard = secCard - 100;
            cardNumber = 1;
            clickedSec = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);


            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 1000);


        }

    }

    private void calculate() {
        if (firstCard == secCard) {

            switch (clickedFirst) {
                case 0:
                    iv_11.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    iv_12.setVisibility(View.INVISIBLE);
                    break;
                case 2:
                    iv_13.setVisibility(View.INVISIBLE);
                    break;
                case 3:
                    iv_14.setVisibility(View.INVISIBLE);
                    break;
                case 4:
                    iv_21.setVisibility(View.INVISIBLE);
                    break;
                case 5:
                    iv_22.setVisibility(View.INVISIBLE);
                    break;
                case 6:
                    iv_23.setVisibility(View.INVISIBLE);
                    break;
                case 7:
                    iv_24.setVisibility(View.INVISIBLE);
                    break;
                case 8:
                    iv_31.setVisibility(View.INVISIBLE);
                    break;
                case 9:
                    iv_32.setVisibility(View.INVISIBLE);
                    break;
                case 10:
                    iv_33.setVisibility(View.INVISIBLE);
                    break;
                case 11:
                    iv_34.setVisibility(View.INVISIBLE);
                    break;
            }

            switch (clickedSec) {
                case 0:
                    iv_11.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    iv_12.setVisibility(View.INVISIBLE);
                    break;
                case 2:
                    iv_13.setVisibility(View.INVISIBLE);
                    break;
                case 3:
                    iv_14.setVisibility(View.INVISIBLE);
                    break;
                case 4:
                    iv_21.setVisibility(View.INVISIBLE);
                    break;
                case 5:
                    iv_22.setVisibility(View.INVISIBLE);
                    break;
                case 6:
                    iv_23.setVisibility(View.INVISIBLE);
                    break;
                case 7:
                    iv_24.setVisibility(View.INVISIBLE);
                    break;
                case 8:
                    iv_31.setVisibility(View.INVISIBLE);
                    break;
                case 9:
                    iv_32.setVisibility(View.INVISIBLE);
                    break;
                case 10:
                    iv_33.setVisibility(View.INVISIBLE);
                    break;
                case 11:
                    iv_34.setVisibility(View.INVISIBLE);
                    break;
            }

            // Add Point To Correct Player
            if (turn == 1) {
                playerPoints++;
                tv_p1.setText("P1: " + playerPoints);
            } else if (turn == 2) {
                cpuPoints++;
                tv_p2.setText("P2: " + cpuPoints);
            }

        } else {
            iv_11.setImageResource(R.drawable.question_mark);
            iv_12.setImageResource(R.drawable.question_mark);
            iv_13.setImageResource(R.drawable.question_mark);
            iv_14.setImageResource(R.drawable.question_mark);
            iv_21.setImageResource(R.drawable.question_mark);
            iv_22.setImageResource(R.drawable.question_mark);
            iv_23.setImageResource(R.drawable.question_mark);
            iv_24.setImageResource(R.drawable.question_mark);
            iv_31.setImageResource(R.drawable.question_mark);
            iv_32.setImageResource(R.drawable.question_mark);
            iv_33.setImageResource(R.drawable.question_mark);
            iv_34.setImageResource(R.drawable.question_mark);

            // Change The Player Turn
            if (turn == 1) {
                turn = 2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            } else if (turn == 2) {
                turn = 1;
                tv_p1.setTextColor(Color.BLACK);
                tv_p2.setTextColor(Color.GRAY);
            }

        }
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        // To check The Is Over OR NOT
        endGame();
    }

    private void endGame() {
        if (iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder
                    .setMessage("GAME OVER!\nP1 : " + playerPoints + "\nP2 : " + cpuPoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            finish();
                        }
                    }).setNegativeButton("EXIT !!", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }
    }

    private void frontOfCardsRes() {
        img101 = R.drawable.icon_img_101;
        img102 = R.drawable.icon_img_102;
        img103 = R.drawable.icon_img_103;
        img104 = R.drawable.icon_img_104;
        img105 = R.drawable.icon_img_105;
        img106 = R.drawable.icon_img_106;
        img201 = R.drawable.icon_img_201;
        img202 = R.drawable.icon_img_202;
        img203 = R.drawable.icon_img_203;
        img204 = R.drawable.icon_img_204;
        img205 = R.drawable.icon_img_205;
        img206 = R.drawable.icon_img_206;
    }

} // END Activity
