package com.myappfasttrack.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.myappfasttrack.R;

public class MenuActivity extends AppCompatActivity {
    TextView tvClickme;
    Button btnPopUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        tvClickme = findViewById(R.id.tv_clickme);
        registerForContextMenu(tvClickme);
        btnPopUp = findViewById(R.id.btn_popUp);
        btnPopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenuInflater menuInflater = getMenuInflater();
                PopupMenu popupMenu = new PopupMenu(MenuActivity.this,btnPopUp);
                menuInflater.inflate(R.menu.item_menu,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        Toast.makeText(MenuActivity.this, "Item is "+menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popupMenu.show();

            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.item_menu,menu);

    }
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.item_add){
            Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId() == R.id.item_delete){
            Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();

        }else if (item.getItemId() == R.id.item_update){
            Toast.makeText(this, "Update", Toast.LENGTH_SHORT).show();

        }

        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.item_menu,menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.item_add){
            Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId() == R.id.item_delete){
            Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();

        }else if (item.getItemId() == R.id.item_update){
            Toast.makeText(this, "Update", Toast.LENGTH_SHORT).show();

        }

        return super.onOptionsItemSelected(item);
    }
}