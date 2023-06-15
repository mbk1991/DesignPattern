package main.java.designpattern.strategy2;

public class Strategist {
    public Strategy strategy;
    public Strategist(Strategy strategy){
        this.strategy = strategy;
    }
    public void doSortAlgorithm(){
        strategy.sortAlgorithm();
    }
}
