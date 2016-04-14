package com.example.android.logicgates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AND(View view){
        Intent intent = new Intent(this,AND.class);
        startActivity(intent);
    }

    public void OR(View view){
        Intent intent = new Intent(this,OR.class);
        startActivity(intent);
    }

    public void NOT(View view){
        Intent intent = new Intent(this,NOT.class);
        startActivity(intent);
    }

    public void NAND(View view){
        Intent intent = new Intent(this,NAND.class);
        startActivity(intent);
    }

    public void NOR(View view){
        Intent intent = new Intent(this,NOR.class);
        startActivity(intent);
    }
}
