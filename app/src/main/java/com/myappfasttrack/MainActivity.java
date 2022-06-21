package com.myappfasttrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtEmail;
    Button btnLogin, btnSend;
    ImageView imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEmail = findViewById(R.id.edt_email);
        btnLogin = findViewById(R.id.btn_login);
        imgLogo = findViewById(R.id.netflix_logo);
        btnSend = findViewById(R.id.btn_Send);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*
                /*Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(i);*/
                String smsNumber = "9978932539";
                Intent sendIntent = new Intent("android.intent.action.MAIN");
                sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
                sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators(smsNumber) + "@s.whatsapp.net");//phone number without "+" prefix
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Hello Android");
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setPackage("com.whatsapp");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

                /*
                * try {
                    Intent sendMsg = new Intent(Intent.ACTION_VIEW);
                    String url = "https://api.whatsapp.com/send?phone=" + "+919870003831" + "&text=" + URLEncoder.encode("Hello World!", "UTF-8");
                    sendMsg.setPackage("com.whatsapp");
                    sendMsg.setData(Uri.parse(url));
                    if (sendMsg.resolveActivity(getPackageManager()) != null) {
                        startActivity(sendMsg);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                * */



            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgLogo.setImageResource(R.drawable.btn_bg);
                String strEmail = edtEmail.getText().toString();
                if (strEmail.equals("")) {

                    Toast.makeText(MainActivity.this, "Please enter Email id", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Email id is " + strEmail, Toast.LENGTH_SHORT).show();
                }

                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                i.putExtra("KEY_EMAIL", strEmail);
                startActivity(i);

            }
        });
    }
}