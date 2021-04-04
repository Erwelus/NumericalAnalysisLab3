package main.java.input;

import java.util.Scanner;

public class Greeter {
    private final Scanner scanner;


    public Greeter(Scanner scanner){
        this.scanner=scanner;
    }

    private double readLimitedNumber(int low, int high){
        double num;
        while (true){
            num = readNum();
            if (num <high && num >low && num%1 == 0){
                break;
            }else{
                System.out.println("Пожалуйста, введите одно из предложенных чисел.");
            }
        }
        return num;
    }

    private double readNum(){
        double num;
        while (true){
            try {
                if (scanner.hasNext()) {
                    num = Double.parseDouble(scanner.next());
                    break;
                }
            }catch (Exception ex){
                System.out.println("Некорректный ввод. Следуйте указаниям.");
            }
        }
        return num;
    }

    public void greet(DataHolder holder){
        System.out.println("Данная программа предназначена для нахождения значений определенных интегралов.");
        System.out.println("Выберите функцию, интеграл от которой требуется вычислить:");
        System.out.println("[ 1 ]: x^3−3x^2+7x-8");
        System.out.println("[ 2 ]: 1/x");
        System.out.println("[ 3 ]: sin(x)/x");

        holder.setFuncNum((int) readLimitedNumber(0, 4));

        System.out.println("Выберите численный метод:");
        System.out.println("[ 1 ]: Метод левых прямоугольников");
        System.out.println("[ 2 ]: Метод правых прямоугольников");
        System.out.println("[ 3 ]: Метод средних прямоугольников");
        System.out.println("[ 4 ]: Метод трапеций");
        System.out.println("[ 5 ]: Метод Симпсона");

        holder.setMethodNum((int) readLimitedNumber(0, 6));

        System.out.println("Пожалуйста, введите левый предел интегрирования");
        holder.setLeft(readNum());
        System.out.println("Пожалуйста, введите правый предел интегрирования");
        holder.setRight(readNum());
        System.out.println("Пожалуйста, введите точность");
        holder.setE(readNum());
    }
}
