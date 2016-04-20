package com.example.gdgnd.studyjam;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class PreQuizActivity extends AppCompatActivity {

    int[] subs = new int[10];
    int flag=0;

    /* Sections
    1. Grammar [0]
    2. Synonyms [1]
    3. Antonyms [2]
    4. Odd Word [3]
    5. Composition [4]
    6. One Word Substitution [5]
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prequiz);
        Button qStart = (Button) findViewById(R.id.qstartButton);
        qStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int j;
                for (j=0;j<subs.length;j++){
                    if (subs[j]==1){
                        flag=1;
                        break;
                    }
                }
                if (flag==1) {
                    Bundle b = new Bundle();
                    b.putIntArray("subjects",subs);
                    finish();
                    Intent i = new Intent(getApplicationContext(),QuizActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                    overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Please choose a topic",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void onSubSelect(View view){
        Context context = getApplicationContext();
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.cb_grammar:
                if(checked){
                    subs[0]=1;
                }
                else{
                    subs[0]=0;
                }
                break;
            case R.id.cb_synonym:
                if(checked){
                    subs[1]=1;
                }
                else{
                    subs[1]=0;
                }
                break;
            case R.id.cb_antonym:
                if(checked){
                    subs[2]=1;
                }
                else{
                    subs[2]=0;
                }
                break;
            case R.id.cb_oddword:
                if(checked){
                    subs[3]=1;
                }
                else{
                    subs[3]=0;
                }
                break;
            case R.id.cb_composition:
                if(checked){
                    subs[4]=1;
                }
                else{
                    subs[4]=0;
                }
                break;
            case R.id.cb_oneword:
                if(checked){
                    subs[5]=1;
                }
                else{
                    subs[5]=0;
                }
                break;

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
    }

}
