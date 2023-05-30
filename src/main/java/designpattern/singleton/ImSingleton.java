package main.java.designpattern.singleton;

public class ImSingleton {

    private static ImSingleton singleton = new ImSingleton();

    private ImSingleton(){
        System.out.println("싱글톤 인스턴스 생성!");
    }

    public static ImSingleton getSingleton(){
        return singleton;
    }

}
