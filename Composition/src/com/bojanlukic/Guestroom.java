package com.bojanlukic;

public class Guestroom {

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Roof roof;
    private Bed bed;
    private TableDesk tableDesk;

    //constructor for Guestroom class
    public Guestroom(String name, Wall wall1, Wall wall2, Roof roof, Bed bed, TableDesk tableDesk) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.roof = roof;
        this.bed = bed;
        this.tableDesk = tableDesk;
    }

    public TableDesk getTableDesk() {
        return this.tableDesk;
    }

    //method for making bed
    public void makeBed() {
        System.out.println("Making bed");
    }
}
