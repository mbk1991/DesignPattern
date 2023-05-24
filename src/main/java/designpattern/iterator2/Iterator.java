package main.java.designpattern.iterator2;

public interface Iterator<E> {
    public abstract boolean hasNext();
    public abstract <E> E next();
}
