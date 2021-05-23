package com.example.proappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class OTPpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_ppage);
        Intent intent=getIntent();
       String message=intent.getStringExtra(MainActivity.MSG); //this thing tells us that whatever we are getting from intent just give us
    // the main activity thing msg
    //let's set the text inside the textview to message
     TextView textview=findViewById(R.id.etmail);
     textview.setText(message);
    }
    public void scan(View v)
    {
        Intent intent=new Intent(this,scan.class);
        startActivity(intent);
    }

}