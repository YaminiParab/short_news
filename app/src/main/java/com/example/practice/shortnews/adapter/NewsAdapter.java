package com.example.practice.shortnews.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practice.shortnews.modal.News;
import com.example.practice.shortnews.ui.NewsActivity;
import com.example.practice.shortnews.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamini on 22/5/18.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    private Context context;
    private List<News> newsList ;

    public NewsAdapter(Context context) {
        this.context = context;
        this.newsList = new ArrayList<News>();

    }

    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.singlenews, parent, false);
        return new NewsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsAdapter.ViewHolder holder, int position) {
        News news = newsList.get(position);
        holder.published_date.setText(news.getDate());
        holder.news_title.setText(news.getTitle());
        holder.news_description.setText(news.getShort_description());
        Picasso.with(context).load(news.getImage()).error(R.drawable.sample_7).placeholder(R.drawable.sample_0).into(holder.news_images);

    }

    @Override
    public int getItemCount() {
        if (newsList != null) {
            return newsList.size();
        }
        else {
            return 0;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView news_images;
        TextView news_title;
        TextView news_description;
        TextView published_date;
        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            news_images = itemView.findViewById(R.id.news_image);
            news_title = itemView.findViewById(R.id.news_title);
            news_description = itemView.findViewById(R.id.short_desciption);
            published_date = itemView.findViewById(R.id.published_date);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context,NewsActivity.class);
            context.startActivity(intent);

        }
    }

    public void setData(List<News> newsList) {
        this.newsList.addAll(newsList);
        notifyDataSetChanged();
    }

}
