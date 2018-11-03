package com.bojanlukic;

public class Player {

    public String name;
    public int health;
    public String weapon;

    //checks how much health player lose
    public void loseHealth (int damage) {
        this.health = this.health - damage;

        //checks if the health is less or eqaul than 0
        if (this.health <= 0) {
            System.out.println("Player is knocked out");
        }
    }

    public int healthReamining() {
        return this.health;
    }

}
