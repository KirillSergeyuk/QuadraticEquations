package QE;

import QE.Discriminant;
import QE.ReaderFunction;

public class Roots {
    private double x1, x2;
    public double getX1(int a, int b, double dscr) {
        x1 = (-b + Math.sqrt(dscr)) / (2 * a);
        if(x1 == 0) x1 = 0;
        return x1;
    }

    public double getX2(int a, int b, double dscr) {
        x2 = (-b - Math.sqrt(dscr)) / (2 * a);
        if(x2 == 0) x2 = 0;
        return x2;
    }

    public void sayRoots(int a, int b, double dscr){
        System.out.println("Ваши корни: " + getX1(a, b, dscr) + " " + getX2(a, b, dscr));
    }

}
