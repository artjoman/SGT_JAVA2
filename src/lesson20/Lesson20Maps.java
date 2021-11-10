package lesson20;

import java.util.HashMap;
import java.util.Map;

public class Lesson20Maps {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<String, Integer>();

        students.put("Artjoms", 31);
        students.get("Artjoms"); // 31
        students.containsKey("Artjoms"); // true
        students.containsValue(31); // true

        students.put("Artjoms", 99);

    }

}
