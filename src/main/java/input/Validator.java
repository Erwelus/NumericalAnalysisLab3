package main.java.input;

import main.java.functions.Functional;

public class Validator {
    private final DataHolder holder;
    private final Functional function;

    public Validator(DataHolder holder, Functional function){
        this.holder=holder;
        this.function = function;
    }

    public boolean validate(){
        if (Double.isInfinite(holder.getLeft())) return false;
        if (Double.isInfinite(holder.getRight())) return false;
        if (holder.getRight() < holder.getLeft()){
            double tmp = holder.getLeft();
            holder.setLeft(holder.getRight());
            holder.setRight(tmp);
        }
        if (holder.getLeft() == holder.getRight()) return false;
        return true;
    }
}
