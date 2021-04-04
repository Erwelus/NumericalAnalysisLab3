package main.java;

import main.java.functions.Function1;
import main.java.functions.Function2;
import main.java.functions.Function3;
import main.java.functions.Functional;
import main.java.input.*;
import main.java.methods.*;
import main.java.output.*;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Greeter greeter = new Greeter(scan);
        DataHolder holder = new DataHolder();
        greeter.greet(holder);
        Functional func=null;
        switch (holder.getFuncNum()){
            case 1: {
                func = new Function1();
                break;
            }
            case 2: {
                func = new Function2();
                break;
            }
            case 3: {
                func = new Function3();
                break;
            }
        }

        Validator validator = new Validator(holder, func);
        if(!validator.validate()){
            System.out.println("Введенные данные некорректны. Пожалуйста, перезапустите программу с корректными данными");
            System.exit(0);
        }

        AbstrMethod method=null;
        ResultPrinter resultPrinter= new ResultPrinter();
        MethodService service = new MethodService();
        IterationPrinter iterationPrinter = new IterationPrinter();

        switch (holder.getMethodNum()){
            case 1: {
                method = new RectangleLeftMethod(4, holder.getLeft(), holder.getRight(), holder.getE(), func, service, iterationPrinter);
                break;
            }
            case 2: {
                method = new RectangleRightMethod(4, holder.getLeft(), holder.getRight(), holder.getE(), func, service, iterationPrinter);
                break;
            }
            case 3: {
                method = new RectangleMiddleMethod(4, holder.getLeft(), holder.getRight(), holder.getE(), func, service, iterationPrinter);
                break;
            }
            case 4: {
                method = new TrapezoidMethod(4, holder.getLeft(), holder.getRight(), holder.getE(), func, service, iterationPrinter);
                break;
            }
            case 5: {
                method = new SimpsonMethod(4, holder.getLeft(), holder.getRight(), holder.getE(), func, service, iterationPrinter);
                break;
            }
        }

        double result = method.count(holder.getLeft(), holder.getRight());

        resultPrinter.printResult(method.getN(), result);
    }
}
