package com.example.practice.shortnews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by yamini on 3/5/18.
 */

public class SearchByCategory  extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Category> categoryList;
    List<Topic> topicList;
    RecyclerView topics;
    GridLayoutManager topiclayoutManager;
    CardView topic_card;
    MaterialSearchView materialSearchView;
    String[] list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_by_category);

        recyclerView =(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_search);
        setSupportActionBar(toolbar);


        topics = (RecyclerView) findViewById(R.id.topics);
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
//        topicList.add(new Topic(R.drawable.ipl, "IPL 2018"));
//        topicList.add(new Topic(R.drawable.karnataka_polls, "Karnataka Polls"));
//        topicList.add(new Topic(R.drawable.india, "India"));
//        topicList.add(new Topic(R.drawable.business, "Business"));
//        topicList.add(new Topic(R.drawable.politics, "Politics"));
//        topicList.add(new Topic(R.drawable.sports, "Sports"));
//        topicList.add(new Topic(R.drawable.technology, "Technology"));
//        topicList.add(new Topic(R.drawable.startup, "Startups"));
//        topicList.add(new Topic(R.drawable.entertainment, "Entertainment"));

        topicList.add(new Topic(R.drawable.business, "IPL 2018"));
        topicList.add(new Topic(R.drawable.business, "Karnataka Polls"));
        topicList.add(new Topic(R.drawable.business, "India"));
        topicList.add(new Topic(R.drawable.business, "Business"));
        topicList.add(new Topic(R.drawable.business, "Politics"));
        topicList.add(new Topic(R.drawable.business, "Sports"));
        topicList.add(new Topic(R.drawable.business, "Technology"));
        topicList.add(new Topic(R.drawable.business, "Startups"));
        topicList.add(new Topic(R.drawable.business, "Entertainment"));

        TopicAdapter topic = new TopicAdapter(this, topicList);
        topiclayoutManager = new GridLayoutManager(this, 3);
        topics.setLayoutManager(topiclayoutManager);
        topics.setAdapter(topic);
        list = new String[]{"android","kotlin","python","django","reactjs"};
        materialSearchView = (MaterialSearchView) findViewById(R.id.mysearch);
        materialSearchView.closeSearch();
        materialSearchView.setSuggestions(list);
        materialSearchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

//        topic_card = (CardView) findViewById(R.id.topicCardView);
//        topic_card.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent myIntent = new Intent(SearchByCategory.this,NewsActivity.class);
//                startActivity(myIntent);
//            }
//        });






    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menus, menu);
        MenuItem item = menu.findItem(R.id.search);
        materialSearchView.setMenuItem(item);
        return true;
    }
}

