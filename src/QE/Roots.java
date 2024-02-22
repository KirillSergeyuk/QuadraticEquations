package QE;

public class Roots {
    private double x1, x2, x;
    public double dscr(int a, int b, int c){
        return (Math.pow(b,2) - 4L * a * c);
    }
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

    public double getX(int a, int b) {
        x = (double) -b / (2 * a);
        if(x == 0) x = 0;
        return x;
    }
    public void sayRoots(int a, int b, double dscr){
        if(dscr < 0){
            System.out.println("Нет корней");
        }   else if(dscr == 0){
            System.out.println("Вашь корень: " + getX(a, b));
        }   else {
            System.out.println("Ваши корни: " + getX1(a, b, dscr) + " " + getX2(a, b, dscr));
        }

    }

}
