package com.example.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText height,weight,viewcal;
    Button cal;
    Double calculated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height=findViewById(R.id.height);
        weight=findViewById(R.id.weight);
        viewcal=findViewById(R.id.viewcal);
        cal=findViewById(R.id.cal);

        cal.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        Double a = Double.parseDouble(weight.getText().toString());
        Double b = Double.parseDouble(height.getText().toString());
        Double c = (b/100);                             //it converts the height into meter
        switch (v.getId())
        {
            case R.id.cal:
                calculated=a/(c*c);
                viewcal.setText(calculated.toString());
                if(calculated<18.5)
                {
                    Toast.makeText(this, "You are Under Weight", Toast.LENGTH_SHORT).show();
                }
                else if(calculated>=18.5&&calculated<=24.9)
                {
                    Toast.makeText(this, "You are Normal Weight", Toast.LENGTH_LONG).show();
                }
                else if(calculated>=25&&calculated<=29.9)
                {
                    Toast.makeText(this,"You are overweight", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(this,"obesity", Toast.LENGTH_LONG).show();
                }



        }


    }
}
