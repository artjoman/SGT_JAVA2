package lesson9;

public class FinalMethods {

    private int someVar;

    // initialized during declaration
    final int CONSTANT_PI = 3;

    // non initialized during declaration
    // HAS TO be initalized in ALL the constructors
    final int CONSTANT_NOINIT;

    public FinalMethods() {
        CONSTANT_NOINIT = 5;
    }

    public FinalMethods(int someVar) {
        CONSTANT_NOINIT = 6;
        this.someVar = someVar;
    }

    public int getSomeVar() {
        return someVar;
    }

    public void setSomeVar(int someVar) {
        this.someVar = someVar;
    }

    public final void printHello(){
        System.out.println("Hello!");
    }
}

class ExtendedFinalMethods extends FinalMethods {

    // FINAL METHODS CANNOT BE OVERRIDEN
//    @Override
//    public void printHello() {
//        System.out.println("Bye!");
//    }
}