package com.example.networking;

import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {
    private ArrayList<Mountain> mountainList;

    public recyclerAdapter(ArrayList<Mountain> mountainList){
        this.mountainList = mountainList;
    }
    public class myViewHolder extends RecyclerView.ViewHolder{
        private TextView mountainText;

        public MyViewHolder(Final View view){
            super(view);
            mountainText = itemView.findViewById(R.id.);
        }
    }
    @NonNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
