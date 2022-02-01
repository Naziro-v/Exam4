package com.nazirov.friendlyeats;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;

import com.nazirov.friendlyeats.adapter.CustomAdapter;
import com.nazirov.friendlyeats.model.Food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);


        initView();
        refreshAdapter(prepareFoodList());

    }

    private void initView() {
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));
    }

    private void refreshAdapter(ArrayList<Food> foods) {
        CustomAdapter adapter = new CustomAdapter(foods);
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<Food> prepareFoodList() {

        ArrayList<Food> foods = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            foods.add(new Food("Diner Steakhous", "Sushi", "Seattle", R.drawable.exam1));
        }

        return foods;
    }
}