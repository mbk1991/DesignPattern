package main.java.designpattern.decorator2;

public class BeautifulReader extends Decorator{
    protected BeautifulReader(Component component) {
        super(component);
    }
    @Override
    protected String getStr() {
        return component.getStr();
    }
    @Override
    protected void excute() {
        component.excute();
        System.out.print("★");
    }
}
