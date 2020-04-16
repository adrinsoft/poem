package com.adrinweb.poemfr;

import android.content.Context;

import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.List;

public class DataFakeGenerator {
    public static List<Post> getData(Context context){
        List<Post> posts=new ArrayList<>();
        for (int i=1;i<=20;i++){
            Post post=new Post();
            post.setId(i);
            switch (i){
                case 1:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.anvari,null));
                    post.setTitle("انوری");
                    post.setPoetId(1);
                    break;
                case 2:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.attar,null));
                    post.setTitle("عطار");
                    break;
                case 3:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.babataher,null));
                    post.setTitle("باباطاهر");
                    break;
                case 4:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.bidel,null));
                    post.setTitle("بیدل");
                    break;
                case 5:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.ebnehesam,null));
                    post.setTitle("ابن حسام");
                    break;
                case 6:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.eraghi,null));
                    post.setTitle("عراقی");
                    break;
                case 7:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.farrokhi,null));
                    post.setTitle("فرخی");
                    break;
                case 8:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.ferdousi,null));
                    post.setTitle("فردوسی");
                    break;
                case 9:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.gilani,null));
                    post.setTitle("گیلانی");
                    break;
                case 10:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.hafez,null));
                    post.setTitle("حافظ");
                    break;
                case 11:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.khaghani,null));
                    post.setTitle("خاقانی");
                    break;
                case 12:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.khayyam,null));
                    post.setTitle("خیام");
                    break;
                case 13:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.moulavi,null));
                    post.setTitle("مولوی");
                    break;
                case 14:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.parvin,null));
                    post.setTitle("پروین اعتصامی");
                    break;
                case 15:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.razi,null));
                    post.setTitle("راضی");
                    break;
                case 16:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.saadi,null));
                    post.setTitle("سعدی");
                    break;
                case 17:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.saeb,null));
                    post.setTitle("صائب");
                    break;
                case 18:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.sanaee,null));
                    post.setTitle("سنایی");
                    break;
                case 19:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.shahriar,null));
                    post.setTitle("شهریار");
                    break;
                case 20:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.vahshi,null));
                    post.setTitle("وحشی بافقی");
                    break;

            }
            posts.add(post);

        }
        return posts;
    }
}
