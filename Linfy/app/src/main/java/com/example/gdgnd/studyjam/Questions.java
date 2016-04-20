package com.example.gdgnd.studyjam;

import android.os.Parcel;
import android.os.Parcelable;

public class Questions implements Parcelable {

    int qid;
    String ques;
    String option1;
    String option2;
    String option3;
    String option4;
    String ans;
    String category;

    public Questions(){
        // empty default constructor, necessary for Firebase to be able to deserialize blog posts
    }

    private Questions(Parcel in) {
        this.qid=in.readInt();
        this.ques =in.readString();
        this.option1=in.readString();
        this.option2=in.readString();
        this.option3=in.readString();
        this.option4=in.readString();
        this.ans=in.readString();
        this.category=in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(qid);
        out.writeString(ques);
        out.writeString(option1);
        out.writeString(option2);
        out.writeString(option3);
        out.writeString(option4);
        out.writeString(ans);
        out.writeString(category);
    }

    public int getQid() {
        return qid;
    }
    public String getQues() {
        return ques;
    }
    public String getAns() {
        return ans;
    }
    public String getOption1() {
        return option1;
    }
    public String getOption2() {
        return option2;
    }
    public String getOption3() {
        return option3;
    }
    public String getOption4() {
        return option4;
    }
    public String getCategory() {
        return category;
    }

    public static final Parcelable.Creator<Questions> CREATOR = new Parcelable.Creator<Questions>() {
        public Questions createFromParcel(Parcel in) {
            return new Questions(in);
        }

        public Questions[] newArray(int size) {
            return new Questions[size];
        }
    };
}
