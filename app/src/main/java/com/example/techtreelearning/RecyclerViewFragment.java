package com.example.techtreelearning;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<RVDataModel> rvDataHolder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        rvDataHolder = new ArrayList<>();

        RVDataModel ob1RVModel = new RVDataModel(R.drawable.kak, " Kak", "Teacher");
        rvDataHolder.add(ob1RVModel);

        RVDataModel ob2RVModel = new RVDataModel(R.drawable.kakashi, " Kakashi", "Sensei");
        rvDataHolder.add(ob2RVModel);

        RVDataModel ob3RVModel = new RVDataModel(R.drawable.shika, " Shikamaru", " Student");
        rvDataHolder.add(ob3RVModel);

        RVDataModel ob4RVModel = new RVDataModel(R.drawable.garden, " garden", " garden");
        rvDataHolder.add(ob4RVModel);

        RVDataModel ob5RVModel = new RVDataModel(R.drawable.kak, " Kak", " Teacher");
        rvDataHolder.add(ob5RVModel);

        RVDataModel ob6RVModel = new RVDataModel(R.drawable.kakashi, " Kakashi", " Sensei");
        rvDataHolder.add(ob6RVModel);

        RVDataModel ob7RVModel = new RVDataModel(R.drawable.shika, " Shikamaru", " Student");
        rvDataHolder.add(ob7RVModel);

        RVDataModel ob8RVModel = new RVDataModel(R.drawable.garden, " Garden", " garden");
        rvDataHolder.add(ob8RVModel);

        RVDataModel ob9RVModel = new RVDataModel(R.drawable.kak, " Kak", " Teacher");
        rvDataHolder.add(ob9RVModel);

        RVDataModel ob10RVModel = new RVDataModel(R.drawable.kakashi, " kakashi", " Sensei");
        rvDataHolder.add(ob10RVModel);

        RVDataModel ob11RVModel = new RVDataModel(R.drawable.garden, " Garden", " garden");
        rvDataHolder.add(ob11RVModel);

        recyclerView.setAdapter(new RVAdapter(rvDataHolder));

        return view;
    }
}