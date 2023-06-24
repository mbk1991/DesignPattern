package main.java.designpattern.strategy2;

public interface Strategy {
    public  abstract <T extends Comparable> void sortAlgorithm(T[] array);
}
