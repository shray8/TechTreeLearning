package com.example.techtreelearning;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.bottomappbar.BottomAppBar;

import java.util.zip.Inflater;

public class DashboardActivity extends AppCompatActivity {

    BottomAppBar bottomAppBar;
    Toolbar toolbar;
    AdView adView;
    AdRequest adRequest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bottomAppBar = findViewById(R.id.bottom_app_bar);
        setSupportActionBar(bottomAppBar);

        toolbar = findViewById(R.id.top_app_bar_toolbar);
        toolbar.inflateMenu(R.menu.top_app_bar_menu);

        adView = findViewById(R.id.ad_view);
        adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.bottom_app_bar_menu, menu);
        return true;
    }
}