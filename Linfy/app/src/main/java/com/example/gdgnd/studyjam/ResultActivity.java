package com.example.gdgnd.studyjam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by shivam on 20/04/16.
 */
public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        final GlobalClass globalValues = ((GlobalClass) getApplicationContext());
        String vSubject;
        int cat_corr=0,cat_total=0;

        RelativeLayout grammar = (RelativeLayout) findViewById(R.id.grammar_result);
        RelativeLayout synonyms = (RelativeLayout) findViewById(R.id.synonyms_result);
        RelativeLayout antonyms = (RelativeLayout) findViewById(R.id.antonyms_result);
        RelativeLayout oddword = (RelativeLayout) findViewById(R.id.oddword_result);
        RelativeLayout composition = (RelativeLayout) findViewById(R.id.composition_result);
        RelativeLayout oneword = (RelativeLayout) findViewById(R.id.oneword_result);

        TextView grammar_tx = (TextView) findViewById(R.id.grammar_tx);
        TextView synonyms_tx = (TextView) findViewById(R.id.synonyms_tx);
        TextView antonyms_tx = (TextView) findViewById(R.id.antonyms_tx);
        TextView oddword_tx = (TextView) findViewById(R.id.oddword_tx);
        TextView composition_tx = (TextView) findViewById(R.id.composition_tx);
        TextView oneword_tx = (TextView) findViewById(R.id.oneword_tx);


        TextView grammar_sc = (TextView) findViewById(R.id.grammar_score);
        TextView synonyms_sc = (TextView) findViewById(R.id.synonyms_score);
        TextView antonyms_sc = (TextView) findViewById(R.id.antonyms_score);
        TextView oddword_sc = (TextView) findViewById(R.id.oddword_score);
        TextView composition_sc = (TextView) findViewById(R.id.composition_score);
        TextView oneword_sc = (TextView) findViewById(R.id.oneword_score);

        ProgressBar grammar_prog = (ProgressBar) findViewById(R.id.grammar_progress);
        ProgressBar synonyms_prog = (ProgressBar) findViewById(R.id.synonyms_progress);
        ProgressBar antonyms_prog = (ProgressBar) findViewById(R.id.antonyms_progress);
        ProgressBar oddword_prog = (ProgressBar) findViewById(R.id.oddword_progress);
        ProgressBar composition_prog = (ProgressBar) findViewById(R.id.composition_progress);
        ProgressBar oneword_prog = (ProgressBar) findViewById(R.id.oneword_progress);

        TextView final_sc = (TextView) findViewById(R.id.score_final);
        final_sc.setText(String.valueOf(globalValues.getScore()));

        for (int i=0;i<10;i++){
            if(globalValues.getCatTotal(i)>0){
                switch(i){
                    case 0:
                        vSubject="Grammar";
                        cat_corr=globalValues.getCatCorr(i);
                        cat_total=globalValues.getCatTotal(i);
                        grammar.setVisibility(View.VISIBLE);
                        grammar_tx.setText(vSubject);
                        grammar_sc.setText(cat_corr+"/"+cat_total);
                        grammar_prog.setMax(cat_total);
                        grammar_prog.setProgress(cat_corr);
                        break;
                    case 1:
                        vSubject="Synonyms";
                        cat_corr=globalValues.getCatCorr(i);
                        cat_total=globalValues.getCatTotal(i);
                        synonyms.setVisibility(View.VISIBLE);
                        synonyms_tx.setText(vSubject);
                        synonyms_sc.setText(cat_corr+"/"+cat_total);
                        synonyms_prog.setMax(cat_total);
                        synonyms_prog.setProgress(cat_corr);
                        break;
                    case 2:
                        vSubject="Antonyms";
                        cat_corr=globalValues.getCatCorr(i);
                        cat_total=globalValues.getCatTotal(i);
                        antonyms.setVisibility(View.VISIBLE);
                        antonyms_tx.setText(vSubject);
                        antonyms_sc.setText(cat_corr+"/"+cat_total);
                        antonyms_prog.setMax(cat_total);
                        antonyms_prog.setProgress(cat_corr);
                        break;
                    case 3: vSubject="Odd Word";
                        cat_corr=globalValues.getCatCorr(i);
                        cat_total=globalValues.getCatTotal(i);
                        oddword.setVisibility(View.VISIBLE);
                        oddword_tx.setText(vSubject);
                        oddword_sc.setText(cat_corr+"/"+cat_total);
                        oddword_prog.setMax(cat_total);
                        oddword_prog.setProgress(cat_corr);
                        break;
                    case 4: vSubject="Composition";
                        cat_corr=globalValues.getCatCorr(i);
                        cat_total=globalValues.getCatTotal(i);
                        composition.setVisibility(View.VISIBLE);
                        composition_tx.setText(vSubject);
                        composition_sc.setText(cat_corr+"/"+cat_total);
                        composition_prog.setMax(cat_total);
                        composition_prog.setProgress(cat_corr);
                        break;
                    case 5: vSubject="One Word Substitution";
                        cat_corr=globalValues.getCatCorr(i);
                        cat_total=globalValues.getCatTotal(i);
                        oneword.setVisibility(View.VISIBLE);
                        oneword_tx.setText(vSubject);
                        oneword_sc.setText(cat_corr+"/"+cat_total);
                        oneword_prog.setMax(cat_total);
                        oneword_prog.setProgress(cat_corr);
                        break;
                }

            }
        }

    }


    @Override
    public void onBackPressed() {
        finish();
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
    }

}


