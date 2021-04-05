package main.java.output;

public class IterationPrinter {
    public void printResult(int n, double cur, double prev){
        System.out.println("Число разбиений: "+n);
        System.out.println("Текущее значение интеграла: "+cur);
        System.out.println("Разница с предыдущим: "+Math.abs(cur-prev)+"\n");
    }
    public void printResult(int n, double cur){
        System.out.println("Число разбиений: "+n);
        System.out.println("Текущее значение интеграла: "+cur+"\n");
    }
}
