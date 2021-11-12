package lesson21;

import java.util.*;

public class Lesson21Dequeue {

    // main method
    public static void main(String[] args) {
        Deque<String> myDeque = new ArrayDeque<String>();

        myDeque.addFirst("1");
        myDeque.addFirst("2");
        myDeque.addFirst("3");


        // I want to get #3
        String removedElement = myDeque.removeFirst(); //3
        System.out.println(removedElement);

        // If i want to get #2
        removedElement = myDeque.removeFirst(); //2
        System.out.println(removedElement);

        // now adding 4 on top
        myDeque.addFirst("4");

        // If i want to get 1
        removedElement = myDeque.removeLast(); // returns 1;
        System.out.println(removedElement);


        List<CustomObject> myList = new ArrayList<>();

        CustomObject co1 = new CustomObject();
        co1.id = 1;

        CustomObject co2 = new CustomObject();
        co1.id = 2;

        myList.add(co1);
        myList.add(co2);

        Iterator mlIterator = myList.iterator();

        while ( mlIterator.hasNext() ) {
            System.out.println(mlIterator.next());
        }

        String pet1 = new String("parrot");
        String pet2 = new String("penguin");
        String pet3 = pet1;

        if( pet1 == new String("parrot") ) {
           // do something
            System.out.println("I was wrong");
        }
        // the same as
        if ( pet1.equals(pet2) ) {
            // do something
        }

    }

}

class CustomObject {
    String customField;
    int customInt;
    int id;

    public CustomObject() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomObject that = (CustomObject) o;
        return customInt == that.customInt && id == that.id && Objects.equals(customField, that.customField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customField, customInt, id);
    }
}
