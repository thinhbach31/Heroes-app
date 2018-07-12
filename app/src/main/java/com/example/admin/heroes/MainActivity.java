package com.example.admin.heroes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycle_myrecycleview);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this, LinearLayout.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);


        ArrayList<Heroes> mArrayHeroes = new ArrayList<>();

        mArrayHeroes.add(new Heroes(R.drawable.dr_strange,"Dr. Strange"));
        mArrayHeroes.add(new Heroes(R.drawable.deadpool,"Dead Pool"));
        mArrayHeroes.add(new Heroes(R.drawable.venom,"Venom"));
        mArrayHeroes.add(new Heroes(R.drawable.cyclops,"Cyclops"));

        HeroesAdapter heroesAdapter = new HeroesAdapter(mArrayHeroes, getApplicationContext());
        mRecyclerView.setAdapter(heroesAdapter);
    }
}
