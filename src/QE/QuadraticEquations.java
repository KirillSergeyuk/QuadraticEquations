package QE;

public class QuadraticEquations {
    public static void main(String[] args) {
        ReaderFunction rf = new ReaderFunction();
        Roots root  = new Roots();
        rf.hello();
        root.sayRoots(rf.getA(), rf.getB(), root.dscr(rf.getA(), rf.getB(), rf.getC()));
        System.out.println("Пока!");
    }
}
