package main.java.designpattern.decorator2;

public abstract class Component {
    protected void read(){
        for(String s:getStr().split("")){
            System.out.print(s);
            excute();
        }
        System.out.println();
    }
    protected abstract String getStr();
    protected abstract void excute();
}
