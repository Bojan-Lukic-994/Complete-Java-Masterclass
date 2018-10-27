package com.bojanlukic;

public class Apple extends Fruit {

    //characteristics related only to class Apple, not to class Fruit
    private String color;
    private String type;

    public Apple(int count, int weight, String color, String type) {
        super("Apple", count, weight);
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
