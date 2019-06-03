package com.example.skferdousrahman.analogdigitalclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AnalogClock analogclock;
    private  DigitalClock digitalclock;
    private TextClock textclock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analogclock=(AnalogClock)findViewById(R.id.analog);
        digitalclock=(DigitalClock)findViewById(R.id.digital);
        textclock=(TextClock)findViewById(R.id.text);


        analogclock.setOnClickListener(this);
        digitalclock.setOnClickListener(this);
        textclock.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.analog){
            Toast.makeText(MainActivity.this,"this is analog clock",Toast.LENGTH_SHORT).show();
        }
        else if
            (v.getId()==R.id.digital){
            Toast.makeText(MainActivity.this,"this is digital clock",Toast.LENGTH_SHORT).show();

        }
        if (v.getId()==R.id.analog){
            Toast.makeText(MainActivity.this,"this is text clock",Toast.LENGTH_SHORT).show();
        }


    }
}
