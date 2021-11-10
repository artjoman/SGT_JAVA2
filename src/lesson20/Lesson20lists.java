package lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson20lists {


    public static void main(String[] args) {

        List<String> streets = new ArrayList<String>();

        streets.add("Struktoru");

        streets.get(0);// Struktoru

        streets.add("Rupniecibas"); // index 1

        streets.set(0, "Olivu");

        System.out.println(streets);


        // concatenating 2 arrays
        List<String> newArray = Arrays.asList(new String[]{ "someValue", "otherValue" });
        streets.addAll(newArray);

        System.out.println(streets);

    }
}
