package com.example.practice.shortnews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by yamini on 3/5/18.
 */

public class SearchByCategory  extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Category> categoryList;
    List<Topic> topicList;
    GridView topics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_by_category);

        recyclerView =(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        topics = (GridView) findViewById(R.id.topics);
        categoryList = new ArrayList<>();

        categoryList.add(new Category("MY FEED",R.drawable.business));
        categoryList.add(new Category("ALL NEWS",R.drawable.business));
        categoryList.add(new Category("TOP STORIES",R.drawable.business));
        categoryList.add(new Category("TRENDING",R.drawable.business));
        categoryList.add(new Category("BOOKMARKS",R.drawable.business));
        categoryList.add(new Category("UNREAD",R.drawable.business));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,categoryList);
        recyclerView.setAdapter(adapter);

        topicList = new ArrayList<>();
        topicList.add(new Topic(R.drawable.business, "IPL 2018"));

//        TopicAdapter topic = new TopicAdapter(this,topicList);





    }
}

