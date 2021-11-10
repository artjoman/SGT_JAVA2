package lesson19;

import lesson19.exceptions.DBException;
import lesson19.exceptions.DBPasswordAllCapitalsException;
import lesson19.exceptions.DBPasswordIncorrectException;

public class Lesson19 {

    public static void main(String[] args) {
        Lesson19Exceptions exceptions = new Lesson19Exceptions();

        exceptions.divideByNumber(100, 50); // 2

        try {
            exceptions.divideByNumber(999, 0); // An error will be thrown
        } catch (ArithmeticException e) {
            System.out.println("Handle the code somewhat differently");
        }

        try {
            exceptions.multiplyByTwo(5);
        } catch ( ArithmeticException e) {
            System.out.println("Even wrapped exceptions will be handled");
        } finally {
            System.out.println("This block will be always called!");
        }

        System.out.println("If there is some other code after the try/catch/finally - it will be executed");

        try {
            System.out.println("Connecting to the Database");
            throw new DBPasswordAllCapitalsException();
        } catch (DBException e) {
            // handle this exception
            System.out.println("Our exception has been properly handled");

            if( e instanceof DBPasswordAllCapitalsException) {
                System.out.println("Exception is of type DBPasswordAllCapitalsException");
            } else if( e instanceof DBPasswordIncorrectException) {
                System.out.println("Password is incorrect");
            }
        }

        try {
            throw new DBException("Some custom message");
        } catch ( DBException e){
            System.out.println("There was a DB Exception " + e.getMessage());
        }


        try {
            exceptions.multiplyByTwo(5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Something after printing stacktrace");

        boolean userAuthenticated = true;

        assert userAuthenticated;

        System.out.println("user is authenticated");

        userAuthenticated = false;

        try {
            assert userAuthenticated;
        } catch (AssertionError e) {
            System.out.println("user is not authenticated");
        }



    }



    int method1() {
        try {
            System.out.println("Something");
            return 0;
        } catch (Exception e) {
            // more handling can be added here
            throw e;
        }
    }

    // Would be equal to:
    int method2 () throws Exception {
        System.out.println("Something");
        return 0;
    }



}
