package com.example.gdgnd.studyjam;

import android.app.Application;

import com.firebase.client.Firebase;

import java.util.Arrays;

/**
 * Created by shivam on 19/04/16.
 */
public class GlobalClass extends Application {
    int total_attempted = 0;
    int correct = 0;
    int lastid =0;
    int[] cat_total = new int[10];
    int[] cat_corr = new int[10];
    Boolean completed = false;

    public void update(Boolean right,int index){
        total_attempted++;
        cat_total[index]++;
        if(right){
            correct++;
            cat_corr[index]++;
        }
    }

    public void reset(){
        total_attempted = 0;
        correct = 0;
        lastid =0;
        Arrays.fill(cat_corr, 0);
        Arrays.fill(cat_total, 0);
        completed = false;
    }

    public int getTotal(){
        return total_attempted;
    }

    public int getCorrect(){
        return correct;
    }

    public int getScore(){
        return correct*5;
    }

    public int getQcount() {
        return total_attempted+1;
    }

    public void updateLastId(int id){
        lastid = id;
    }

    public int getLastId() {
        return lastid;
    }

    public int getCatTotal(int index){
        return cat_total[index];
    }

    public int getCatCorr(int index){
        return cat_corr[index];
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void updateCompleted(){
        completed=true;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }

}