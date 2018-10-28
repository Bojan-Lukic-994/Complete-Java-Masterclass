package com.bojanlukic;

public class Bed {

    private int pillows;
    private int sheets;
    private String shape;

    //constructor for Bed class
    public Bed(int pillows, int sheets, String shape) {
        this.pillows = pillows;
        this.sheets = sheets;
        this.shape = shape;
    }

    public void makeBed() {
        System.out.println("Making up my bed");
    }

    //gets the number of the pillows in the bed
    public int getPillows() {
        return pillows;
    }

    //gets the number of sheets in the bed
    public int getSheets() {
        return sheets;
    }

    //gets the shape of the bed
    public String getShape() {
        return shape;
    }
}
