package com.example.nimish.learnandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class step3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step3);
        String message="As with any software development task, knowing where to find the information that you need is the most important skill to develop. Learning how to find the right answers to your questions quickly will smooth out the learning curve no end. Here are some starters for some general questions you might want to ask as you progress:\n" +
                "\n" +
                "    How does this specific component work?Check out the official Android Developer documentation, and use the search box. Every component available out-of-the-box so to speak is described in the documents, and there are usually code examples.\n" +
                "    I’ve got an error, what does it mean?!  StackOverflow is such a useful resource for finding answers to this type of question that it’s become a running joke in the software industry. Copy-paste the error, and someone has probably already found the cause.Note: As you learn more, it’s better to try and make SO a last resort rather than a first one – you will learn more about what is going on in the software if you use your tools to try and trace the fault yourself.\n" +
                "    I like that expanding list thing, what is that? Where do I start, and what’s the best way to use that?Check out some video tutorials, from the actual Android team! If they don’t know the best way to achieve something in Android, who does?\n" +
                "    There seems to be more going on here than what I’m seeing…Like, what’s a Dalvik? Should I have one of those?The Android OS is a complex beast, and the layer that you normally work on is abstracted a long way away from the core bits and bytes. If you really want to go down the rabbit hole and learn about how the OS works, check out the source code itself; GrepCode allows you to browse the codebase online, by Android version, so you can see exactly why you can’t put that Double straight into a TextView.For a more historical view of the Android, be sure to read ArsTechnica’s comprehensive history of the platform.\n";


        TextView txtView = (TextView) findViewById(R.id.step3);
        txtView.setText(message);

    }

}
