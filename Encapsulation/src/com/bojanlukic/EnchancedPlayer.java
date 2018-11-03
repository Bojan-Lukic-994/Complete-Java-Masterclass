package com.bojanlukic;

public class EnchancedPlayer {

    private String name;
    private int health;
    private String weapon;

    public EnchancedPlayer(String name, int health, String weapon) {
        this.name = name;

        //checking if health is between 0 and 100
        if (health > 0 && health <= 100) {
            this.health = health;
        } else {
            System.out.println("Invalid number inserted. Health ust be defined between 0 and 100");
        }
        this.weapon = weapon;
    }

    //checks how much health player lose
    public void loseHealth(int damage) {
        this.health = this.health - damage;

        //checks if the health is less or eqaul than 0
        if (this.health <= 0) {
            System.out.println("Player is knocked out");
        }
    }

    //gets the player's health
    public int getHealth() {
        return health;
    }

    //gets the player's name
    public String getName() {
        return name;
    }

    //gets the player's weapon
    public String getWeapon() {
        return weapon;
    }
}
