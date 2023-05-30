package main.java.designpattern.singleton;

public class Main {

    public static void main(String[] args){

        System.out.println("메인스레드시작");
        System.out.println("싱글톤 생성 예제");


        ImSingleton is1 = ImSingleton.getSingleton();
        ImSingleton is2 = ImSingleton.getSingleton();

        // ImSingleton is3 = new ImSingleton();  // private하여 new 생성자 접근 불가

        System.out.println("is1 : " + is1.toString());
        System.out.println("is2 : " + is2.toString());


    }
}
