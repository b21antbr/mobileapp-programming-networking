package com.example.networking;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {
    private ArrayList<Mountain> mountainList;

    public recyclerAdapter(ArrayList<Mountain> mountainList){
        this.mountainList = mountainList;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView mountainText;


        public MyViewHolder(final View view) {
            super(view);
            mountainText = view.findViewById(R.id.mountainName);
        }
    }
    @NonNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {
        String name = mountainList.get(position).getName();
        String location = mountainList.get(position).getLocation();
        int size = mountainList.get(position).getSize();
        holder.mountainText.setText("Name: " + name + "\nLocation: " + location + "\nSize: " + size);
    }

    @Override
    public int getItemCount() {
        return mountainList.size();
    }

    public void addMountains(ArrayList<Mountain> mountainList){
        this.mountainList.addAll(mountainList);
        notifyDataSetChanged();
    }
}
