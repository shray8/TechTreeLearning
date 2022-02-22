package com.example.techtreelearning;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1 extends Fragment implements View.OnClickListener {

    Button buttFragment2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_1, container, false);
        view.findViewById(R.id.buttFrag2).setOnClickListener(this);
        return  view;



    }


    @Override
    public void onClick(View view) {
        Class<Fragment1> fragment1 = Fragment1.class;
        Fragment2 fragment2 = new Fragment2();
        FragmentManager fragmentManager = getParentFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.FrameLayout,fragment2, " ");
        fragmentTransaction.addToBackStack(fragment1.getClass().getName());
        fragmentTransaction.commit();
    }
}