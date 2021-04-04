package main.java.functions;

public class Function3 implements Functional {//sin(x)/x

    @Override
    public double count(double x) {
        return Math.sin(x)/x;
    }
}
