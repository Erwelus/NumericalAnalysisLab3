package main.java.methods;

import main.java.functions.Functional;
import main.java.output.IterationPrinter;

public abstract class AbstrMethod {
    protected int n;
    protected final double a;
    protected final double b;
    protected final double e;
    protected final Functional func;
    protected MethodService service;
    protected IterationPrinter iterationPrinter;

    public AbstrMethod(int n, double a, double b, double e,
                       Functional func, MethodService service,
                       IterationPrinter iterationPrinter) {
        this.n = n;
        this.a = a;
        this.b = b;
        this.e = e;
        this.func = func;
        this.service = service;
        this.iterationPrinter = iterationPrinter;
    }

    public double count(double a, double b) {
        double step = (b-a)/n;
        Double check = service.checkSecondType(func, a, b, n);
        if (check != null){
            n/= 2;
            return count(a, check - e/1000) + count(check + e/1000, b);
        }
        double firstSum = countSum(step);
        n *= 2;
        step /= 2;
        double nextSum = countSum(step);
        iterationPrinter.printResult(n, nextSum, firstSum);
        while (Math.abs(nextSum - firstSum) > e){
            n *= 2;
            step /= 2;
            firstSum = nextSum;
            check = service.checkSecondType(func, a, b, n/2);
            if (check != null){
                n/=2;
                return count(a, check - e/1000) + count(check + e/1000, b);
            }
            nextSum = countSum(step);
            iterationPrinter.printResult(n, nextSum, firstSum);
        }
        return nextSum;
    }

    protected abstract double countSum(double step);

    public int getN() {
        return n;
    }
}
