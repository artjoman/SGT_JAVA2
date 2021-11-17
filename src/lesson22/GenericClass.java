package lesson22;

import java.util.Date;

public class GenericClass<T1> {

    private T1 birthDate;


    <T2> String formatBirthdate(T2 format) {

        if( format instanceof String ) {
            System.out.println("it is a string");
        } else if ( format instanceof Date) {
            System.out.println("it is a Date");
        }
        return "result";
    }


    public T1 getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(T1 birthDate) {
        this.birthDate = birthDate;
    }


}
