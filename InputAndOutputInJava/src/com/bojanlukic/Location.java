package com.bojanlukic;

import java.util.LinkedHashMap;
import java.util.Map;


public class Location {
    private final int locationID;
    private final String locDescription;
    private final Map<String, Integer> exits;

    //constructor for class Location
    public Location(int locationID, String locDescription, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.locDescription = locDescription;
        if(exits != null) {
            this.exits = new LinkedHashMap<String, Integer>(exits);
        } else {
            this.exits = new LinkedHashMap<String, Integer>();
        }
        this.exits.put("Q", 0);
    }


    public int getLocationID() {
        return locationID;
    }

    public String getLocDescription() {
        return locDescription;
    }

    public Map<String, Integer> getExits() {
        return new LinkedHashMap<String, Integer>(exits);
    }
    protected void addExit(String direction, int location) {
        exits.put(direction, location);
    }
}
