package com.example.gdgnd.studyjam;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;

public class QuizActivity extends AppCompatActivity {

    final ArrayList<Questions> questionsList = new ArrayList<Questions>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final GlobalClass globalValues = ((GlobalClass) getApplicationContext());
        //System.out.println(state.gethh());
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_quiz);

        final ProgressDialog mAuthProgressDialog;
        mAuthProgressDialog = new ProgressDialog(this);
        mAuthProgressDialog.setTitle("Loading");
        mAuthProgressDialog.setMessage("Connecting to server..");
        mAuthProgressDialog.setCancelable(true);
        mAuthProgressDialog.show();

        mAuthProgressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                Toast.makeText(getApplicationContext(),"Connection Error",Toast.LENGTH_SHORT).show();
                finish();
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
            }
        });

        Bundle b=this.getIntent().getExtras();
        int[] array=b.getIntArray("subjects");
        int i;
        final ArrayList<String> selsubs = new ArrayList<String>();
        for (i=0;i<array.length;i++)
        {
            if (array[i]==1){
                switch(i){
                    case 0: selsubs.add("Grammar");break;
                    case 1: selsubs.add("Synonyms");break;
                    case 2: selsubs.add("Antonyms");break;
                    case 3: selsubs.add("Odd Word");break;
                    case 4: selsubs.add("Composition");break;
                    case 5: selsubs.add("One Word Substitution");break;
                }
            }
        }
        System.out.println(selsubs);
        if(!isNetworkConnected()){

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 5s = 5000ms
                    mAuthProgressDialog.dismiss();
                    Toast.makeText(getApplicationContext(),"No Internet Connection.",Toast.LENGTH_SHORT).show();
                    finish();
                }
            }, 2000);


        }
        else {
            Firebase ref = new Firebase("https://linfy-project.firebaseio.com/");
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 5s = 5000ms
                    mAuthProgressDialog.setMessage("Building your quiz..");
                }
            }, 1500);


         /* Sections
    1. Grammar [0]
    2. Synonyms [1]
    3. Antonyms [2]
    4. Odd Word [3]
    5. Composition [4]
    6. One Word Substitution [5]
     */

//        Firebase GrammarRef = ref.child("categories").child("0").child("questions");
//        GrammarRef.child("question");
//        catRef.child("1").setValue("Synonyms");
//        catRef.child("2").setValue("Antonyms");
//        catRef.child("3").setValue("Odd Word");
//        catRef.child("4").setValue("Composition");
//        catRef.child("5").setValue("One Word Substitution");

            //Value event listener for realtime data update
            ref.child("questions").addListenerForSingleValueEvent(new ValueEventListener() {

                @Override
                public void onDataChange(DataSnapshot snapshot) {


                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        //Getting the data from snapshot
                        Questions qt = postSnapshot.getValue(Questions.class);

                        if (useLoop(selsubs, qt.getCategory())) {
                            questionsList.add(qt);
                            System.out.println("Question: " + qt.getQues());
                            System.out.println("Options: " + qt.getOption1() + ", " + qt.getOption2() + ", " + qt.getOption3() + ", " + qt.getOption4());
                            System.out.println("Answer: " + qt.getAns());
                            System.out.println("Category: " + qt.getCategory());
                        }
                    }
                    mAuthProgressDialog.dismiss();
                    int last_index=questionsList.size() - 1;
                    System.out.println("Last Index: "+last_index);
                    globalValues.reset();
                    globalValues.updateLastId(last_index);
                    Collections.shuffle(questionsList);
                    for (Questions dp : questionsList) {
                        Intent t = new Intent(getApplicationContext(), DisplayQuiz.class);
                        t.putExtra("Obj", dp);
                        startActivity(t);
                        overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
                    }
                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {
                    System.out.println("The read failed: " + firebaseError.getMessage());
                }
            });
        }

    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Are you sure?");
        builder.setMessage("Are you sure you want to exit the quiz? ");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

            }
        });
        builder.show();
    }

    public static boolean useLoop(ArrayList<String> arr, String targetValue) {
        for (String s: arr){
            if(s.equals(targetValue)) {
                return true;
            }
        }
        return false;
    }

    public boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnectedOrConnecting();
    }
}
