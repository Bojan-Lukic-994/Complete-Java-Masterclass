package com.bojanlukic;

public class Main {

    public static void main(String[] args) {
    Cinema cinema = new Cinema("In Ng", 10, 15);
        System.out.println(cinema.getCinName());
        cinema.getSeats();
        cinema.wantedSeat("B02");
    }
}
