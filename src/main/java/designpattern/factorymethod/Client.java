package main.java.designpattern.factorymethod;

import main.java.designpattern.factorymethod.abstractfactory.Factory;
import main.java.designpattern.factorymethod.abstractfactory.Instance;
import main.java.designpattern.factorymethod.concretefactory.ConcreteFactory1;
import main.java.designpattern.factorymethod.concretefactory.ConcreteFactory2;

public class Client {

    public static void main(String[] args){

        Factory factory1 = new ConcreteFactory1();
        Factory factory2 = new ConcreteFactory2();

        Instance instance1 = factory1.create();
        Instance instance2 = factory2.create();

        instance1.instanceRun();
        instance2.instanceRun();

    }
}
