package com.example.techtreelearning;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

abstract class SubOopsActivity extends AppCompatActivity {
    TextView txtcar;
    TextView txtMotorVehicle;
    String soundMsg = "Sound Message";



    //  Non-abstract method
    public String soundmessage(){
        return soundMsg;
    }

    //Abstract method
    abstract String sound();
    abstract int method();

     private String  name;

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int add(int i, int j) {
        return i+j;
    }

    public int add(int i, int j, int k) {
        return i+j+k;
    }



    public void move()
    {

        txtMotorVehicle.setText(" sub-OOps class ");
    }








}
