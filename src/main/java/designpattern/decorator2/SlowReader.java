package main.java.designpattern.decorator2;

public class SlowReader extends Decorator{
    protected SlowReader(Component component) {
        super(component);
    }
    @Override
    protected String getStr() {
        return component.getStr();
    }
    @Override
    protected void excute() {
        try {
            component.excute();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
