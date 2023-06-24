package main.java.designpattern.observer;

public class OddObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        if(generator.getNumber()%2 ==1){
            System.out.println("OddObserver: 홀수 관찰" + generator.getNumber());
        }else{
        }
    }
}
