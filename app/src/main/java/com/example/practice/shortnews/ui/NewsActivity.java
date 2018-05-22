package com.example.practice.shortnews.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.practice.shortnews.modal.News;
import com.example.practice.shortnews.R;
import com.example.practice.shortnews.adapter.NewsAdapter;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity {

    RecyclerView news_detail;
    List<News> newsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView topstories = ( TextView) findViewById(R.id.topStoriesView);

        news_detail = (RecyclerView) findViewById(R.id.news_detail);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        news_detail.setLayoutManager(layoutManager);

        newsList = new ArrayList<>();

        newsList.add(new News(R.drawable.angry_bird,"gjhgjhgjhgjghj","asagdjsadgjsdgjsd", "22/05/2018" ));
        newsList.add(new News(R.drawable.business,"dkshdkjsahdjksadhbjksdbsamkdbsakjdbskjd","asagdjsadgjsdgjsd", "22/05/2018" ));

        NewsAdapter adapter = new NewsAdapter(this);
        news_detail.setAdapter(adapter);
        adapter.setData(newsList);
        setSupportActionBar(toolbar);
        topstories.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(NewsActivity.this,SearchByCategory.class);
                startActivity(myIntent);
            }
        });


    }


}
