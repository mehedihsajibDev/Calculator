package com.tolet.sajib.layoutdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button plus,minus,mul,devide;
    EditText inputone,inputtwo;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus=findViewById(R.id.plusid);
        minus=findViewById(R.id.minusid);
        mul=findViewById(R.id.mulid);
        devide=findViewById(R.id.devideid);
        inputone=findViewById(R.id.inputoneid);
        inputtwo=findViewById(R.id.inputtwoid);
        result=findViewById(R.id.resultid);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        mul.setOnClickListener(this);
        devide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String v1=inputone.getText().toString();
        String v2=inputtwo.getText().toString();
        Double v3=Double.parseDouble(v1);
        double v4=Double.parseDouble(v2);
        if(v.getId()==R.id.plusid){
            double value=v3+v4;
           result.setText("resul is:"+value);
        }
        if(v.getId()==R.id.minusid){
            double value=v3-v4;
            result.setText("resul is:"+value);
        }
        if(v.getId()==R.id.mulid){
            double value=v3*v4;
            result.setText("resul is:"+value);
        }
        if(v.getId()==R.id.devideid){
            double value=v3/v4;
            result.setText("resul is:"+value);
        }
    }
}
