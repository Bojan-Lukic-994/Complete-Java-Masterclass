package com.bojanlukic;

import java.util.ArrayList;
import java.util.List;

//creates new class RunningBack that implements Interface INFLStorage
public class RunningBack implements INFLStorage {

    //initiates parameters for class RunningBack
    private String name;
    private int strength;
    private int speed;
    private String team;

    //constructor for class RunningBack
    public RunningBack(String name, int strength, int speed, String team) {
        this.name = name;
        this.strength = strength;
        this.speed = speed;
        this.team = team;
    }

    //gets the name of the RunningBack
    public String getName() {
        return name;
    }

    //sets the name of the RunningBack
    public void setName(String name) {
        this.name = name;
    }

    //gets the strength of the RunningBack
    public int getStrength() {
        return strength;
    }

    //sets the strength of the RunningBack
    public void setStrength(int strength) {
        this.strength = strength;
    }

    //gets the speed of the RunningBack
    public int getSpeed() {
        return speed;
    }

    //sets the speed of the RunningBack
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //gets the team of the RunningBack
    public String getTeam() {
        return team;
    }

    //sets the team of the RunningBack
    public void setTeam(String team) {
        this.team = team;
    }

    //convert RunningBack parameters to String
    @Override
    public String toString() {
        return "RunningBack{" +
                "name = '" + name + '\'' +
                ", strength = " + strength +
                ", speed = " + speed +
                ", team = '" + team + '\'' +
                '}';
    }

    //method that write values to the RunningBack parameters
    @Override
    public List<String> write() {

        //creates new ArrayList of String
        List<String> values = new ArrayList<String>();

        //adds name, team, speed and strength of given RunningBack
        values.add(0, this.name);
        values.add(1, this.team);
        values.add(2,"" + this.speed);
        values.add(3,"" + this.strength);

        //return given values
        return values;
    }

    //method that saves values of the RunningBack parameters
    @Override
    public void store(List<String> savedInfo) {

        //checks if savedInfo is equal to null and if size of savedInfo is bigger than 0
        if (savedInfo != null && savedInfo.size() > 0) {

            //saves the name, team, speed and strength of given RunningBack
            this.name = savedInfo.get(0);
            this.team = savedInfo.get(1);
            this.speed = Integer.parseInt(savedInfo.get(2));
            this.strength = Integer.parseInt(savedInfo.get(3));
        }

    }
}
