package main.java.functions;

public class Function1 implements Functional {//x^3−3x^2+7x-8

    @Override
    public double count(double x) {
        return Math.pow(x, 3) - 3*Math.pow(x, 2) + 7*x - 8;
    }

}
