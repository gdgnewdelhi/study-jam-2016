package org.bitbucket.alphasniper.workoutkeeper;

/**
 * Created by AlphaSniper on 10-04-2016.
 */
public class LogDataClass {
    String workoutLogNotes ;
    int workoutlogCount ;

    public String getWorkoutLogNotes() {
        return workoutLogNotes;
    }

    public void setWorkoutLogNotes(String workoutLogNotes) {
        this.workoutLogNotes = workoutLogNotes;
    }

    public int getWorkoutlogCount() {
        return workoutlogCount;
    }

    public void setWorkoutlogCount(int workoutlogCount) {
        this.workoutlogCount = workoutlogCount;
    }

    public LogDataClass(String workoutLogNotes, int workoutlogCount) {

        this.workoutLogNotes = workoutLogNotes;
        this.workoutlogCount = workoutlogCount;
    }
}
