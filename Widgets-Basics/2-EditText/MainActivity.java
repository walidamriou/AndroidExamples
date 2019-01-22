package com.example.a2_edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText TextInput; //define the TextInput like a object from EditText
    TextView ViewTextInput; //define the ViewTextInput like a object from TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //add the activity_main layout or call it

        TextInput=findViewById(R.id.TextInput); //define the connection between the object TextInput and the element in the XML
        ViewTextInput=findViewById(R.id.ViewTextInput); //define the connection between the object  ViewTextInput and the element in the XML

        TextInput.addTextChangedListener(new TextWatcher() { //When an object of this type is attached to an Editable, its methods will be called when the text is changed.
            //more info here: https://developer.android.com/reference/android/text/TextWatcher


            //This method is called to notify you that, within s, the count characters beginning at start are about to be replaced by new text with length after.
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            //This method is called to notify you that, within s, the count characters beginning at start are about to be replaced by new text with length after.
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String input=TextInput.getText().toString();
                ViewTextInput.setText(input);
            }

            //This method is called to notify you that, somewhere within s, the text has been changed.
            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }
}
