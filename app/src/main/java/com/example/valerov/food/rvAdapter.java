package com.example.valerov.food;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by root on 2/18/18.
 */

public class rvAdapter extends RecyclerView.Adapter<rvAdapter.ViewHolder> {
    private ArrayList<String> nmData;

    public rvAdapter (ArrayList<String> inputData){
        nmData = inputData;

    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nmenu;

        public ViewHolder(View v){
            super (v);
            nmenu = (TextView)v.findViewById(R.id.text_nmenu);

        }


    }
public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_menu, parent, false);
    ViewHolder vh = new ViewHolder(v);
    return vh;
    }
public  void onBindViewHolder (ViewHolder holder, int position){
    final String amenu = nmData.get(position);

    holder.nmenu.setText(nmData.get(position));

}

public int getItemCount(){
    return nmData.size();

}
}
