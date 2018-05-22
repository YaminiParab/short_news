package com.example.practice.shortnews.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practice.shortnews.ui.NewsActivity;
import com.example.practice.shortnews.R;
import com.example.practice.shortnews.modal.Topic;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by yamini on 11/5/18.
 */

//public class TopicAdapter extends BaseAdapter {
//
////    ArrayList<Topic> topic_list;
//    private Context context;
//    private List<Topic> topic_list;
//
//    public TopicAdapter(Context context, List<Topic> topic_list) {
//        this.context = context;
//        this.topic_list = topic_list;
//    }
//
//    @Override
//    public int getCount()
//    {
//        return  topic_list.size();
//    }
//
//    @Override
//    public Object getItem(int i)
//    {
//        return topic_list.get(i);
//
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return i;
//    }
//
//    class ViewHolder {
//        ImageView topics_images;
//        TextView topic_name;
//        ViewHolder (View v){
//            topics_images = v.findViewById(R.id.imageview);
//            topic_name = v.findViewById(R.id.image_name);
//        }
//    }
//
//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//        View row = view;
//        ViewHolder holder = null;
//        if (row == null)
//        {
//            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            row = inflater.inflate(R.layout.singleitem, viewGroup,false);
//            holder=new ViewHolder(row);
//            row.setTag(holder);
//
//        }
//        else {
//            holder = (ViewHolder) row.getTag();
//        }
//        Topic temp = topic_list.get(i);
//        Picasso.with(context).load(temp.image).error(R.drawable.sample_7).placeholder(R.drawable.sample_0).into(holder.topics_images);
//        //holder.topics_images.setImageResource(temp.image);
//        holder.topic_name.setText(temp.image_name);
//        return row;
//    }
//}

public class TopicAdapter  extends RecyclerView.Adapter<TopicAdapter.ViewHolder>{

    private Context context;
    private List<Topic> topic_list;

    public TopicAdapter(Context context, List<Topic> topic_list) {
        this.context = context;
        this.topic_list = topic_list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.singleitem, parent, false);
            return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Topic topic = topic_list.get(position);
//        holder.topics_images.setImageResource(topic.getImage());
        holder.topic_name.setText(topic.getImage_name());
        Picasso.with(context).load(topic.getImage()).error(R.drawable.sample_7).placeholder(R.drawable.sample_0).into(holder.topics_images);

    }

    @Override
    public int getItemCount() {
        return topic_list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView topics_images;
        TextView topic_name;
        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            topics_images = itemView.findViewById(R.id.imageview);
            topic_name = itemView.findViewById(R.id.image_name);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context,NewsActivity.class);
            context.startActivity(intent);

        }
    }
}
