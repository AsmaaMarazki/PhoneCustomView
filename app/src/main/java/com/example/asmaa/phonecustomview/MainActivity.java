package com.example.asmaa.phonecustomview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    PhoneField phoneField;
    Button btn_say;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneField=findViewById(R.id.phoneField);
        btn_say=findViewById(R.id.btn);
        btn_say.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, phoneField.getPhoneNumber(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
