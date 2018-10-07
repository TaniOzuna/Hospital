package com.example.hospital.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner bloodTypeSpinner = (Spinner) findViewById(R.id.bloodType);

        ArrayAdapter<CharSequence> bloodTypeAdapter =
                ArrayAdapter.createFromResource(this, R.array.blood_type,
                android.R.layout.simple_spinner_item);

        //specify the layout to use when the list choices appears
        bloodTypeAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        //Apply the adapter to the spinner
        bloodTypeSpinner.setAdapter(bloodTypeAdapter);
        bloodTypeSpinner.setSelection(0);

    }
}
