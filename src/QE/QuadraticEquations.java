package QE;

public class QuadraticEquations {
    public static void main(String[] args) {
        ReaderFunction rf = new ReaderFunction();
        Discriminant d = new Discriminant();
        Roots root  = new Roots();
        rf.hello();
        root.sayRoots(rf.getA(), rf.getB(), d.dscr(rf.getA(), rf.getB(), rf.getC()));
    }
}
