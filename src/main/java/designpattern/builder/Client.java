package main.java.designpattern.builder;

public class Client {

    public static void main(String[] args){

        PizzaDirector bulgogiPizzaDirector = new PizzaDirector(new BulgogiBuilder());

        PizzaDirector pepperoniPizzaDirector = new PizzaDirector(new PepperoniBuilder());

        PizzaDirector hawaiianPizzaDirector = new PizzaDirector(new HawaiianBuilder());

        //소스 없는 불고기 치즈크러스트 피자 만들기
        bulgogiPizzaDirector.makePizzaNoSauce("치즈크러스트");
        bulgogiPizzaDirector.completePizza();


        //페퍼로니피자 만들기
        pepperoniPizzaDirector.makePizza("기본도우","토마토소스");
        pepperoniPizzaDirector.completePizza();

        //기본토핑 없는 크림소스 고구마도우 하와이안 피자 만들기
        hawaiianPizzaDirector.makePizzaNoBasicTopping("고구마도우","크림소스");
        hawaiianPizzaDirector.completePizza();

    }
}
