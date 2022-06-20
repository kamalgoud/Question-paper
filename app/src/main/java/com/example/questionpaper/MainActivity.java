package com.example.questionpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton radioButton1;
    RadioButton radioButton2;
    CheckBox checkBox;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButton1=findViewById(R.id.rd1);
        radioButton2=findViewById(R.id.rd2);

        checkBox=findViewById(R.id.cb1);
        button=findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()){
                    if(radioButton1.isChecked() && radioButton2.isChecked()){
                        Toast.makeText(getApplicationContext(),"Both are correct",Toast.LENGTH_SHORT).show();
                    }
                    else if(!radioButton1.isChecked() && radioButton2.isChecked()){
                        Toast.makeText(getApplicationContext(),"1st is incorrect",Toast.LENGTH_SHORT).show();
                    }
                    else if(radioButton1.isChecked() && !radioButton2.isChecked()){
                        Toast.makeText(getApplicationContext(),"2nd is incorrect",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Both are incorrect",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"Please check all fields",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}