package com.myappfasttrack;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AlertDialogActivity extends AppCompatActivity {

    Button btnAlertDialog,btnCustomDialog,btnCustmToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        btnAlertDialog = findViewById(R.id.btn_Dialog);
        btnCustmToast = findViewById(R.id.btn_Custm_toast);

        btnCustomDialog = findViewById(R.id.btn_Custm_Dialog);
        btnCustmToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater layoutInflater  = getLayoutInflater();
                View cutmView = layoutInflater.inflate(R.layout.raw_toast,null);

                Toast toast = new Toast(AlertDialogActivity.this);
                toast.setView(cutmView);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(0,0,0);
                toast.show();

            }
        });
        btnCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater layoutInflater = getLayoutInflater();
                View myView = layoutInflater.inflate(R.layout.raw_dialog,null);
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogActivity.this);
                EditText edtName = myView.findViewById(R.id.edt_name);
                Button btnSubmit = myView.findViewById(R.id.btn_submit);
                btnSubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String strName = edtName.getText().toString();
                        if (!strName.equals(""))
                        {

                            View cutmView = layoutInflater.inflate(R.layout.raw_toast,null);
                            TextView tvData = cutmView.findViewById(R.id.tv_data);
                            tvData.setText(strName);
                            Toast toast = new Toast(AlertDialogActivity.this);
                            toast.setView(cutmView);
                            toast.setDuration(Toast.LENGTH_SHORT);
                            toast.setGravity(0,0,0);
                            toast.show();
                        }
                    }
                });

                builder.setView(myView);
                builder.show();

            }
        });

        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogActivity.this);
                builder.setIcon(R.drawable.logo);
                builder.setTitle("Delete");
                builder.setMessage("Are you sure, you want to delete?");
                builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(AlertDialogActivity.this, "Yes is Clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertDialogActivity.this, "No is Clicked", Toast.LENGTH_SHORT).show();

                    }
                });
                builder.setNeutralButton("Finish", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                builder.show();

            }
        });
    }
}