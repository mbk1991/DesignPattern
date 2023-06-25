package main.java.designpattern.command2;

public class ConcreteReceiver implements Receiver{
    @Override
    public void action(int data) {
        for(int i=0; i<data; i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
