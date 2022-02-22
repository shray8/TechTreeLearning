package com.example.techtreelearning;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RV_Button_Fragment extends Fragment implements View.OnClickListener{

    private SendMessage sendMessage;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        sendMessage = (SendMessage) context;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_r_v__button_, container, false);

        view.findViewById(R.id.buttRecyclerView).setOnClickListener(this);
        view.findViewById(R.id.textHello);
        //view.findViewById(R.id.buttBackdrop).setOnClickListener(this);

        return  view;
    }

    @Override
    public void onClick(View v) {
       getParentFragmentManager().beginTransaction().replace(R.id.rv_Frame, new RecyclerViewFragment()).addToBackStack(OopsActivity.class.getName()).commit();
        sendMessage.message("hello Everyone");
    }




}