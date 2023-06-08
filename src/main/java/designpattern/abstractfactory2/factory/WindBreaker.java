package main.java.designpattern.abstractfactory2.factory;

public abstract class WindBreaker extends JoggerItem{
    protected String topSize;
    public WindBreaker(String kind, String brand, String topSize){
        super(kind,brand);
        this.topSize = topSize;
    }
}
