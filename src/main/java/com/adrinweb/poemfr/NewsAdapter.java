package com.adrinweb.poemfr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    private Context context;
    private List<Post> posts;

    public  NewsAdapter(Context context, List<Post> posts){

        this.context = context;
        this.posts = posts;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout_app_feature,parent,false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        Post post=posts.get(position);
        holder.picImg.setImageDrawable(post.getImage());
        holder.poetName.setText(post.getTitle());

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder{
        private ImageView picImg;
         private TextView poetName;


        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            picImg=(ImageView) itemView.findViewById(R.id.pic_poet_img);
            poetName=(TextView) itemView.findViewById(R.id.name_poet_title);
        }
    }

}
