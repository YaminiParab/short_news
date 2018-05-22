package com.example.practice.shortnews.modal;

/**
 * Created by yamini on 22/5/18.
 */

public class News {
    private int image;
    private String title;
    private String short_description;
    private String date;

    public News(int image, String title, String short_description, String date) {
        this.image = image;
        this.title = title;
        this.short_description = short_description;
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
