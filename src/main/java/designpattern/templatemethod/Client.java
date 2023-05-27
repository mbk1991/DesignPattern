package main.java.designpattern.templatemethod;

public class Client {

    public static void main(String[] args){

        TemplateMethod tm1 = new ConcreteClass1();
        TemplateMethod tm2 = new ConcreteClass2();

        tm1.templateMethod();
        tm2.templateMethod();
    }
}
