package main.java.designpattern.observer;

public class Main {
    public static void main(String[] args){
        NumberGenerator randGenerator = new RandomNumberGenerator();
        IncrementalNumberGenerator incrementalNumberGenerator = new IncrementalNumberGenerator(3,30,3);
        Observer digitObsvr = new DigitObserver();
        Observer grphObsvr = new GraphObserver();
        Observer oddObsvr = new OddObserver();

        randGenerator.addObserver(digitObsvr);
        randGenerator.addObserver(grphObsvr);
        randGenerator.addObserver(oddObsvr);
        randGenerator.execute();

        incrementalNumberGenerator.addObserver(digitObsvr);
        incrementalNumberGenerator.addObserver(grphObsvr);
        incrementalNumberGenerator.addObserver(oddObsvr);
        incrementalNumberGenerator.execute();
    }
}
