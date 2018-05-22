package com.example.practice.shortnews.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practice.shortnews.modal.Category;
import com.example.practice.shortnews.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by yamini on 4/5/18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private List<Category> categoryList;


    public RecyclerViewAdapter(Context context, List<Category> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.search, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Category category = categoryList.get(position);
//        holder.images.setImageDrawable(context.getResources().getDrawable(category.getImage()));
        Picasso.with(context).load(category.getImage()).error(R.drawable.sample_7).placeholder(R.drawable.sample_0).into(holder.images);
//        holder.images.setImageResource(category.getImage());
        holder.name.setText(category.getTitle());

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
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
