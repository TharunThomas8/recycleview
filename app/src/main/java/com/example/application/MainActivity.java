package com.example.application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView HistoryList=(RecyclerView) findViewById(R.id.HistoryList);
        HistoryList.setLayoutManager(new LinearLayoutManager(this));
        String[] Recentsearch = {"Sport","Education","Philosophy","Books","Films","Gym","Badminton","Counselling","Programming","Motivation"};
        HistoryList.setAdapter(new HistoryListAdapter(Recentsearch));



    }
}
