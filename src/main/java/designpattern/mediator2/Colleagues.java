package main.java.designpattern.mediator2;

public interface Colleagues {
    public abstract void setMediator(Mediator mediator);
    public abstract void controlColleague(Colleagues c);
    public abstract String getName();
    public abstract void changeName(String name);
}
