package com.example.a11_autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    TextView textView;
    String[] data = {"Mary","Patricia","Linda","Barbara","Elizabeth","Jennifer","Maria","Susan","Margaret","Dorothy",
            "Lisa","Nancy","Karen","Betty","Helen","Sandra","Donna","Carol","Ruth","Sharon","Michelle","Laura","Sarah","Kimberly",
            "Deborah","Jessica","Shirley","Cynthia","Angela","Melissa","Brenda","Amy","Anna","Rebecca"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView=findViewById(R.id.autoCompleteTextView);
        textView=findViewById(R.id.textView);


        /*
        Java StringBuilder class is designed for use as a drop-in replacement
        for StringBuffer in places where the string buffer was being used by a
        single thread (as is generally the case). If execution speed and
        performance is a factor, StringBuilder class can be used in place of StringBuffer.
         */
        StringBuilder Text = new StringBuilder();
        Text.append("You can add: ").append("\n");

        for (String valure: data){
            Text.append(valure).append(", ");
        }

        textView.setText(Text);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);//start searching from 1 character
        autoCompleteTextView.setAdapter(adapter);
    }
}
