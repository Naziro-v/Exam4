package com.nazirov.friendlyeats.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nazirov.friendlyeats.MainActivity;
import com.nazirov.friendlyeats.R;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter {

    private MainActivity activity;
    private List<ImageView> imageViews;

    public CustomAdapter(MainActivity activity, List<ImageView> imageViews) {
        this.activity= activity;
        this.imageViews=imageViews;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewGroup viewGroup = null;

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_custom_layout,viewGroup,false);
        return new CustomViewHolder(view);


//        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_custom_layout,viewGroup,false);
//        return new CustomViewHolder(view);    }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class CustomViewHolder extends RecyclerView.ViewHolder{
        public View view;

        public CustomViewHolder(@NonNull View v) {
            super(v);
            view=v;
        }
    }

}
