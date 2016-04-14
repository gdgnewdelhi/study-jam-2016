
package com.example.tripti.bodyfact;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //delay fuction here
        new CountDownTimer(3000, 1000) {
            public void onFinish() {
                final ImageView Image1 = (ImageView) findViewById(R.id.beg);
                final TextView  introText = (TextView) findViewById(R.id.introtext);
                final TextView  introText2 = (TextView) findViewById(R.id.introtext2);
                final ImageView Image = (ImageView) findViewById(R.id.BodyMassIndex);
                final TextView Intro1 = (TextView) findViewById(R.id.intro1);
                final TextView Intro2 = (TextView) findViewById(R.id.intro2);
                final Button Gotit = (Button) findViewById(R.id.got_it_button);

                Image1.setVisibility(ImageView.GONE);
                introText.setVisibility(TextView.GONE);
                introText2.setVisibility(TextView.GONE);
                Intro1.setVisibility(TextView.VISIBLE);
                Image.setVisibility(ImageView.VISIBLE);
                Intro2.setVisibility(TextView.VISIBLE);
                Gotit.setVisibility(Button.VISIBLE);

            }

            public void onTick(long millisUntilFinished) {//the amount of time until finished}

            }
        }.start();


        final ImageView Image = (ImageView) findViewById(R.id.BodyMassIndex);
        final TextView Intro1 = (TextView) findViewById(R.id.intro1);
        final TextView Intro2 = (TextView) findViewById(R.id.intro2);
        final Button Gotit = (Button) findViewById(R.id.got_it_button);

        // now screen three elements should be visible

        final TextView cms = (TextView) findViewById(R.id.cms_view);
        final TextView Kgs = (TextView) findViewById(R.id.kgs);
        final RadioGroup radio = (RadioGroup) findViewById(R.id.radio);
        final EditText edit1 = (EditText) findViewById(R.id.editText1);
        final EditText edit2 = (EditText) findViewById(R.id.editText2);
        final Button submit = (Button) findViewById(R.id.submit_button);


        Gotit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intro1.setVisibility(TextView.GONE);
                Image.setVisibility(ImageView.GONE);
                Intro2.setVisibility(TextView.GONE);
                Gotit.setVisibility(Button.GONE);

                cms.setVisibility(TextView.VISIBLE);
                Kgs.setVisibility(TextView.VISIBLE);
                radio.setVisibility(RadioGroup.VISIBLE);
                edit1.setVisibility(EditText.VISIBLE);
                edit2.setVisibility(EditText.VISIBLE);
                submit.setVisibility(Button.VISIBLE);

            }
        });



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(edit1.getText())) {
                    edit1.setError("compulsory");
                }
                else if (TextUtils.isEmpty(edit2.getText())) {
                    edit2.setError("compulsory");
                }
                else {
                    float H = Float.valueOf(edit1.getText().toString());
                    float W = Float.valueOf(edit2.getText().toString());

                    float b = ((W * 10000) / H) / H;
                    String bmi = "Hello!!\n"; //to print bmi and suggestions


                    cms.setVisibility(TextView.GONE);
                    Kgs.setVisibility(TextView.GONE);
                    radio.setVisibility(RadioGroup.GONE);
                    edit1.setVisibility(EditText.GONE);
                    edit2.setVisibility(EditText.GONE);
                    submit.setVisibility(Button.GONE);

                    TextView bmiview = (TextView) findViewById(R.id.bmi_text);
                    ImageView bm1 = (ImageView) findViewById(R.id.bm1);
                    ImageView bm2 = (ImageView) findViewById(R.id.bm2);
                    ImageView bm3 = (ImageView) findViewById(R.id.bm3);
                    ImageView bm4 = (ImageView) findViewById(R.id.bm4);
                    Button reset = (Button) findViewById(R.id.reset_button);
                    ScrollView sc = (ScrollView) findViewById(R.id.scrollView4);
                    sc.setVisibility(ScrollView.VISIBLE);

                    reset.setVisibility(Button.VISIBLE);
                    if (b >= 0.0 && b < 18.5) {
                        bm1.setVisibility(ImageView.VISIBLE);
                        bmi = bmi + " Your B.M.I is  " + b + "  Kg per meter^2\n" + "That suggests you are UNDERWEIGHT ";
                        bmiview.setText(bmi);
                    }
                    if (b >= 18.5 && b < 24.9) {
                        bm2.setVisibility(ImageView.VISIBLE);
                        bmi = bmi + " Your B.M.I is  " + b + "  Kg per meter^2\n" + "That suggests you are HEALTHY ";
                        bmiview.setText(bmi);
                    }
                    if (b >= 24.9 && b < 29.9) {
                        bm3.setVisibility(ImageView.VISIBLE);
                        bmi = bmi + " Your B.M.I is  " + b + "  Kg per meter^2\n" + "That suggests you are OVERWEIGHT ";
                        bmiview.setText(bmi);
                    }
                    if (b >= 29.9) {
                        bm4.setVisibility(ImageView.VISIBLE);
                        bmi = bmi + " Your B.M.I is  " + b + "  Kg per meter^2\n" + "That suggests you are OBESE ";
                        bmiview.setText(bmi);
                    }
                    bmiview.setVisibility(TextView.VISIBLE);
                }
            }


        });

        //screen three element

        final TextView bmiview = (TextView) findViewById(R.id.bmi_text);

        //screen 4 elements
        final ImageView bm1 = (ImageView) findViewById(R.id.bm1);
        final ImageView bm2 = (ImageView) findViewById(R.id.bm2);
        final ImageView bm3 = (ImageView) findViewById(R.id.bm3);
        final ImageView bm4 = (ImageView) findViewById(R.id.bm4);

        final Button reset = (Button) findViewById(R.id.reset_button);
        final ScrollView sc = (ScrollView)findViewById(R.id.scrollView4);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                bm1.setVisibility(ImageView.GONE);
                bm2.setVisibility(ImageView.GONE);
                bm3.setVisibility(ImageView.GONE);
                bm4.setVisibility(ImageView.GONE);
                bmiview.setVisibility(TextView.GONE);
                reset.setVisibility(Button.GONE);
                sc.setVisibility(ScrollView.GONE);
                cms.setVisibility(TextView.VISIBLE);
                Kgs.setVisibility(TextView.VISIBLE);
                radio.setVisibility(RadioGroup.VISIBLE);
                edit1.setVisibility(EditText.VISIBLE);
                edit2.setVisibility(EditText.VISIBLE);
                submit.setVisibility(Button.VISIBLE);
                edit1.setHint("Height");
                edit2.setHint("Weight");

            }
        });
   //paste it here


    }
}