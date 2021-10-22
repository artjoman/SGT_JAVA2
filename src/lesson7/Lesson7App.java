package lesson7;

import lv.artjoms.rocketscience.Engine;

import java.util.ArrayList;

public class Lesson7App {

    public static void main(String[] args) {

        SpaceShip spaceShip = new SpaceShip(new Engine(), "Escape Plan", 100);

        // If you would like to add people already in constructor
        ArrayList<String> people =
                new ArrayList<>();
        people.add("Bezos");
        people.add("Musk");
        people.add("Brenson");

        PeopleSpaceShip peopleSpaceShip =
                new PeopleSpaceShip(new Engine(), "Elon", 100, 3,
                        new ArrayList<String>());

        // How to send Bezos, Musk and Brenson
        peopleSpaceShip.getNamesOfPeople().add("Bezos");
        peopleSpaceShip.getNamesOfPeople().add("Musk");
        peopleSpaceShip.getNamesOfPeople().add("Brenson");

        // Add some Cargo
        peopleSpaceShip.addCargo();
        // Should return Integer
        peopleSpaceShip.addCargo(200);

        // Example of overloading the methods
        System.out.println(100);
        System.out.println("String");
        System.out.println(peopleSpaceShip);


        System.out.println(peopleSpaceShip);


        printInfoAboutSpaceShip(spaceShip);
        printInfoAboutSpaceShip(peopleSpaceShip);

        // prints just "Cargo Added"
        SpaceShip spaceShip2 = new SpaceShip();
        spaceShip2.addCargo();

        // Will print 2 lines
        // prints just "Cargo Added"
        // We have overriden method inside PeopleSpaceShip
        SpaceShip spaceShip3 = new PeopleSpaceShip();
        spaceShip3.addCargo();


        // UPCASTING
        SpaceShip castedSpaceShip = (SpaceShip) peopleSpaceShip;

        // DOWNCASTING
        // IS NOT POSSIBLE TO USE
//        PeopleSpaceShip castedPeopleSpaceShip = (PeopleSpaceShip) spaceShip;
//        castedPeopleSpaceShip.getNamesOfPeople();
    }

    public static void printInfoAboutSpaceShip( SpaceShip spaceShip ){
        System.out.println("I have a SpaceShip: " + spaceShip);
    }
}
