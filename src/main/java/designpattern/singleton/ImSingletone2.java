package main.java.designpattern.singleton;

public class ImSingletone2 {

    private static ImSingletone2 is2;

    public static ImSingletone2 getSingleton(){

        if(is2 == null){
            is2 = new ImSingletone2();
            return is2;
        }else{
            return is2;
        }
    }
}
