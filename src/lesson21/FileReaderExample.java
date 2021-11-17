package lesson21;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderExample {



    public static void main(String[] args) {
        Path myPath = Paths.get("C:/dev/JAVA2");
        int count = myPath.getNameCount();
        System.out.println(count);

        while ( myPath.iterator().hasNext() ) {
            System.out.println(myPath.iterator().next().getFileName());
        }
    }

}
