package com.bojanlukic;

//initiates class Film
class Film {
    private String name;

    //initiates the name of the film
    public Film(String name) {
    }

    //gets the plot of the film
    public String plot() {
        return "No plot";
    }

    public String getName() {
        return this.name;
    }
}


//initiates class Avatar which extends class Film
class StarWars extends Film {

    //name of the film
   public StarWars() {
       super("Star Wars");
   }

    //plot of the film Star Wars
    public String plot() {
        return "Battle for the universe";
    }
}


//initiates class LOTR which extends class Film
class LOTR extends Film {

    //name of the film
    public LOTR() {
        super("Lord of The Rings");
    }

    //plot of the film
    @Override
    public String plot() {
        return "Destroying the ring of power";
    }
}


//initiates class Batman which extends class Film
class Batman extends Film {

    //name of the film
    public Batman() {
        super("Batman");
    }

    //plot of the film
    @Override
    public String plot() {
        return "Batman tries to save Gotham city";
    }
}


public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++){
            Film film = radnomFilm();
            System.out.println("Film #" + i + ": " + film.getName() + "\n" + "Plot: " + film.plot() + "\n");
        }


    }

    public static Film radnomFilm() {

        //initiates random number of the film
        int randomNum = (int) (Math.random() * 3) + 1;
        System.out.println("Random number was " + randomNum);

        //based on the random number, prints out the name of the film
        switch (randomNum) {
            case 1:
                return new StarWars();

            case 2:
                return new LOTR();

            case 3:
                return new Batman();

        }

        return null;
    }
}
