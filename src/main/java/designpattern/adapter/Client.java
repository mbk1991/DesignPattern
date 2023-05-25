package main.java.designpattern.adapter;

public class Client{
    public static void main(String[] args){

        A a = new AdapterOfUsefulFunction();

        // 인터페이스A의 방식으로만 동작하는 클라이언트
        // 난 인터페이스 A의 a()라는 방식으로만 동작한다.
        //아래의 코드를 변경시키지 않고 UsefulFunction의 유용한 기능 b()를 이용하는 것이 Adapter패턴이다.

        a.a();

    }
}
