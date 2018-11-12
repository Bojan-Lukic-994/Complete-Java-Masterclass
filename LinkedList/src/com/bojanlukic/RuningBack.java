package com.bojanlukic;

public class RuningBack {
    private String name;
    private double speed;

    //constructor for RuningBack
    public RuningBack(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    //gets the name of the RuningBack
    public String getName() {
        return name;
    }

    //sets the name of the RuningBack
    public void setName(String name) {
        this.name = name;
    }

    //gets the speed of the RuningBack
    public double getSpeed() {
        return speed;
    }

    //sets the speed of the RuningBack
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
