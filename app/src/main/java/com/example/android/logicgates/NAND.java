package com.example.android.logicgates;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NAND extends AppCompatActivity {
    boolean res;
    EditText nandIp1,nandIp2,nandIp3;
    int ip1,ip2,ip3;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nand);

        nandIp1 = (EditText) findViewById(R.id.nandIp1);
        nandIp2 = (EditText) findViewById(R.id.nandIp2);
        nandIp3 = (EditText) findViewById(R.id.nandIp3);
        display = (TextView) findViewById(R.id.nandResult);
    }

    public void RESULT(View view){
        ip1 = Integer.parseInt(nandIp1.getText().toString());
        ip2 = Integer.parseInt(nandIp2.getText().toString());
        ip3 = Integer.parseInt(nandIp3.getText().toString());
        res = !(ip1==1&&ip2==1&&ip3==1);
        display.setText("RESULT : "+Boolean.toString(res));
    }
}
