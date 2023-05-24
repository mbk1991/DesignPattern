package main.java.designpattern.iterator;

public interface Aggregate<E> {
    public abstract Iterator<E> iterator();
}
