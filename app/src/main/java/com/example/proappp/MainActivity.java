package com.example.proappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {

    public static final String MSG="com.example.proappp.ORDER";

    EditText ename;
    EditText eemail;
    Button econtinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ename=findViewById(R.id.etname);
       eemail=findViewById((R.id.eid));
        econtinue=findViewById(R.id.butcon);

        econtinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName=ename.getText().toString();
                String inputMail=eemail.getText().toString();

                if(inputName.isEmpty() || inputMail.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter the details correctly", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,OTPpage.class);
                     intent.putExtra(MSG,inputMail);
                     startActivity(intent);
                }
            }
        });
    }
}