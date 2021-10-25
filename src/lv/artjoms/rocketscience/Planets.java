package lv.artjoms.rocketscience;

public class Planets {


    public static void main(String[] args) {
        System.out.println(calcDistance(3,5,10,8));
        double f = calcForce(100, 3,5,200, 10,8);
        System.out.println(f);
    }
    private static double calcDistance(int x1, int y1, int x2, int y2 ) {
        return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }

    private static double calcForce(int m1, int x1, int y1, int m2, int x2, int y2 ) {
        double G = 6.67e-11;
        return (G*m1*m2) / ( calcDistance(x1, y1, x2, y2) * calcDistance(x1, y1, x2, y2));
    }
}
