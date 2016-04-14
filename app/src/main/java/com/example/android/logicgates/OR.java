package com.example.android.logicgates;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class OR extends AppCompatActivity {
    boolean res;
    EditText orIp1,orIp2,orIp3;
    int ip1,ip2,ip3;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_or);

        orIp1 = (EditText) findViewById(R.id.orIp1);
        orIp2 = (EditText) findViewById(R.id.orIp2);
        orIp3 = (EditText) findViewById(R.id.orIp3);
        display = (TextView) findViewById(R.id.orResult);
    }

    public void RESULT(View view){
        ip1 = Integer.parseInt(orIp1.getText().toString());
        ip2 = Integer.parseInt(orIp2.getText().toString());
        ip3 = Integer.parseInt(orIp3.getText().toString());
        res = (ip1==1||ip2==1||ip3==1);
        display.setText("RESULT : "+Boolean.toString(res));
    }
}
