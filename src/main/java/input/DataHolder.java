package main.java.input;

public class DataHolder {
    private int funcNum;
    private int methodNum;
    private double left;
    private double right;
    private double e;

    public double getLeft() {
        return left;
    }
    public double getRight() {
        return right;
    }
    public int getFuncNum() {
        return funcNum;
    }
    public int getMethodNum() {
        return methodNum;
    }
    public void setFuncNum(int funcNum) {
        this.funcNum = funcNum;
    }
    public void setLeft(double left) {
        this.left = left;
    }
    public void setMethodNum(int methodNum) {
        this.methodNum = methodNum;
    }
    public void setRight(double right) {
        this.right = right;
    }
    public double getE() {
        return e;
    }
    public void setE(double e) {
        this.e = e;
    }
}