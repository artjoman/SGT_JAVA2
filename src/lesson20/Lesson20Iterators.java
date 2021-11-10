package lesson20;

import java.util.*;

public class Lesson20Iterators {

    public static void main(String[] args) {

        List<String> planets = new ArrayList<String>();

        planets.add("Earth");
        planets.add("Mars");
        planets.add("Venus");

        Iterator planetIterator = planets.iterator();

        while ( planetIterator.hasNext() ) {
            System.out.println(planetIterator.next());
        }


        Set<String> birds = new TreeSet<String>();
        birds.add("Parrot");
        birds.add("Eagle");
        birds.add("Sparrow");
        birds.add("Pigeon");

        Iterator birdsIterator = birds.iterator();

        while ( birdsIterator.hasNext() ) {
            System.out.println(birdsIterator.next());
        }

        Queue<String> lidl = new LinkedList<>();

        lidl.add("A");
        lidl.add("B");
        lidl.add("C");

        System.out.println(lidl);

        Iterator lidlIterator = lidl.iterator();

        while ( lidlIterator.hasNext() ) {
            System.out.println(lidlIterator.next());
        }

    }
}
