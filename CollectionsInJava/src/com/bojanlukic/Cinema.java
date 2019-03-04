package com.bojanlukic;

import java.util.*;

public class Cinema {
    private final String cinName;
    private Collection<Seat> seats = new LinkedList<>();


    //constructor for class Cinema
    public Cinema (String cinName, int numRows, int seatInRow) {
        this.cinName = cinName;

        //inserts number of seats
        int lastRow = 'A' + (numRows -1);
        for (char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatInRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    //returns the name of the Cinema
    public String getCinName () {
        return cinName;
    }

    //checks if wanted seat is available
    public boolean wantedSeat (String seatNumber) {
        Seat wantedSeat = null;
        for(Seat seat : seats) {
            if(seat.getSeatNumber().equals(seatNumber)) {
                wantedSeat = seat;
                break;
            }
        }

        //returns false if wanted seat is not available
        if(wantedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return wantedSeat.reserveSeat();
    }

    //returns the number of the seats
    public void getSeats() {
        for(Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        //constructor for Seat class
        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }


        @Override
        public int compareTo (Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        //reserves the wanted seat
        public boolean reserveSeat () {
            if(!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " is reserved");
                return true;
            } else {
                return false;
            }
        }

        //cancels the previously reserved seat
        public boolean cancelSeat () {
            if(this.reserved) {
                this.reserved = false;
                System.out.println("Seat reservation " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }



















}
