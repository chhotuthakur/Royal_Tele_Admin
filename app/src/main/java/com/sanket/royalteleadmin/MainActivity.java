package com.sanket.royalteleadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button submit;
    Spinner services;
    EditText ed1,ed2;
    String [] service ={"BSNL FIBER","RAIL WIRE"};
    ImageView timePicker;
    Calendar calendar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       calendar =Calendar.getInstance();
       int hour=calendar.get(Calendar.HOUR_OF_DAY);
       int min =calendar.get(Calendar.MINUTE);

        submit=(Button) findViewById(R.id.button_submit);
        ed1=(EditText) findViewById(R.id.timepicker_ed);
        ed2=(EditText) findViewById(R.id.desc_edt);
        services =(Spinner) findViewById(R.id.spin_serve);


        services.setOnItemSelectedListener(this);
        ArrayAdapter ser = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item,service);
        services.setAdapter(ser);
        timePicker= (ImageView) findViewById(R.id.timepick);
        timePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
      String title =services.getSelectedItem().toString();



    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}