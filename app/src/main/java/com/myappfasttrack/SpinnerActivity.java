package com.myappfasttrack;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {
Spinner spinner;
String strLang[] = {"Select Data","Android","Java",".net","PHP","C","C++","IOS","Python"}; // data


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new
                ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,strLang){
                    @Override
                    public View getDropDownView(int position, @Nullable View convertView,
                                                @NonNull ViewGroup parent) {

                        TextView tvdata = (TextView)  super.getDropDownView(position, convertView, parent);

                        if (position == 0){
                            tvdata.setTextColor(Color.GRAY);
                        }else {
                            tvdata.setTextColor(Color.MAGENTA);

                        }

                        return tvdata;
                    }
                };
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String data  = strLang[i];
                String data1  = adapterView.getItemAtPosition(i).toString();
                String data2  = adapterView.getSelectedItem().toString();
              //  if (data.equals("Select Data"))
                if (i != 0){
                  Toast.makeText(SpinnerActivity.this,
                             "Selected Item is "+data, Toast.LENGTH_SHORT).show();
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}