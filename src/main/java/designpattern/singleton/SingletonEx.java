package main.java.designpattern.singleton;

public class SingletonEx {

    private int count = 1;
    private static SingletonEx se = new SingletonEx();

    private SingletonEx(){
        getCount();
    }

    public static SingletonEx getSe(){
        return se;
    }

    public int getCount(){
        System.out.println("인스턴스카운트 : " + count);
        return count++;
    }
}
