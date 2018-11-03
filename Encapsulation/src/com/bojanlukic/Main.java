package com.bojanlukic;

public class Main {

    public static void main(String[] args) {

   /* //initiates the player parameters
    Player player = new Player();
    player.name = "Skabo";
    player.health = 100;
    player.weapon = "Axe";

    //initiates the damage
    int damage = 35;
    //shows the remaining health
    player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthReamining());
        */

   //initiates the player parameters
   EnchancedPlayer player = new EnchancedPlayer("Skabo", 75, "Axe");

        //prints out player's initial health
        System.out.println("Player's initial health is " + player.getHealth());

        //prints out player's weapon
        System.out.println("Player's weapon is " + player.getWeapon() );
    }


}
