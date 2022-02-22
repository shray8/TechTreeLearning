package com.example.techtreelearning;

import android.content.Context;
import android.os.Bundle;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;


public class BackdropFragment extends Fragment implements View.OnClickListener {

    CoordinatorLayout coordinatorLayout;
    BottomSheetBehavior<View> sheetBehavior;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        coordinatorLayout = (CoordinatorLayout) inflater.inflate(R.layout.fragment_backdrop, container, false);


        ImageView filterIcon = coordinatorLayout.findViewById(R.id.filterIcon);
        LinearLayout contentLayout = coordinatorLayout.findViewById(R.id.contentLayout);

        sheetBehavior = BottomSheetBehavior.from(contentLayout);
        sheetBehavior.setFitToContents(false);
        sheetBehavior.setHideable(false);
        sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

        filterIcon.setOnClickListener(this::onClick);
        return coordinatorLayout;

    }

    private void toggleFilters() {
        if(sheetBehavior.getState() == BottomSheetBehavior.STATE_EXPANDED){
            sheetBehavior.setState(BottomSheetBehavior.STATE_HALF_EXPANDED);
        }else{
            sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        }
    }

    @Override
    public void onClick(View v) {
        toggleFilters();
    }
}