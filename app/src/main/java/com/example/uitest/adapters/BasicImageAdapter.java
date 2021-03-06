package com.example.uitest.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.uitest.R;
import com.example.uitest.viewholders.BasicImageHolder;

public class BasicImageAdapter extends RecyclerView.Adapter<BasicImageHolder> {

    @NonNull
    @Override
    public BasicImageHolder onCreateViewHolder( @NonNull ViewGroup parent, int position ) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_basic_image_holder, parent, false);
        return new BasicImageHolder(view);
    }

    @Override
    public void onBindViewHolder( @NonNull BasicImageHolder basicImageHolder, int position ) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
