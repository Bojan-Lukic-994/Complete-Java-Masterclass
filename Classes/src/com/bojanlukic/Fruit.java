package com.bojanlukic;

public class Fruit {

    //initializes new constructors of Fruit class
    private int numberOfFruits;
    private int weight;
    private String shape;
    public String color;


    //getters and setters for constructor color
    public void setColor (String color) {
        String validColor = color.toLowerCase();
        //checks if the color is valid
        if (validColor.equals("Green") || validColor.equals("Yellow") || validColor.equals("Red")) {
            this.color = color;
        } else {
            this.color = "Unknown";
        }
    }

    public String getColor() {
        this.color = color;
        return color;
    }



    //getters and setters for constructor shape
    public void setShape (String shape) {
        this.shape = shape;
    }

    public String getShape () {
        this.shape = shape;
        return shape;
    }
}
