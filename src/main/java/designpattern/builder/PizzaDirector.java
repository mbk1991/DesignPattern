package main.java.designpattern.builder;

public class PizzaDirector {
    private PizzaBuilder pizzaBuilder;

    public PizzaDirector(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }

    public void makePizza(String dough, String sauce){
       pizzaBuilder.makeDough(dough);
       pizzaBuilder.addSauce(sauce);
       pizzaBuilder.addBasicTopping();
       pizzaBuilder.addSpecialTopping();
    }

    public void makePizzaNoSauce(String dough){
        pizzaBuilder.makeDough(dough);
        pizzaBuilder.addBasicTopping();
        pizzaBuilder.addSpecialTopping();
    }

    public void makePizzaNoBasicTopping(String dough, String souce){
        pizzaBuilder.makeDough(dough);
        pizzaBuilder.addSauce(souce);
        pizzaBuilder.addSpecialTopping();
    }

    public void completePizza(){
        System.out.println("피자가 완성 되었습니다. \n" + pizzaBuilder.toString());
        System.out.println();
    }
}
