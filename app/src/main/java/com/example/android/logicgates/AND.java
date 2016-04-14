package com.example.android.logicgates;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AND extends AppCompatActivity {
    boolean res;
    EditText andIp1,andIp2,andIp3;
    int ip1,ip2,ip3;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_and);

        andIp1 = (EditText) findViewById(R.id.andIp1);
        andIp2 = (EditText) findViewById(R.id.andIp2);
        andIp3 = (EditText) findViewById(R.id.andIp3);
        display = (TextView) findViewById(R.id.andResult);
    }

    public void RESULT(View view){
        ip1 = Integer.parseInt(andIp1.getText().toString());
        ip2 = Integer.parseInt(andIp2.getText().toString());
        ip3 = Integer.parseInt(andIp3.getText().toString());
        res = (ip1==1&&ip2==1&&ip3==1);
        display.setText("RESULT : "+ Boolean.toString(res));
    }

}
