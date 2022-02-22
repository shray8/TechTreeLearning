package com.example.techtreelearning;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public  class OopsActivity extends  SubOopsActivity implements View.OnClickListener, SendMessage {




    TextView  txtvehicle;
    TextView txtsound;
    TextView txtadd;
    TextView txtAL;
    TextView txtLL;
    TextView txtHS;
    TextView txtstatic;
    TextView txtHello;

    Button buttInterface;
    Button buttBottomSheet;
    Button buttDialog;
    Button buttCardView;
    Button buttNewActivity;
    Button buttDashboard;
    Button buttBackDrop;
    Button buttSnackbar;
    Button buttSympli1;

    RelativeLayout relativeLayout;

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.buttDashboard:
                startActivity(new Intent(OopsActivity.this, DashboardActivity.class));
                break;
            case R.id.butNewAct:
                startActivity(new Intent(OopsActivity.this, Activity2.class));
                break;
            case R.id.buttBackdrop:
                startActivity(new Intent(OopsActivity.this, BackdropActivity.class));
                break;
            case R.id.buttonSnackbar:
                relativeLayout = findViewById(R.id.RelativeLayout_main);
                Snackbar.make(relativeLayout, "Snackbar is here", BaseTransientBottomBar.LENGTH_LONG)
                        .setTextColor(Color.WHITE).setAction("Toast", view -> Toast.makeText(OopsActivity.this, "Snackbar", Toast.LENGTH_SHORT).show()).show();
                break;
            case R.id.cardView:
                startActivity(new Intent(OopsActivity.this, CardActivity.class));

                break;
            case R.id.bottomSheet:
                BottomSheetFragment bottomSheetFragment = new BottomSheetFragment();
                bottomSheetFragment.show(getSupportFragmentManager(), bottomSheetFragment.getTag());
                break;
            case R.id.Dialog:
                AlertDialog.Builder dialogBuilder = new  AlertDialog.Builder(OopsActivity.this);
                dialogBuilder.setTitle("Info");
                dialogBuilder.setMessage("Hey guyssss.  Wasssuuppppppppp");
                dialogBuilder.setPositiveButton("Done", (dialog, which) -> dialog.dismiss());
                dialogBuilder.create().show();
                break;

            default:
                break;

        }
    }

    @Override
    public void message(String msg) {
        txtHello.setText(msg);
    }



    public interface ColorChange{
        int buttonClick(View view);

    }




        @Override
    String sound() {
        soundmessage();
        return " Sound function";
    }

    @Override
    int method() {
        return 0;
    }

    @Override
    public void move()
    {
        txtvehicle.setText(" OOps class ");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportFragmentManager().beginTransaction().replace(R.id.rv_Frame, new RV_Button_Fragment()).commit();



        for (int i = 0; i<50; i++) {

            Toast toast = Toast.makeText(getApplicationContext(), String.valueOf(i), Toast.LENGTH_SHORT);
            toast.show();

        }

        txtHello = findViewById(R.id.textHello);
        txtvehicle = findViewById(R.id.vehicle);
        txtsound = findViewById(R.id.sound);
        txtadd = findViewById(R.id.textadd);
        txtAL = findViewById(R.id.textAL);
        txtLL = findViewById(R.id.textLL);
        txtHS = findViewById(R.id.textHS);
        txtstatic = findViewById(R.id.textstatic);
        buttInterface = findViewById(R.id.buttColorChange);
        buttNewActivity = findViewById(R.id.butNewAct);
        buttDashboard = findViewById(R.id.buttDashboard);
        buttBackDrop = findViewById(R.id.buttBackdrop);
        buttSnackbar = findViewById(R.id.buttonSnackbar);
        buttCardView = findViewById(R.id.cardView);
        buttDialog = findViewById(R.id.Dialog);
        buttBottomSheet = findViewById(R.id.bottomSheet);
//        buttSympli1 = findViewById(R.id.buttRV);

        buttInterface.setOnClickListener(this);
        buttNewActivity.setOnClickListener(this);
        buttDashboard.setOnClickListener(this);
        buttBackDrop.setOnClickListener(this);
        buttSnackbar.setOnClickListener(this);
        buttCardView.setOnClickListener(this);
        buttBottomSheet.setOnClickListener(this);
      //  buttSympli1.setOnClickListener(this);



        txtsound.setText(sound());  // abstract



        int ans = add(2,6,2);
        txtadd.setText(String.valueOf(ans));   // overloading




         move();   //overriding



                                                                 // static variable
        Oops2Activity.Ivy obj = new Oops2Activity.Ivy();      // static class
                                                                // static method
        txtstatic.setText(Oops2Activity.Ivy.increment() + " , " + Oops2Activity.Ivy.change() + " , " + obj.myMethod());




        // *****************************  DS  **************************************************************

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(10);
        txtAL.setText(arrayList.indexOf(5) + " , " + arrayList.get(2));


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(11);
        txtLL.setText(linkedList.peek() + " , " + linkedList.getLast());

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(50);
        hashSet.add(40);
        hashSet.add(30);
        hashSet.add(20);
        txtHS.setText(hashSet.size() + " , " + hashSet.hashCode() + " , " + hashSet.contains(30));
    }






    //*********************************Confirm Dialog *************************************************

    @Override
    public void onBackPressed() {

        getSupportFragmentManager().popBackStack ();

//        new AlertDialog.Builder(this).setTitle("Closing App").setMessage("Do you want to exit??")
//                .setPositiveButton("Yes", (dialogInterface, i) -> finish()).setNegativeButton("No",null).show();

    }


}