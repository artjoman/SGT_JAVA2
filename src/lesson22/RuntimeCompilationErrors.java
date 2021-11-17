package lesson22;

import java.util.ArrayList;
import java.util.List;

public class RuntimeCompilationErrors {

    public static void main(String[] args) {
        float var1 = 1.45f;
        String var1String = "Abcdef";

        // This will cause a compilation error
//        float var2 = var1 + var1String;


        List myList = new ArrayList();
        myList.add("Some String");
        myList.add(new Float(1.45f));

        float var3 = (float) (myList.get(0));


        List<String> myList2 = new ArrayList<>();
        myList2.add("Some other string");
//        myList2.add(5); // compilation error
//        int someInt = (int) myList2.get(0); // compilation error


    }
}
