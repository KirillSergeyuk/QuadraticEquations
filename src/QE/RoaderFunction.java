package QE;

import java.util.Scanner;

class ReaderFunction {
    Scanner scan = new Scanner(System.in);
    private String equation;
    public void hello(){
        System.out.println("Привет Бро!!! Это праграмма поможет тебе решать квадратные уровнения!");
        System.out.print("Введите ваше уравнение: ");
        setEquation();
    }

    public void setEquation(){
        equation = scan.nextLine();
    }

    public String getEquation(){
        return equation;
    }

}
