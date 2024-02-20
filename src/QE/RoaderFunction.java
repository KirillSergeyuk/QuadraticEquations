package QE;

import java.util.Scanner;

class ReaderFunction {
    Scanner scan = new Scanner(System.in);
    private int a,b,c;
    public void hello(){
        System.out.println("Привет Бро!!! Это праграмма помодет тебе решать квадратные уровнения!");
        System.out.println("Это пока что первая версия так что не судите строго)");
        setA();
        setB();
        setC();
        System.out.printf("Ваше уравнение: %dх2 + (%d)x + (%d) = 0", a, b, c);
        System.out.println();
    }



    public void setA(){
        System.out.print("Введите коэфицент a: ");
        a = scan.nextInt();
    }

    public void setB(){
        System.out.print("Введите коэфицент b: ");
        b = scan.nextInt();
    }

    public void setC(){
        System.out.print("Введите коэфицент c: ");
        c = scan.nextInt();
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
