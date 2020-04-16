package com.adrinweb.poemfr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
        holder.poetId = post.getPoetId();
    }
    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder{
        private ImageButton picImg;
         private TextView poetName;
         private int poetId;
        public NewsViewHolder(@NonNull View itemView) {
                super(itemView);
            poetName = (TextView) itemView.findViewById(R.id.name_poet_title);
            picImg = (ImageButton) itemView.findViewById(R.id.pic_poet_img);
            picImg.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          showPoem();
                      }
                  }
            );
        }
        private void showPoem(){
            Toast.makeText(context,"Poet Id: " + poetId ,Toast.LENGTH_LONG).show();
        }
    }

}
