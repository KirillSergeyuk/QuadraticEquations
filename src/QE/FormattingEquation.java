package QE;

import java.util.Objects;

public class FormattingEquation {
    private String[] odds;
    private int a = 0,b = 0,c = 0;
    public void format(String equation){
        equation = equation.replace(" = 0", "");
        equation = equation.replace("+ ", "");
        equation = equation.replace("- ", "-1");
        equation = equation.replace("-", "-1");
        System.out.println(equation);
        odds =  equation.split(" ");
        System.out.println(odds.length);
        for(int i = 0; i < odds.length; i++){
            if(odds[i].contains("x2")){
                odds[i] = odds[i].replace("x2", "");
                if(odds[i].isEmpty()){
                    setA(1);
                }   else{
                    setA(Integer.parseInt(odds[i]));
                }
                continue;
            }
            if(odds[i].contains("x")){
                odds[i] = odds[i].replace("x", "");
                if(odds[i].isEmpty()){
                    setB(1);
                }   else{
                    setB(Integer.parseInt(odds[i]));
                }
                continue;
            }
            if((!odds[i].contains("x")) && (!odds[i].contains("x2"))){
                setC(Integer.parseInt(odds[i]));
            }
        }
    }
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
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
