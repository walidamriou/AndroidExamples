package com.example.a4_togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button = findViewById(R.id.Button);

        Button.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public void onClick(View view){
                                          if (Button.isChecked())
                                              Toast.makeText(getApplicationContext(),"ToggleButton Checked: "+Button.getText().toString(),Toast.LENGTH_SHORT).show();
                                          else
                                              Toast.makeText(getApplicationContext(),"ToggleButton: "+Button.getText().toString(),Toast.LENGTH_LONG).show();

                                      }

                                  }

        );

        }
    }

