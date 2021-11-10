package lesson20;

import java.util.ArrayList;
import java.util.List;

public class Lesson20Generics {

    public static void main(String[] args) {


        // BAD PRACTICE!
        List myList = new ArrayList();
        myList.add("SomeText");
        myList.add(5);

//        List<Object> myObjects = new ArrayList<Object>();

        // myList.set(1, "String");

        String someText = (String) myList.get(0);
        Integer someinteger = (Integer) myList.get(1);

        // Equals to
        List<String> myList2 = new ArrayList<String>();

        // String someText2 = myList2.get(0);


    }
}
