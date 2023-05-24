package main.java.designpattern.iterator2;

public interface Iterable<E> {
    public abstract <E extends Iterator> E iterator();
}
