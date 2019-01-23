package com.example.a6_imagelikebutton;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.pd.chocobar.ChocoBar;

public class MainActivity extends AppCompatActivity {
    ImageView imageView,imageView1,imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);
        imageView1=findViewById(R.id.imageView1);
        imageView2=findViewById(R.id.imageView2);


//When click in image run warning bar 
        imageView.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Snackbar warningSnackBar = ChocoBar.builder().setActivity(MainActivity.this).setText("you are in warning -_- ").setDuration(ChocoBar.LENGTH_LONG).orange();
                                             warningSnackBar.show();
                                         }
                                     }
        );


//When click in image 1 run red bar 

        imageView1.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             ChocoBar.builder().setView(v).setText("RED").setDuration(ChocoBar.LENGTH_INDEFINITE).setActionText(android.R.string.ok).red().show();
                                         }
                                     }

        );

//When click in image 2 run green bar 

        imageView2.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             ChocoBar.builder().setActivity(MainActivity.this).setText("GREEN").setDuration(ChocoBar.LENGTH_SHORT).green().show();
                                         }
                                     }
        );



    }
}
