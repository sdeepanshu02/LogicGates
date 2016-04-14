package com.example.android.logicgates;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NOR extends AppCompatActivity {
    boolean res;
    EditText norIp1,norIp2,norIp3;
    int ip1,ip2,ip3;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nor);

        norIp1 = (EditText) findViewById(R.id.norIp1);
        norIp2 = (EditText) findViewById(R.id.norIp2);
        norIp3 = (EditText) findViewById(R.id.norIp3);
        display = (TextView) findViewById(R.id.norResult);
    }

    public void RESULT(View view){
        ip1 = Integer.parseInt(norIp1.getText().toString());
        ip2 = Integer.parseInt(norIp2.getText().toString());
        ip3 = Integer.parseInt(norIp3.getText().toString());
        res = !(ip1==1||ip2==1||ip3==1);
        display.setText("RESULT : "+Boolean.toString(res));
    }
}
