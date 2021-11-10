package lesson19;

public class Lesson19Exceptions {

    public double multiplyByTwo( double someNumber  ) {
        this.divideByNumber(7, 0);
        return someNumber * 2;
    }

    public double divideByNumber( int dividable, int divider ) throws ArithmeticException {
        try {
            return dividable / divider;
        } catch (ArithmeticException e) {
            System.out.println("There was an arithmetic exception. Exception text is:" + e.getMessage());
            throw e;
        }
    }



}
