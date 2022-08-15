package com.example.recyclerviewsample;

public class Character {
    private final String name;
    private final int imageRes;

    public Character(String name, int imageRes) {
        this.name = name;
        this.imageRes = imageRes;
    }

    public String getName() {
        return name;
    }

    public int getImageRes() {
        return imageRes;
    }
}
