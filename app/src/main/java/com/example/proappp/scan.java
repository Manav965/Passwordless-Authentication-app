package com.example.proappp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class scan extends AppCompatActivity {

    Button bacon;
    String[] permissions = {
            Manifest.permission.CAMERA
    };
    int PERM_CODE = 11;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        bacon =findViewById(R.id.button2);
        bacon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), scanner.class));

            }
        });


        }
    private boolean checkpermissions(){
        List<String> listofpermisssions = new ArrayList<>();
        for (String perm: permissions){
            if (ContextCompat.checkSelfPermission(getApplicationContext(), perm) != PackageManager.PERMISSION_GRANTED){
                listofpermisssions.add(perm);
            }
        }
        if (!listofpermisssions.isEmpty()){
            ActivityCompat.requestPermissions(this, listofpermisssions.toArray(new String[listofpermisssions.size()]), PERM_CODE);
            return false;
        }
        return true;
    }
    }
