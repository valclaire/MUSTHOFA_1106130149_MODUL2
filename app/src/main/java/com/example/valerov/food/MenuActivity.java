package com.example.valerov.food;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
private RecyclerView rvView;
private RecyclerView.Adapter adapter;

private RecyclerView.LayoutManager layoutManager;
private ArrayList<String> dataSet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dataSet = new ArrayList<>();
        initDataset();
    rvView =(RecyclerView)findViewById(R.id.rv_main);
    rvView.setHasFixedSize(true);
    layoutManager = new LinearLayoutManager(this);
    rvView.setLayoutManager(layoutManager);
    adapter = new rvAdapter(dataSet);
    rvView.setAdapter(adapter);
    }

    private void initDataset() {
    dataSet.add("Nasi Goreng");
    dataSet.add("Mie Rebus");
    dataSet.add("Nasi Telor");
    dataSet.add ("Nasi Omlet");
    dataSet.add ("Mie Ayam");
    dataSet.add("Nasi Ayam Goreng");
    dataSet.add("Nasi Ayam Bakar");
    dataSet.add("Nasi Ayam Geprek");
    dataSet.add("Nasi Goreng Ayam");
    dataSet.add("Nasi Goreng Special");
    }



}
