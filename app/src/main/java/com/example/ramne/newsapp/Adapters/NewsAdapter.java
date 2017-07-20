package com.example.ramne.newsapp.Adapters;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ramne.newsapp.Classes.News;
import com.example.ramne.newsapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {

    private List<News> newsList;
    Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView headline, date;
        public ImageView newsimage;

        public MyViewHolder(View view) {
            super(view);
            headline = (TextView) view.findViewById(R.id.headline);
            date = (TextView) view.findViewById(R.id.date);
            newsimage = (ImageView) view.findViewById(R.id.imageView);
        }
    }


    public NewsAdapter(List<News> newsList, Context context) {
        this.newsList = newsList;
        this.context=context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        News news = newsList.get(position);
        holder.headline.setText(news.getHeadline());
        holder.date.setText(news.getDate());
        Picasso.with(this.context).load(news.getImageUrl()).into(holder.newsimage);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }
}
