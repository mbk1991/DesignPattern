package main.java.designpattern.singleton;

public class MainEx {

    public static void main(String[] args){

        SingletonEx se1 = SingletonEx.getSe();
        SingletonEx se2 = SingletonEx.getSe();
        SingletonEx se3 = SingletonEx.getSe();
    }
}
