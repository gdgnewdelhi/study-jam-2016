package org.bitbucket.alphasniper.workoutkeeper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AlphaSniper on 11-04-2016.
 */
public class CustomArrayAdapter extends ArrayAdapter {
    // CustomArrayAdapter inherits all methods from ArrayAdapter

    Context context;
    ArrayList<LogDataClass> data ;
    public CustomArrayAdapter(Context context, int resource, ArrayList<LogDataClass> listName) {
        super(context, resource, listName);
        this.context = context;
        this.data = listName;

    }
    // getView() method is overriden to generate views and add list items.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView= LayoutInflater.from(context).inflate(R.layout.listview_item_layout,parent,false);
        }
        // Extracts the position information of the array items .
        LogDataClass log = data.get(position);

        // Modifying the list items as per the required output.
        TextView notesTextView = (TextView) convertView.findViewById(R.id.item_notes);
        notesTextView.setText(log.getWorkoutLogNotes());
        TextView workoutCountTextView = (TextView)convertView.findViewById(R.id.item_log_count);
        workoutCountTextView.setText(String.valueOf(log.getWorkoutlogCount()));
        return convertView;
    }
}
