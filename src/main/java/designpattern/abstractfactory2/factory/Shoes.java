package main.java.designpattern.abstractfactory2.factory;

public abstract class Shoes extends JoggerItem{
    protected String shoesSize;
    public Shoes(String kind, String brand, String shoesSize){
        super(kind,brand);
        this.shoesSize = shoesSize;
    }
}
