package com.example.a10_ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar=findViewById(R.id.ratingBar);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float ratingvalure=ratingBar.getRating();
                int Ratingvalure=ratingBar.getNumStars();
                Toast.makeText(getApplicationContext(),"Rating: "+ratingvalure+"\n"+"Number of Stars:"+Ratingvalure,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
