package main.java.designpattern.abstractfactory2.factory;

public abstract class Pants extends JoggerItem{
    protected String bottomSize;
    public Pants(String kind, String brand, String bottomSize){
        super(kind,brand);
        this.bottomSize = bottomSize;
    }
}
