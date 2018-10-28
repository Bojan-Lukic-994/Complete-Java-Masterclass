package com.bojanlukic;

public class TableDesk {

    private String material;
    private String shape;
    private int drawers;
    private int height;

    //constructor for TableDesk
    public TableDesk(String material, String shape, int drawers, int height) {
        this.material = material;
        this.shape = shape;
        this.drawers = drawers;
        this.height = height;
    }

    //method that opens the drawer
    public void open() {
        System.out.println("Opening drawer");
    }

    //gets the material of the table desk
    public String getMaterial() {
        return material;
    }

    //gets the shape of the table desk
    public String getShape() {
        return shape;
    }

    //gets the number of drawers of the table desk
    public int getDrawers() {
        return drawers;
    }

    //gets the height of the table desk
    public int getHeight() {
        return height;
    }
}
