package main.java.designpattern.visitor;

public interface Element {
    public abstract void accept(Visitor v);
}
