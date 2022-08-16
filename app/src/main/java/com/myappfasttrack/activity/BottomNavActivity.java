package com.myappfasttrack.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.myappfasttrack.R;

public class BottomNavActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bottomNavigationView = findViewById(R.id.bottom_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id  = item.getItemId();
                if (id == R.id.item_add){
                    Toast.makeText(BottomNavActivity.this, "Add", Toast.LENGTH_SHORT).show();
                    toolbar.setTitle("Add");
                }
                else if (id == R.id.item_settings){
                    Toast.makeText(BottomNavActivity.this, "Add", Toast.LENGTH_SHORT).show();
                    toolbar.setTitle("Setting");
                }
                return true;
            }
        });
    }
}