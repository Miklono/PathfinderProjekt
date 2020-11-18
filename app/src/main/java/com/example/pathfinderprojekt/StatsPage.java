package com.example.pathfinderprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StatsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_page);
    }

    static int calculateMod(int puntuation){
        int mod = (int)(puntuation - 10) / 2;
        return mod;
    }
}