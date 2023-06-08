package main.java.designpattern.abstractfactory2.factory;

public abstract class JoggerItem {
    protected String kind;
    protected String brand;
    public JoggerItem(String kind, String brand){
        this.kind = kind;
        this.brand = brand;
    }
    @Override
    public abstract String toString();
}
