package com.example.franciscoandrade.autocompleteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textTV;
    AutoCompleteTextView autoEV;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textTV= findViewById(R.id.textTV);
        autoEV= findViewById(R.id.autoEV);
        button= findViewById(R.id.button);


        String[] names= {"Fran","Francisco", "And", "Andrade", "Andres", "Frank", "Jhonn", "Jhonnatan" };

        //create adapter passing the list of names
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, names);
        //Set after how many characters user has input show the autocomplet
        autoEV.setThreshold(3);
        //set adapter with autocomplete
        autoEV.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()){
                    case R.id.button:
                            String change= autoEV.getText().toString();
                            textTV.setText(change);
                        break;
                }

            }
        });

    }
}
