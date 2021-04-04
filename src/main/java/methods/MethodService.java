package main.java.methods;

import main.java.functions.Functional;

public class MethodService {
    public double checkFirstType(Functional func, double x, double e){
        if (Double.isInfinite(func.count(x))){
            return (func.count(x-(e/1000)) + func.count(x+(e/1000)))/2;
        }else return func.count(x);
    }

    public Double checkSecondType(Functional func, double a, double b, int n){
        double step = (b-a)/(2*n);
        for (int i = 0; i < n; i++) {
            if (Double.isInfinite(func.count(a+(i*step)))) return a+(i*step);
        }
        return null;
    }
}
