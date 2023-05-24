package main.java.designpattern.iterator;

public interface Iterator<E> {

    public abstract boolean hasNext();
    public abstract <E> E next();

}
