package com.bojanlukic;

public class Roof {

    private int height;
    private String color;

    //constructor for Roof class
    public Roof(int height, String color) {
        this.height = height;
        this.color = color;
    }

    //gets the height of the roof
    public int getHeight() {
        return height;
    }

    //gets the color of the roof
    public String getColor() {
        return color;
    }
}
