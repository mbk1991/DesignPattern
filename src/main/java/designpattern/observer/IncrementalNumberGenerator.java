package main.java.designpattern.observer;

public class IncrementalNumberGenerator extends NumberGenerator{
    private int number;
    private int start,end,d;

    public IncrementalNumberGenerator(int start, int end, int d){
        this.start = start;
        this.end = end;
        this.d = d;
    }
    @Override
    public int getNumber() {
        return number;
    }
    @Override
    public void execute() {
        for(int i=start; i<end; i+=d){
            number = i;
            notifyObservers();
        }
    }
}
