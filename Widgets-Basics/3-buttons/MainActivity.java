package com.example.a3_buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View view){
                                           Toast.makeText(MainActivity.this,"Clicked button 1",Toast.LENGTH_SHORT).show();
                                       }
                                   }
                                   );

        button2.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View view){
                                           Toast.makeText(MainActivity.this,"Clicked button 2 ",Toast.LENGTH_SHORT).show();                                      }
                                   }
                                   );

        button3.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View view){
                                           Toast.makeText(MainActivity.this,"Clicked button 3 ",Toast.LENGTH_SHORT).show();                                      }
                                   }
        );
    }
}
