package com.example.android.quizmaster;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class begin extends AppCompatActivity {
    int n = 0;
    int score = 0;

    Button box1, box2, box3, box4;
    int[] answers = {1, 3, 4, 4, 3, 1, 2, 1, 1, 2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        page1();
        box1.setBackgroundColor(Color.BLUE);
        box2.setBackgroundColor(Color.BLUE);
        box3.setBackgroundColor(Color.BLUE);
        box4.setBackgroundColor(Color.BLUE);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void page1() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        n = 1;
        TextView text1 = (TextView) findViewById(R.id.text_q1);
        box1 = (Button) findViewById(R.id.option_1);
        box2 = (Button) findViewById(R.id.option_2);
        box3 = (Button) findViewById(R.id.option_3);
        box4 = (Button) findViewById(R.id.option_4);
        String string1, string2, string3, string4, string5;
        boolean op1 = false, op2 = false, op3 = false, op4 = false;
        string1 = "1.what color are raichu's cheek ?";
        string2 = "BLUE";
        string3 = "red";
        string4 = "purple";
        string5 = "green";
        text1.setText(string1);
        box1.setText(string2);
        box2.setText(string3);
        box3.setText(string4);
        box4.setText(string5);


    }

    public void page2() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        n = 2;
        TextView text1 = (TextView) findViewById(R.id.text_q1);
        box1 = (Button) findViewById(R.id.option_1);
        box2 = (Button) findViewById(R.id.option_2);
        box3 = (Button) findViewById(R.id.option_3);
        box4 = (Button) findViewById(R.id.option_4);
        String string1, string2, string3, string4, string5;
        boolean op1 = false, op2 = false, op3 = false, op4 = false;
        string1 = "2.Which is the newest pokemon type?";
        string2 = "Dark";
        string3 = "Steel";
        string4 = "Fairy";
        string5 = "Ice";
        text1.setText(string1);
        box1.setText(string2);
        box2.setText(string3);
        box3.setText(string4);
        box4.setText(string5);


    }

    public void page3() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        n = 3;
        TextView text1 = (TextView) findViewById(R.id.text_q1);
        box1 = (Button) findViewById(R.id.option_1);
        box2 = (Button) findViewById(R.id.option_2);
        box3 = (Button) findViewById(R.id.option_3);
        box4 = (Button) findViewById(R.id.option_4);
        String string1, string2, string3, string4, string5;
        boolean op1 = false, op2 = false, op3 = false, op4 = false;
        string1 = "3.When was the first pokemon game released?";
        string2 = "29 Feb, 1996";
        string3 = "23 Feb, 1996";
        string4 = "21 Feb, 1996";
        string5 = "27 Feb, 1996";
        text1.setText(string1);
        box1.setText(string2);
        box2.setText(string3);
        box3.setText(string4);
        box4.setText(string5);

    }

    public void page4() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        n = 4;
        TextView text1 = (TextView) findViewById(R.id.text_q1);
        box1 = (Button) findViewById(R.id.option_1);
        box2 = (Button) findViewById(R.id.option_2);
        box3 = (Button) findViewById(R.id.option_3);
        box4 = (Button) findViewById(R.id.option_4);
        String string1, string2, string3, string4, string5;
        boolean op1 = false, op2 = false, op3 = false, op4 = false;
        string1 = "4.What does Arbok evolve into?";
        string2 = "Serviper";
        string3 = "Milotic";
        string4 = "Serperior";
        string5 = "NOTA";
        text1.setText(string1);
        box1.setText(string2);
        box2.setText(string3);
        box3.setText(string4);
        box4.setText(string5);


    }

    public void page5() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        n = 5;
        TextView text1 = (TextView) findViewById(R.id.text_q1);
        box1 = (Button) findViewById(R.id.option_1);
        box2 = (Button) findViewById(R.id.option_2);
        box3 = (Button) findViewById(R.id.option_3);
        box4 = (Button) findViewById(R.id.option_4);
        String string1, string2, string3, string4, string5;
        boolean op1 = false, op2 = false, op3 = false, op4 = false;
        string1 = "5.Which is not of flying type?";
        string2 = "Gyarados";
        string3 = "Dodrio";
        string4 = "Volcarona";
        string5 = "Doduo";
        text1.setText(string1);
        box1.setText(string2);
        box2.setText(string3);
        box3.setText(string4);
        box4.setText(string5);


    }

    public void page6() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        n = 6;
        TextView text1 = (TextView) findViewById(R.id.text_q1);
        box1 = (Button) findViewById(R.id.option_1);
        box2 = (Button) findViewById(R.id.option_2);
        box3 = (Button) findViewById(R.id.option_3);
        box4 = (Button) findViewById(R.id.option_4);
        String string1, string2, string3, string4, string5;
        boolean op1 = false, op2 = false, op3 = false, op4 = false;
        string1 = "6.onix is of type ?";
        string2 = "rock";
        string3 = "steel";
        string4 = "water";
        string5 = "grass";
        text1.setText(string1);
        box1.setText(string2);
        box2.setText(string3);
        box3.setText(string4);
        box4.setText(string5);


    }

    public void page7() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        n = 7;
        TextView text1 = (TextView) findViewById(R.id.text_q1);
        box1 = (Button) findViewById(R.id.option_1);
        box2 = (Button) findViewById(R.id.option_2);
        box3 = (Button) findViewById(R.id.option_3);
        box4 = (Button) findViewById(R.id.option_4);
        String string1, string2, string3, string4, string5;
        boolean op1 = false, op2 = false, op3 = false, op4 = false;
        string1 = "7.what color are pikachu's cheek ?";
        string2 = "BLUE";
        string3 = "red";
        string4 = "purple";
        string5 = "green";
        text1.setText(string1);
        box1.setText(string2);
        box2.setText(string3);
        box3.setText(string4);
        box4.setText(string5);

    }

    public void page8() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        n = 8;
        TextView text1 = (TextView) findViewById(R.id.text_q1);
        box1 = (Button) findViewById(R.id.option_1);
        box2 = (Button) findViewById(R.id.option_2);
        box3 = (Button) findViewById(R.id.option_3);
        box4 = (Button) findViewById(R.id.option_4);
        String string1, string2, string3, string4, string5;
        boolean op1 = false, op2 = false, op3 = false, op4 = false;
        string1 = "8. ash first pokemon was ?";
        string2 = "pikachu";
        string3 = "balbasaur";
        string4 = "onix";
        string5 = "sqirtel";
        text1.setText(string1);
        box1.setText(string2);
        box2.setText(string3);
        box3.setText(string4);
        box4.setText(string5);


    }

    public void page9() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        n = 9;
        TextView text1 = (TextView) findViewById(R.id.text_q1);
        box1 = (Button) findViewById(R.id.option_1);
        box2 = (Button) findViewById(R.id.option_2);
        box3 = (Button) findViewById(R.id.option_3);
        box4 = (Button) findViewById(R.id.option_4);
        String string1, string2, string3, string4, string5;
        boolean op1 = false, op2 = false, op3 = false, op4 = false;
        string1 = "9.Which pokemon has practically no weakness?";
        string2 = "Tynamo";
        string3 = "Magikarp";
        string4 = "Feebas";
        string5 = "Metapod";
        text1.setText(string1);
        box1.setText(string2);
        box2.setText(string3);
        box3.setText(string4);
        box4.setText(string5);


    }

    public void page10() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        n = 10;
        TextView text1 = (TextView) findViewById(R.id.text_q1);
        box1 = (Button) findViewById(R.id.option_1);
        box2 = (Button) findViewById(R.id.option_2);
        box3 = (Button) findViewById(R.id.option_3);
        box4 = (Button) findViewById(R.id.option_4);
        String string1, string2, string3, string4, string5;
        boolean op1 = false, op2 = false, op3 = false, op4 = false;
        string1 = "10.first pokemon ash caught in unova reigon?";
        string2 = "Pikachu";
        string3 = "Pidove";
        string4 = "Oshawott";
        string5 = "Palpitoad";
        text1.setText(string1);
        box1.setText(string2);
        box2.setText(string3);
        box3.setText(string4);
        box4.setText(string5);

    }

    public void next(View view) {
        if (n == 1) {
            page2();
            box1.setBackgroundColor(Color.BLUE);
            box2.setBackgroundColor(Color.BLUE);
            box3.setBackgroundColor(Color.BLUE);
            box4.setBackgroundColor(Color.BLUE);
        } else if (n == 2) {
            page3();
            box1.setBackgroundColor(Color.BLUE);
            box2.setBackgroundColor(Color.BLUE);
            box3.setBackgroundColor(Color.BLUE);
            box4.setBackgroundColor(Color.BLUE);
        } else if (n == 3) {
            page4();
            box1.setBackgroundColor(Color.BLUE);
            box2.setBackgroundColor(Color.BLUE);
            box3.setBackgroundColor(Color.BLUE);
            box4.setBackgroundColor(Color.BLUE);
        } else if (n == 4) {
            page5();
            box1.setBackgroundColor(Color.BLUE);
            box2.setBackgroundColor(Color.BLUE);
            box3.setBackgroundColor(Color.BLUE);
            box4.setBackgroundColor(Color.BLUE);
        } else if (n == 5) {
            page6();
            box1.setBackgroundColor(Color.BLUE);
            box2.setBackgroundColor(Color.BLUE);
            box3.setBackgroundColor(Color.BLUE);
            box4.setBackgroundColor(Color.BLUE);
        } else if (n == 6) {
            page7();
            box1.setBackgroundColor(Color.BLUE);
            box2.setBackgroundColor(Color.BLUE);
            box3.setBackgroundColor(Color.BLUE);
            box4.setBackgroundColor(Color.BLUE);
        } else if (n == 7) {
            page8();
            box1.setBackgroundColor(Color.BLUE);
            box2.setBackgroundColor(Color.BLUE);
            box3.setBackgroundColor(Color.BLUE);
            box4.setBackgroundColor(Color.BLUE);
        } else if (n == 8) {
            page9();
            box1.setBackgroundColor(Color.BLUE);
            box2.setBackgroundColor(Color.BLUE);
            box3.setBackgroundColor(Color.BLUE);
            box4.setBackgroundColor(Color.BLUE);
        } else if (n == 9) {
            page10();
            box1.setBackgroundColor(Color.BLUE);
            box2.setBackgroundColor(Color.BLUE);
            box3.setBackgroundColor(Color.BLUE);
            box4.setBackgroundColor(Color.BLUE);
        }

    }


    public void btn1(View view) {
        switch (n) {


            case 1:
                if (answers[0] == 1) {
                    box1.setBackgroundColor(Color.GREEN);
                    score ++;
                } else
                    box1.setBackgroundColor(Color.RED);
                break;
            case 2:
                if (answers[1] == 1) {
                    box1.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box1.setBackgroundColor(Color.RED);
                break;
            case 3:
                if (answers[2] == 1) {
                    box1.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box1.setBackgroundColor(Color.RED);
                break;
            case 4:
                if (answers[3] == 1) {
                    box1.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box1.setBackgroundColor(Color.RED);
                break;
            case 5:
                if (answers[4] == 1) {
                    box1.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box1.setBackgroundColor(Color.RED);
                break;
            case 6:
                if (answers[5] == 1) {
                    box1.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box1.setBackgroundColor(Color.RED);
                break;
            case 7:
                if (answers[6] == 1) {
                    box1.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box1.setBackgroundColor(Color.RED);
                break;
            case 8:
                if (answers[7] == 1) {
                    box1.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box1.setBackgroundColor(Color.RED);
                break;
            case 9:
                if (answers[8] == 1) {
                    box1.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box1.setBackgroundColor(Color.RED);
                break;
            case 10:
                if (answers[9] == 1) {
                    box1.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box1.setBackgroundColor(Color.RED);
                break;

        }
        TextView textView = (TextView)findViewById(R.id.txt);
        textView.setText("score:"+score);
    }

    public void btn2(View view) {
        switch (n) {
            case 1:
                if (answers[0] == 2) {
                    box2.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box2.setBackgroundColor(Color.RED);
                break;
            case 2:
                if (answers[1] == 2) {
                    box2.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box2.setBackgroundColor(Color.RED);
                break;
            case 3:
                if (answers[2] == 2) {
                    box2.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box2.setBackgroundColor(Color.RED);
                break;
            case 4:
                if (answers[3] == 2) {
                    box2.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box2.setBackgroundColor(Color.RED);
                break;
            case 5:
                if (answers[4] == 2) {
                    box2.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box2.setBackgroundColor(Color.RED);
                break;
            case 6:
                if (answers[5] == 2) {
                    box2.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box2.setBackgroundColor(Color.RED);
                break;
            case 7:
                if (answers[6] == 2) {
                    box2.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box2.setBackgroundColor(Color.RED);
                break;
            case 8:
                if (answers[7] == 2) {
                    box2.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box2.setBackgroundColor(Color.RED);
                break;
            case 9:
                if (answers[8] == 2) {
                    box2.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box2.setBackgroundColor(Color.RED);
                break;
            case 10:
                if (answers[9] == 2) {
                    box2.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box2.setBackgroundColor(Color.RED);
                break;
        }
        TextView textView = (TextView)findViewById(R.id.txt);
        textView.setText("score:"+score);

    }


    public void btn3(View view) {
        switch (n) {
            case 1:
                if (answers[0] == 3) {
                    box3.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box3.setBackgroundColor(Color.RED);
                break;
            case 2:
                if (answers[1] == 3) {
                    box3.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box3.setBackgroundColor(Color.RED);
                break;
            case 3:
                if (answers[2] == 3) {
                    box3.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box3.setBackgroundColor(Color.RED);
                break;
            case 4:
                if (answers[3] == 3) {
                    box3.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box3.setBackgroundColor(Color.RED);
                break;
            case 5:
                if (answers[4] == 3) {
                    box3.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box3.setBackgroundColor(Color.RED);
                break;
            case 6:
                if (answers[5] == 3) {
                    box3.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box3.setBackgroundColor(Color.RED);
                break;
            case 7:
                if (answers[6] == 3) {
                    box3.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box3.setBackgroundColor(Color.RED);
                break;
            case 8:
                if (answers[7] == 3) {
                    box3.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box3.setBackgroundColor(Color.RED);
                break;
            case 9:
                if (answers[8] == 3) {
                    box3.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box3.setBackgroundColor(Color.RED);
                break;
            case 10:
                if (answers[9] == 3) {
                    box3.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box3.setBackgroundColor(Color.RED);
                break;

        }
        TextView textView = (TextView)findViewById(R.id.txt);
        textView.setText("score:"+score);

    }

    public void btn4(View view) {
        switch (n) {

            case 1:
                if (answers[0] == 4) {
                    box4.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box4.setBackgroundColor(Color.RED);
                break;
            case 2:
                if (answers[1] == 4) {
                    box4.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box4.setBackgroundColor(Color.RED);
                break;
            case 3:
                if (answers[2] == 4) {
                    box4.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box4.setBackgroundColor(Color.RED);
                break;
            case 4:
                if (answers[3] == 4) {
                    box4.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box4.setBackgroundColor(Color.RED);
                break;
            case 5:
                if (answers[4] == 4) {
                    box4.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box4.setBackgroundColor(Color.RED);
                break;
            case 6:
                if (answers[5] == 4) {
                    box4.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box4.setBackgroundColor(Color.RED);
                break;
            case 7:
                if (answers[6] == 4) {
                    box4.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box4.setBackgroundColor(Color.RED);
                break;
            case 8:
                if (answers[7] == 4) {
                    box4.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box4.setBackgroundColor(Color.RED);
                break;
            case 9:
                if (answers[8] == 4) {
                    box4.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box4.setBackgroundColor(Color.RED);
                break;
            case 10:
                if (answers[9] == 4) {
                    box4.setBackgroundColor(Color.GREEN);
                    score++;
                } else
                    box4.setBackgroundColor(Color.RED);
                break;

        }
        TextView textView = (TextView)findViewById(R.id.txt);
        textView.setText("score:"+score);

    }
}
