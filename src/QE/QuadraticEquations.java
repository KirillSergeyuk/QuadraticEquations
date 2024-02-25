package QE;

public class QuadraticEquations {
    public static void main(String[] args) {
        ReaderFunction rf = new ReaderFunction();
        Roots root  = new Roots();
        FormattingEquation fe = new FormattingEquation();
        rf.hello();
        fe.format(rf.getEquation());
        root.sayRoots(fe.getA(), fe.getB(), root.dscr(fe.getA(), fe.getB(), fe.getC()));
        System.out.println("Пока!");
    }
}
