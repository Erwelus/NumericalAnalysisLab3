package main.java.methods;

import main.java.functions.Functional;
import main.java.output.IterationPrinter;

public class SimpsonMethod extends AbstrMethod{
    public SimpsonMethod(int n, double a, double b, double e, Functional func, MethodService service, IterationPrinter iterationPrinter) {
        super(n, a, b, e, func, service, iterationPrinter);
    }

    @Override
    protected double countSum(double step) {
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 1; i < n; i++) {
            double x = a+(i*step);
            double test = service.checkFirstType(func, x, e);
            if (i%2 == 0){
                sum2+= service.checkFirstType(func, x, e);
            }else sum1+= service.checkFirstType(func, x, e);

        }
        double y0 = service.checkFirstType(func, a, e);
        double yn = service.checkFirstType(func, b, e);
        return step*(y0 + yn + 2*sum2 + 4*sum1)/3;
    }
}
