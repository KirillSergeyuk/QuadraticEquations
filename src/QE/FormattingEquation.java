package QE;

import java.util.Objects;

public class FormattingEquation {
    private boolean isEqualTo = true;
    private String[] odds;
    private int a = 0,b = 0,c = 0;
    public void format(String equation){
        equation = equation.replace("+ ", "");
        equation = equation.replace("- ", "-");

        System.out.println(equation);
        odds =  equation.split(" ");
        for(int i = 0; i < odds.length; i++){
            if(odds[i].equals("=")){
                isEqualTo = false;
                continue;
            }
            if(odds[i].contains("x2")){
                odds[i] = odds[i].replace("x2", "");
                if(odds[i].isEmpty() || odds[i].equals("-")){
                    odds[i] += "1";
                }
                if (isEqualTo) a += Integer.parseInt(odds[i]);
                else a -= Integer.parseInt(odds[i]);
                continue;
            }
            if(odds[i].contains("x")){
                odds[i] = odds[i].replace("x", "");
                if(odds[i].isEmpty() || odds[i].equals("-")){
                    odds[i] += "1";
                }
                if (isEqualTo) b += Integer.parseInt(odds[i]);
                else b -= Integer.parseInt(odds[i]);
                continue;
            }
            if((!odds[i].contains("x")) && (!odds[i].contains("x2"))){
                if(isEqualTo) c += Integer.parseInt(odds[i]);
                else c -= Integer.parseInt(odds[i]);
            }
        }
        System.out.println(a);
        setA(a);
        setB(b);
        setC(c);
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
