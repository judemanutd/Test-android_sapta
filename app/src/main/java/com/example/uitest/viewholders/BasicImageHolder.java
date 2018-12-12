package com.example.uitest.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.uitest.R;

public class BasicImageHolder extends RecyclerView.ViewHolder {

    private ImageView mImageView;
    private TextView mTextView;

    public BasicImageHolder( @NonNull View itemView ) {
        super(itemView);
        mImageView = itemView.findViewById(R.id.image);
        mTextView = itemView.findViewById(R.id.text);
    }
}
