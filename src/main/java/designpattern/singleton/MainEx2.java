package main.java.designpattern.singleton;

public class MainEx2 extends Thread {

    public MainEx2(String name){
        super(name);
    }

    public static void main(String[] args){
        System.out.println("Start");
        new MainEx2("A").start();
        new MainEx2("B").start();
        new MainEx2("C").start();
        System.out.println("End");
    }

    @Override
    public void run(){
        NotSingleton obj = NotSingleton.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }
}
