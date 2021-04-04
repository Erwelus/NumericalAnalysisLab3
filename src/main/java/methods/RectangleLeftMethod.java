package main.java.methods;

import main.java.functions.Functional;
import main.java.output.IterationPrinter;

public class RectangleLeftMethod extends AbstrMethod{

    public RectangleLeftMethod(int n, double a, double b, double e, Functional func, MethodService service, IterationPrinter iterationPrinter) {
        super(n, a, b, e, func, service, iterationPrinter);
    }
    @Override
    protected double countSum(double step){
        double sum=0;
        for (int i = 1; i <= n; i++) {
            double x = a+(i*step);
            sum+= service.checkFirstType(func, x, e) * step;
        }
        return sum;
    }
}
