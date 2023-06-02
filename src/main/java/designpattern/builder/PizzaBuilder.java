package main.java.designpattern.builder;

public abstract class PizzaBuilder {
    public abstract void makeDough(String dough);
    public abstract void addSauce(String sauce);
    public abstract void addBasicTopping();
    public abstract void addSpecialTopping();

    public PizzaBuilder getPizza(){
        return this;
    }

    @Override
    public abstract String toString ();
}
