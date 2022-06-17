package com.myappfasttrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtEmail;
    Button btnLogin;
    ImageView imgLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEmail = findViewById(R.id.edt_email);
        btnLogin = findViewById(R.id.btn_login);
        imgLogo = findViewById(R.id.netflix_logo);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgLogo.setImageResource(R.drawable.btn_bg);
                String strEmail = edtEmail.getText().toString();
                if (strEmail.equals("")){
                    Toast.makeText(MainActivity.this, "Please enter Email id", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Email id is "+strEmail, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}