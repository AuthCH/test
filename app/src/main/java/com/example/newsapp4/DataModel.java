package com.example.newsapp4;

public class DataModel {
    private String title;
    private int image;
    public DataModel(String title, int image) {
        this.image = image;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }



    public int getImage() {
        return image;
    }
}
