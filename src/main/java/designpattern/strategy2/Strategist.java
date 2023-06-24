package main.java.designpattern.strategy2;

public class Strategist<T extends Comparable> {
    private Strategy strategy;
    private T[] arr;
    public Strategist(Strategy strategy, T[] arr){
        this.strategy = strategy;
        this.arr = arr;
    }
    public <T extends Comparable> void doSortAlgorithm(){
        strategy.sortAlgorithm(arr);
    }
    public void printArray(){
        for(T t:arr){
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
