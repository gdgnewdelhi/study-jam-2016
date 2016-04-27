package com.example.android.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class game extends AppCompatActivity {
    int[] array;
    int b = 0;
    boolean user = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


    }

    public void click(View view) {

        if (b == 0) {
            array = new int[9];
            for (int i = 0; i < 9; i++)
                array[i] = i+3;
            b = 1;

        }
        switch (view.getId()) {
            case R.id.Button1: {
                if (array[0] == 3) {
                    if (!user) {
                        TextView textView = (TextView) findViewById(R.id.Button1);
                        textView.setText("O");
                        user = true;
                        array[0] = 1;
                    } else {
                        TextView textView = (TextView) findViewById(R.id.Button1);
                        textView.setText("X");
                        user = false;
                        array[0] = 2;

                    }
                    break;
                } else
                    break;
            }


            case R.id.Button2: {
                if (array[1] == 4) {
                    if (!user) {
                        TextView textView = (TextView) findViewById(R.id.Button2);
                        textView.setText("O");
                        user = true;
                        array[1] = 1;
                    } else {
                        TextView textView = (TextView) findViewById(R.id.Button2);
                        textView.setText("X");
                        user = false;
                        array[1] = 2;

                    }
                    break;
                } else
                    break;
            }

            case R.id.Button3: {
                if (array[2] == 5) {
                    if (!user) {
                        TextView textView = (TextView) findViewById(R.id.Button3);
                        textView.setText("O");
                        user = true;
                        array[2] = 1;
                    } else {
                        TextView textView = (TextView) findViewById(R.id.Button3);
                        textView.setText("X");
                        user = false;
                        array[2] = 2;

                    }
                    break;
                } else
                    break;
            }

            case R.id.Button4: {
                if (array[3] == 6) {
                    if (!user) {
                        TextView textView = (TextView) findViewById(R.id.Button4);
                        textView.setText("O");
                        user = true;
                        array[3] = 1;
                    } else {
                        TextView textView = (TextView) findViewById(R.id.Button4);
                        textView.setText("X");
                        user = false;
                        array[3] = 2;

                    }
                    break;
                } else
                    break;
            }

            case R.id.Button5: {
                if (array[4] == 7) {
                    if (!user) {
                        TextView textView = (TextView) findViewById(R.id.Button5);
                        textView.setText("O");
                        user = true;
                        array[4] = 1;
                    } else {
                        TextView textView = (TextView) findViewById(R.id.Button5);
                        textView.setText("X");
                        user = false;
                        array[4] = 2;

                    }
                    break;
                } else
                    break;
            }

            case R.id.Button6: {
                if (array[5] == 8) {
                    if (!user) {
                        TextView textView = (TextView) findViewById(R.id.Button6);
                        textView.setText("O");
                        user = true;
                        array[5] = 1;
                    } else {
                        TextView textView = (TextView) findViewById(R.id.Button6);
                        textView.setText("X");
                        user = false;
                        array[5] = 2;

                    }
                    break;
                } else
                    break;
            }

            case R.id.Button7: {
                if (array[6] == 9) {
                    if (!user) {
                        TextView textView = (TextView) findViewById(R.id.Button7);
                        textView.setText("O");
                        user = true;
                        array[6] = 1;
                    } else {
                        TextView textView = (TextView) findViewById(R.id.Button7);
                        textView.setText("X");
                        user = false;
                        array[6] = 2;

                    }
                    break;
                } else
                    break;
            }

            case R.id.Button8: {
                if (array[7] == 10) {
                    if (!user) {
                        TextView textView = (TextView) findViewById(R.id.Button8);
                        textView.setText("O");
                        user = true;
                        array[7] = 1;
                    } else {
                        TextView textView = (TextView) findViewById(R.id.Button8);
                        textView.setText("X");
                        user = false;
                        array[7] = 2;

                    }
                    break;
                } else
                    break;
            }

            case R.id.Button9: {
                if (array[8] == 11) {
                    if (!user) {
                        TextView textView = (TextView) findViewById(R.id.Button9);
                        textView.setText("O");
                        user = true;
                        array[8] = 1;
                    } else {
                        TextView textView = (TextView) findViewById(R.id.Button9);
                        textView.setText("X");
                        user = false;
                        array[8] = 2;

                    }
                    break;
                } else
                    break;
            }


        }
        int x;

        if ((array[0] == array[1]) && (array[1] == array[2])) {
            if (array[0] == 1)
                x = 0;
            else
                x = 1;
                win(x);

        }
        else if ((array[3] == array[4]) && (array[4] == array[5])) {
            if (array[3] == 1)
                x = 0;
            else
                x = 1;
                win(x);

        }
        else if ((array[6] == array[7]) && (array[7] == array[8])) {
            if (array[6] == 1)
                x = 0;
            else
                x = 1;
                win(x);

        }
        else if ((array[0] == array[3]) && (array[3] == array[6])) {
            if (array[0] == 1)
                x = 0;
            else
                x = 1;
                win(x);

        }
        else if ((array[1] == array[4]) && (array[4] == array[7])) {
            if (array[1] == 1)
                x = 0;
            else
                x = 1;
                win(x);

        }
        else if ((array[2] == array[5]) && (array[5] == array[8])) {
            if (array[2] == 1)
                x = 0;
            else
                x = 1;
                win(x);

        }
        else if ((array[0] == array[4]) && (array[4] == array[8])) {
            if (array[0] == 1)
                x = 0;
            else
                x = 1;
                win(x);

        }
        else if ((array[2] == array[4]) && (array[4] == array[6])) {
            if (array[2] == 1)
                x = 0;
            else
                x = 1;
                win(x);

        } else {
            x = 2;
        }
    }

    public void win(int x) {
        TextView Obj = (TextView) findViewById(R.id.result);
        if (x==0)
            Obj.setText("Player 1 won!");
        else if(x==1)
            Obj.setText("Player 2 won!");
        else
            Obj.setText("tie");
    }


}
