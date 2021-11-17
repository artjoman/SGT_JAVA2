package lesson21;

import java.io.*;
import java.util.Scanner;

public class Streams {

    public static void main(String[] args) {

        // STDOUT
        System.out.println("This is System STDOUT");

        // STDIN
        //
        System.out.println("Please enter some character first");
        Scanner scanner = new Scanner(System.in);
        String sysIn = scanner.next();

        // STDERR
        // throw new Exception("Throwing exception into STDERR stream");


        File newFile = new File("myOutput.txt");

        try {
            BufferedWriter writer = new BufferedWriter( new FileWriter("filename.txt") );
            writer.write(" This is a new line to append to the file "); // >
            writer.append(" This is something new "); // >>
            writer.close();
        } catch ( IOException e ) {
            System.out.println("File does not exist");
        }
    }
}
