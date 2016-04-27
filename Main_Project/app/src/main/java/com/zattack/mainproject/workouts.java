package com.zattack.mainproject;
public class workouts {
    private String workoutName;
    private int iconId;

    public workouts(String workoutName,int iconId){
        super();
        this.workoutName=workoutName;
        this.iconId=iconId;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public int getIconId() {
        return iconId;
    }
}
