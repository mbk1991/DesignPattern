package main.java.designpattern.command2;

public class ConcreteCommand implements Command {
    private Receiver receiver;
    private int data;

    public ConcreteCommand(Receiver receiver, int data){
        this.receiver = receiver;
        this.data = data;
    }
    @Override
    public void execute() {
        receiver.action(data);
    }
}
