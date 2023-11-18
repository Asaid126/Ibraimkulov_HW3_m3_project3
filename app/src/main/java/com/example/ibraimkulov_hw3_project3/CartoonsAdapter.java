package com.example.ibraimkulov_hw3_project3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CartoonsAdapter extends RecyclerView.Adapter<CartoonsViewHolder> {
    private ArrayList<String>cartoonList;

    public CartoonsAdapter(ArrayList<String> cartoonList) {
        this.cartoonList = cartoonList;
    }

    @NonNull
    @Override
    public CartoonsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CartoonsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cartoons,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CartoonsViewHolder holder, int position) {
    holder.bind(cartoonList.get(position));
    }

    @Override
    public int getItemCount() {
        return cartoonList.size();
    }
}

