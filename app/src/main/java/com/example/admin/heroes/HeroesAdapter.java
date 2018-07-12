package com.example.admin.heroes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HeroesAdapter extends RecyclerView.Adapter<HeroesAdapter.ViewHolder> {

    ArrayList<Heroes> mArrayHero = new ArrayList<>();
    Context mContext;

    public HeroesAdapter(ArrayList<Heroes> mArrayHero, Context context) {
        this.mArrayHero = mArrayHero;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.items_heroes, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mImage.setImageResource(mArrayHero.get(position).getmImage());
        holder.mText.setText(mArrayHero.get(position).getmName());
    }

    @Override
    public int getItemCount() {
        return mArrayHero.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mText;
        ImageView mImage;

        public ViewHolder(View itemView) {
            super(itemView);

            mText = itemView.findViewById(R.id.text_Hero);
            mImage = itemView.findViewById(R.id.image_Hero);
        }
    }
}
