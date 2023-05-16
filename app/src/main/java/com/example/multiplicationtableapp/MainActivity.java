package com.example.multiplicationtableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
TextView textView;
EditText m1;
Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        m1 = (EditText)findViewById(R.id.m1);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = m1.getText().toString();
                int k = Integer.parseInt(number);

           String table ="";

                for (int i = 1;i<=10;i++){
                table  += k + "X" + i + "=" + k*i;
                table +="\n";
                textView.setText(table);
                }

            }
        });
    }
}