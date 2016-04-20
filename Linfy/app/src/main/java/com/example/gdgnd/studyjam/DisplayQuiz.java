package com.example.gdgnd.studyjam;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by shivam on 17/04/16.
 */
public class DisplayQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final GlobalClass globalValues = ((GlobalClass) getApplicationContext());
        final Boolean lastq;
        if (globalValues.getLastId() == globalValues.getTotal()){
            lastq = true;
        }
        else{
            lastq = false;
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final Questions dp = getIntent().getParcelableExtra("Obj");

        final RadioButton op1 = (RadioButton) findViewById(R.id.rb_op1);
        final RadioButton op2 = (RadioButton) findViewById(R.id.rb_op2);
        final RadioButton op3 = (RadioButton) findViewById(R.id.rb_op3);
        final RadioButton op4 = (RadioButton) findViewById(R.id.rb_op4);

        op1.setText(dp.getOption1());
        op2.setText(dp.getOption2());
        op3.setText(dp.getOption3());
        op4.setText(dp.getOption4());

        TextView qtv = (TextView) findViewById(R.id.question_tv);
        qtv.setText(dp.getQues());

        TextView topic = (TextView) findViewById(R.id.topic_top);
        final String qcat = dp.getCategory();
        final String qcat_msg;
        topic.setText(qcat);

        TextView topic_inst = (TextView) findViewById(R.id.topic_readmore);

        TextView qcount = (TextView) findViewById(R.id.qcount_tx);
        qcount.setText("Q."+globalValues.getQcount()+")");

        final TextView score = (TextView) findViewById(R.id.score_tx);
        score.setText("Score: "+ String.format("%02d", globalValues.getScore()));

        final int cati;

        switch(qcat){
            case "Composition":
                qcat_msg="Choose the correct sequence so as to produce the correct sentence.";
                cati=4;
                break;
            case "Grammar":
                qcat_msg="Spot the errors 'if any' in the given sentence.";
                cati=0;
                break;
            case "One Word Substitution":
                qcat_msg="Choose the word which can be substituted for the given sentence.";
                cati=5;
                break;
            case "Synonyms":
                qcat_msg="Choose the word nearest in meaning to the given word.";
                cati=1;
                break;
            case "Antonyms":
                qcat_msg="Choose the word opposite in meaning to the given word.";
                cati=2;
                break;
            case "Odd Word":
                qcat_msg="Choose the odd one out.";
                cati=3;
                break;
            default:
                qcat_msg="No instructions.";
                cati=9;
                break;
        }

        topic_inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DisplayQuiz.this);
                builder.setTitle(qcat);
                builder.setMessage(qcat_msg);
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
                builder.show();
            }
        });

        final RadioGroup choice = (RadioGroup) findViewById(R.id.rg_choice);

        final Button qSubmit = (Button) findViewById(R.id.qSubmitButton);
        final Button qNext = (Button) findViewById(R.id.qNextButton);
        final Button qFinish =(Button) findViewById(R.id.qFinishButton);
        qSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = choice.getCheckedRadioButtonId();
                if(selectedId == -1){
                    Toast.makeText(getApplicationContext(),"Please choose an option",Toast.LENGTH_SHORT).show();
                }
                else{
                RadioButton chosen = (RadioButton) findViewById(selectedId);
                if (chosen.getText().equals(dp.getAns())) {
                    chosen.setBackgroundColor(getResources().getColor(R.color.correct_ans));
                    chosen.setTextColor(getResources().getColor(R.color.icons));
                    globalValues.update(true,cati);
                    score.setText("Score: "+ String.format("%02d", globalValues.getScore()));
                }
                else{
                    int ans_rb_id=0;
                    if(op1.getText().equals(dp.getAns())){
                        ans_rb_id=op1.getId();
                    }
                    else if (op2.getText().equals(dp.getAns())){
                        ans_rb_id=op2.getId();
                    }
                    else if (op3.getText().equals(dp.getAns())){
                        ans_rb_id=op3.getId();
                    }
                    else if (op4.getText().equals(dp.getAns())){
                        ans_rb_id=op4.getId();
                    }
                    try{
                        RadioButton correct = (RadioButton) findViewById(ans_rb_id);
                        correct.setBackgroundColor(getResources().getColor(R.color.correct_ans));
                        correct.setTextColor(getResources().getColor(R.color.icons));
                    }
                    catch(Exception e){
                        System.out.println("Correct answer not found.");
                    }
                    chosen.setBackgroundColor(getResources().getColor(R.color.wrong_ans));
                    chosen.setTextColor(getResources().getColor(R.color.icons));
                    globalValues.update(false,cati);
                }
                qSubmit.setVisibility(View.GONE);
                qNext.setVisibility(View.VISIBLE);
                qFinish.setVisibility(View.VISIBLE);
                if (lastq){
                    qNext.setVisibility(View.GONE);
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT, (float) 1.0);
                    qFinish.setLayoutParams(params);
                }
                for (int i = 0; i < choice.getChildCount(); i++) {
                    choice.getChildAt(i).setEnabled(false);
                }
                ColorStateList colorStateList = new ColorStateList(
                        new int[][]{

                                new int[]{-android.R.attr.state_enabled}, //disabled
                                new int[]{android.R.attr.state_enabled} //enabled
                        },
                        new int[] {

                                R.color.icons //disabled
                                ,R.color.icons //enabled

                        }
                );
                chosen.setButtonTintList(colorStateList);
                chosen.setEnabled(true);
                }
            }
        });

        qNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
            }
        });

        qFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastq == true){
                    globalValues.updateCompleted();
                    finish();
                    Intent i = new Intent(getApplicationContext(),ResultActivity.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
                }
                else {
                    onBackPressed();
                }
            }
        });
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Are you sure?");
        builder.setMessage("Are you sure you want to exit the quiz? ");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
                Intent i = new Intent(getApplicationContext(),ResultActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

            }
        });
        builder.show();
    }
}
