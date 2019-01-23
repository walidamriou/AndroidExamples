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

        Layout.setBackgroundColor(Color.parseColor("#00BCD4")); //set a color to the background of the Layout

        switchbutton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { //Listener to the switch
                                                    @Override
                                                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) { //if any change in the switch
                                                        if (switchbutton.isChecked()){ //if any change in the switch
                                                            Layout.setBackgroundColor(Color.parseColor("#AEEA00")); //change the color of background
                                                            textView.setText("ooh! or This color?"); //change the text of the textview
                                                        }
                                                        else {
                                                            Layout.setBackgroundColor(Color.parseColor("#00BCD4")); //if it not cheched change to this color
                                                            textView.setText("This Color?");
                                                        }

                                                    }
                                                }

        );
    }
}
