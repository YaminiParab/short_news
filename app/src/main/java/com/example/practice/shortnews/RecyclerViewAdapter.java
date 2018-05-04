package com.example.practice.shortnews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practice.shortnews.R;

import java.util.ArrayList;

/**
 * Created by yamini on 4/5/18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<String> image_urls = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> name, ArrayList<String> image_urls, Context context) {
        this.name = name;
        this.image_urls = image_urls;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.search, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView images;
        TextView name;
        public ViewHolder(View itemView) {
            super(itemView);
            images = itemView.findViewById(R.id.category_image);
            name = itemView.findViewById(R.id.category_text);
        }
    }
}
