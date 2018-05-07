package com.example.practice.shortnews;

/**
 * Created by yamini on 7/5/18.
 */

public class Category {
    private  String title;
    private int image;

    public Category(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}
