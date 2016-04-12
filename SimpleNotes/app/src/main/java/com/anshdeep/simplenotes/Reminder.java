package com.anshdeep.simplenotes;

import com.orm.SugarRecord;

/**
 * Created by ANSHDEEP on 05-04-2016.
 */
public class Reminder extends SugarRecord {
    String title,body;

    public Reminder(){

    }

    public Reminder(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
