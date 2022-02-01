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
import com.nazirov.friendlyeats.model.Food;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<Food> foods;


    public CustomAdapter(ArrayList<Food> foods) {
        this.foods = foods;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView name, foodName, description;
        ImageView imageView;

        public CustomViewHolder(View v) {
            super(v);
            view = v;

            name = view.findViewById(R.id.name);
            foodName = view.findViewById(R.id.food_name);
            description = view.findViewById(R.id.description);
            imageView = view.findViewById(R.id.imageView1);

        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_layout, parent, false);

        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Food food =foods.get(position);
        if (holder instanceof CustomViewHolder){
            ((CustomViewHolder) holder).name.setText(food.getName());
            ((CustomViewHolder) holder).foodName.setText(food.getFoodName());
            ((CustomViewHolder) holder).description.setText(food.getDescription());
            ((CustomViewHolder) holder).imageView.setImageResource(food.getImage());
        }


    }

    @Override
    public int getItemCount() {
        return foods.size();
    }



}
