package main.java.designpattern.abstractfactory2.puma;

import main.java.designpattern.abstractfactory2.factory.Factory;
import main.java.designpattern.abstractfactory2.factory.JoggerItem;

public class PumaFactory extends Factory {
    @Override
    public JoggerItem produceShoes(String kind, String brand, String shoesSize) {
        return new PumaShoes(kind, brand, shoesSize);
    }
    @Override
    public JoggerItem producePants(String kind, String brand, String bottomSize) {
        return new PumaPants(kind, brand, bottomSize);
    }
    @Override
    public JoggerItem produceWindBreaker(String kind, String brand, String topSize) {
        return new PumaWindBreaker(kind, brand, topSize);
    }
}
