package com.adrinweb.poemfr;

import android.graphics.drawable.Drawable;

public class Post {
    private int id;
    private Drawable image;
    private String title;

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
