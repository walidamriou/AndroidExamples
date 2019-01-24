package com.example.a7_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.a7_checkbox.R;

public class MainActivity extends AppCompatActivity {
    CheckBox data1,data2,data3;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data1=findViewById(R.id.data1);
        data2=findViewById(R.id.data2);

        ok=findViewById(R.id.ok);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((data1.isChecked()) && (data2.isChecked())){
                    Toast.makeText(MainActivity.this,"Checked: "+data1.getText().toString()+"\n"+data2.getText().toString()
                            , Toast.LENGTH_SHORT).show();
                }
                else if (data1.isChecked()){
                    Toast.makeText(MainActivity.this,"Checked:-"+data1.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else if (data2.isChecked()){
                    Toast.makeText(MainActivity.this,"Checked:-"+data2.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Please select any checkbox ",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
