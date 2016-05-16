package com.example.prakash.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends Activity implements OnItemSelectedListener {

    EditText inputName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputName = (EditText) findViewById(R.id.name);
        Button submit = (Button) findViewById(R.id.submit);


        // Spinner element
       final Spinner spinnerA = (Spinner) findViewById(R.id.spinner1);
        spinnerA.setOnItemSelectedListener(this);

       final Spinner spinnerB = (Spinner) findViewById(R.id.spinner2);
        spinnerB.setOnItemSelectedListener(this);

       final Spinner spinnerC = (Spinner) findViewById(R.id.spinner3);
        spinnerC.setOnItemSelectedListener(this);
        // Creating adapter for spinner
        ArrayAdapter<CharSequence> dataAdapterA =ArrayAdapter.createFromResource(this, R.array.Start_Stations, android.R.layout.simple_spinner_item);
        dataAdapterA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> dataAdapterB =ArrayAdapter.createFromResource(this, R.array.End_Stations, android.R.layout.simple_spinner_item);
        dataAdapterB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> dataAdapterC =ArrayAdapter.createFromResource(this, R.array.Capacity, android.R.layout.simple_spinner_item);
        dataAdapterC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        spinnerA.setAdapter(dataAdapterA);
        spinnerB.setAdapter(dataAdapterB);
        spinnerC.setAdapter(dataAdapterC);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondScreen.class);
                intent.putExtra("name", inputName.getText());
                intent.putExtra("data1", String.valueOf(spinnerA.getSelectedItem()));
                intent.putExtra("data2", String.valueOf(spinnerB.getSelectedItem()));
                intent.putExtra("data3", String.valueOf(spinnerC.getSelectedItem()));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
