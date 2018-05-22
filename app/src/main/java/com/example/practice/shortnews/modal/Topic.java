package com.example.practice.shortnews.modal;

/**
 * Created by yamini on 11/5/18.
 */

public class Topic {
    int image;
    String image_name;

    public Topic(int image, String image_name) {
        this.image = image;
        this.image_name = image_name;
    }

    public int getImage() {
        return image;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }
}
