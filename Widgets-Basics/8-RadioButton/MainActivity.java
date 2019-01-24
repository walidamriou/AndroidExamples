package com.example.a8_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton radioButton,radioButton2,radioButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton=findViewById(R.id.radioButton);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3=findViewById(R.id.radioButton3);

        RadioGroup Groupbuttons = findViewById(R.id.Groupbuttons);

        Groupbuttons.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton:
                        Toast.makeText(getApplicationContext(),"I'm "+radioButton.getText().toString(),Toast.LENGTH_SHORT).show();
                    case R.id.radioButton2:
                        Toast.makeText(getApplicationContext(),"I'm "+radioButton2.getText().toString(),Toast.LENGTH_SHORT).show();
                    case R.id.radioButton3:
                        Toast.makeText(getApplicationContext(),"I'm "+radioButton3.getText().toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
