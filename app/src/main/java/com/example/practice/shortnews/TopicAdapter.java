package com.example.practice.shortnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamini on 11/5/18.
 */

public class TopicAdapter extends BaseAdapter {

//    ArrayList<Topic> topic_list;
    private Context context;
    private List<Topic> topic_list;

    public TopicAdapter(Context context, List<Topic> topic_list) {
        this.context = context;
        this.topic_list = topic_list;
    }

    @Override
    public int getCount()
    {
        return  topic_list.size();
    }

    @Override
    public Object getItem(int i)
    {
        return topic_list.get(i);

    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    class ViewHolder {
        ImageView topics_images;
        TextView topic_name;
        ViewHolder (View v){
            topics_images = v.findViewById(R.id.imageview);
            topic_name = v.findViewById(R.id.image_name);
        }
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row = view;
        ViewHolder holder = null;
        if (row == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.singleitem, viewGroup,false);
            holder=new ViewHolder(row);
            row.setTag(holder);

        }
        else {
            holder = (ViewHolder) row.getTag();
        }
        Topic temp = topic_list.get(i);
        holder.topics_images.setImageResource(temp.image);
        holder.topic_name.setText(temp.image_name);
        return row;
    }
}
