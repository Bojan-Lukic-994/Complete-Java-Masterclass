package com.bojanlukic;

public class Fruit {

    private String name;
    private int count;
    private int weigth;
    private int size;

    public Fruit(String name, int count, int weight) {
        this.name = name;
        this.count = count;
        this.weigth = weight;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getWeight() {
        return weigth;
    }

}
