package main.java.designpattern.abstractfactory1.factory;

public abstract class Item {
    protected String caption;
    public Item(String caption){
        this.caption = caption;
    }
    public abstract String makeHTML();
}
