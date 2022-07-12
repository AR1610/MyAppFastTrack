package com.myappfasttrack;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class DateTimeActivity extends AppCompatActivity {
TextView tvDate,tvTime;
Button btnDate,btnTime;
int year,month,day;
    private int hours;
    private int minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);
        tvDate = findViewById(R.id.tv_date);
        btnDate = findViewById(R.id.btn_Date);
        tvTime = findViewById(R.id.tv_time);
        btnTime = findViewById(R.id.btn_time);



        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        // Calendar.HOUR for 12 Hours
        hours = calendar.get(Calendar.HOUR_OF_DAY);// Calendar.HOUR_OF_DAY for 24 hours
        minute = calendar.get(Calendar.MINUTE);

        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(DateTimeActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hour, int minute) {

                        tvTime.setText(hour+":"+minute);

                    }
                },hours,minute,false); // true for Dialog's 24 hours &  false for Dialog's 12 hours
                timePickerDialog.show();

            }
        });


        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatePickerDialog datePickerDialog = new DatePickerDialog(DateTimeActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfmonth) {

                        tvDate.setText(dayOfmonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);

                datePickerDialog.show();

            }
        });

    }
}