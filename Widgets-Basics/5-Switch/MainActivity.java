package com.example.a5_switch;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch switchbutton;
    TextView textView;
    ConstraintLayout Layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchbutton = findViewById(R.id.switchbutton);
        textView = findViewById(R.id.textView);
        Layout=findViewById(R.id.Layout);

        Layout.setBackgroundColor(Color.parseColor("#00BCD4"));

        switchbutton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                    @Override
                                                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                        if (switchbutton.isChecked()){
                                                            Layout.setBackgroundColor(Color.parseColor("#AEEA00"));
                                                            textView.setText("ooh! or This color?");
                                                        }
                                                        else {
                                                            Layout.setBackgroundColor(Color.parseColor("#00BCD4"));
                                                            textView.setText("This Color?");
                                                        }

                                                    }
                                                }

        );
    }
}
