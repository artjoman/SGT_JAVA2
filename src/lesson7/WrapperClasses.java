package lesson7;

public class WrapperClasses {




    public static void main(String[] args) {
        int simpleInt = 5;
        Integer.toString(simpleInt);
        Integer.reverseBytes(simpleInt);

    }

    private int findMinimum(int a, int b) {
        return Integer.min(a,b);
    }

}
