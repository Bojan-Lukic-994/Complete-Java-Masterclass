package com.bojanlukic;

public class Main {

    //challenge - exercise

    public static void main(String[] args) {

        Wall wall1 = new Wall("red");
        Wall wall2 = new Wall("blue");
        Roof roof = new Roof(250, "white");
        Bed bed = new Bed(5,3,"square");
        TableDesk tableDesk = new TableDesk("wood", "square", 4, 180);

        //initialize new guestroom
        Guestroom guestroom = new Guestroom("Jacobs", wall1, wall2, roof, bed, tableDesk);

        guestroom.makeBed();
        guestroom.getTableDesk().open();
    }
}
