package com.adrinweb.poemfr;

import android.content.Context;

import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.List;

public class DataFakeGenerator {
    public static List<Post> getData(Context context){
        List<Post> posts=new ArrayList<>();
        for (int i=1 ; i <= 20 ; i++){
            Post post = new Post();
            post.setId(i);
            switch (i){
                case 1:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.anvari,null));
                    post.setTitle("انوری");
                    post.setPoetId(i);
                    break;
                case 2:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.attar,null));
                    post.setTitle("عطار");
                    post.setPoetId(i);
                    break;
                case 3:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.babataher,null));
                    post.setTitle("باباطاهر");
                    post.setPoetId(i);
                    break;
                case 4:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.bidel,null));
                    post.setTitle("بیدل");
                    post.setPoetId(i);
                    break;
                case 5:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.ebnehesam,null));
                    post.setTitle("ابن حسام");
                    post.setPoetId(i);
                    break;
                case 6:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.eraghi,null));
                    post.setTitle("عراقی");
                    post.setPoetId(i);
                    break;
                case 7:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.farrokhi,null));
                    post.setTitle("فرخی");
                    post.setPoetId(i);
                    break;
                case 8:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.ferdousi,null));
                    post.setTitle("فردوسی");
                    post.setPoetId(i);
                    break;
                case 9:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.gilani,null));
                    post.setTitle("گیلانی");
                    post.setPoetId(i);
                    break;
                case 10:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.hafez,null));
                    post.setTitle("حافظ");
                    post.setPoetId(i);
                    break;
                case 11:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.khaghani,null));
                    post.setTitle("خاقانی");
                    post.setPoetId(i);
                    break;
                case 12:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.khayyam,null));
                    post.setTitle("خیام");
                    post.setPoetId(i);
                    break;
                case 13:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.moulavi,null));
                    post.setTitle("مولوی");
                    post.setPoetId(i);
                    break;
                case 14:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.parvin,null));
                    post.setTitle("پروین اعتصامی");
                    post.setPoetId(i);
                    break;
                case 15:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.razi,null));
                    post.setTitle("راضی");
                    post.setPoetId(i);
                    break;
                case 16:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.saadi,null));
                    post.setTitle("سعدی");
                    post.setPoetId(i);
                    break;
                case 17:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.saeb,null));
                    post.setTitle("صائب");
                    post.setPoetId(i);
                    break;
                case 18:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.sanaee,null));
                    post.setTitle("سنایی");
                    post.setPoetId(i);
                    break;
                case 19:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.shahriar,null));
                    post.setTitle("شهریار");
                    post.setPoetId(i);
                    break;
                case 20:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.vahshi,null));
                    post.setTitle("وحشی بافقی");
                    post.setPoetId(i);
                    break;

            }
            posts.add(post);

        }
        return posts;
    }
}
