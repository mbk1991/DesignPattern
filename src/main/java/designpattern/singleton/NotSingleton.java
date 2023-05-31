package main.java.designpattern.singleton;

public class NotSingleton {
    private static NotSingleton ns = null;

    private NotSingleton(){
        System.out.println("인스턴스가 생성되었습니다!");
    }

    public static synchronized NotSingleton getInstance(){
        if(ns == null){
            ns = new NotSingleton();
        }
        return ns;
    }
}
