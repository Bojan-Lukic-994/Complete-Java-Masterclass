package com.bojanlukic;

import java.util.ArrayList;
import java.util.List;

//creates new class Team that implements Interface INFLStorage
public class Team implements INFLStorage {

    //initiates parameters for class Team
    private String name;
    private int players;

    //constructor for class Team
    public Team(String name, int players) {
        this.name = name;
        this.players = players;
    }

    //gets the name of the Team
    public String getName() {
        return name;
    }

    //sets the name of the Team
    public void setName(String name) {
        this.name = name;
    }

    //gets number of players of the Team
    public int getPlayers() {
        return players;
    }

    //sets number of players of the Team
    public void setPlayers(int players) {
        this.players = players;
    }


    //method that write values to the Team parameters
    @Override
    public List<String> write() {

        //creates new ArrayList of String
        ArrayList<String> values = new ArrayList<String>();

        //adds name and number of players of Team class
        values.add(0, this.name);
        values.add(1, "" + this.players);

        //return given values
        return values;
    }

    //method that saves values of the Team parameters
    @Override
    public void store(List<String> savedInfo) {

        //checks if savedInfo is equal to null and if size of savedInfo is bigger than 0
        if (savedInfo != null && savedInfo.size() > 0) {

            //saves the name and number of players of Team class
            this.name = savedInfo.get(0);
            this.players = Integer.parseInt(savedInfo.get(1));
        }
    }

    //convert Team parameters to String
    @Override
    public String toString() {
        return "Team{" +
                "name = '" + name + '\'' +
                ", players = " + players +
                '}';
    }
}
