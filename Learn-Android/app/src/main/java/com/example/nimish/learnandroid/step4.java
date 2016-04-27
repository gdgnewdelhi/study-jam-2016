package com.example.nimish.learnandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class step4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step4);
String message="Sign up to a developer forum or interest group on social media. It’s a great way to keep up to date with the latest developments within Android, and there is usually a “beginners” subgroup that you can join to get in contact with fellow Android newbies to share tips, frustrations and links. The Android Developers Google+ community is always busy, and other forums such as CodeProject, DevShed and CodeCall have sections for Android-specific discussions. Also sign up to the Android Developers channel on YouTube, it has some great video tutorials that explain the concepts – it’s a great resource for when you’re just getting started. You could even join the Android Developer Office Hours hangouts to ask the team directly!\n" +
        "\n" +
        "Learn to search is deliberately above this point in this article, as asking a question that has been asked hundreds of times before on the same forum, and for which the answer is easy to find is the #1 best way to get a bad reputation with your first post…\n" +
        "\n" +
        "Someone out there has probably already asked the question that is causing you difficulty. Likewise if you encounter a problem that you don’t think anyone else has yet, ask the question – the answers that you get will help the next person in your shoes that is trying to figure out that same problem.\n" +
        "\n" +
        "If your goal is to become a professional developer, you will have to work in a team at some point, even if that is just with a graphic designer or marketing team, so getting used to working on a shared codebase is a useful skill, and working with developers who are already experienced is a great way to learn. Get involved in a community open-source project; check out GitHub and find an open source project that interests you.";
        TextView txtView = (TextView) findViewById(R.id.step4);
        txtView.setText(message);
    }
}
