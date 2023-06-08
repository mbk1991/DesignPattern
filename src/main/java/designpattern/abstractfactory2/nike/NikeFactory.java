package main.java.designpattern.abstractfactory2.nike;

import main.java.designpattern.abstractfactory2.factory.Factory;
import main.java.designpattern.abstractfactory2.factory.JoggerItem;

public class NikeFactory extends Factory {
    @Override
    public JoggerItem produceShoes(String kind, String brand, String shoesSize) {
        return new NikeShoes(kind,brand,shoesSize);
    }

    @Override
    public JoggerItem producePants(String kind, String brand, String bottomSize) {
        return new NikePants(kind,brand,bottomSize);
    }

    @Override
    public JoggerItem produceWindBreaker(String kind, String brand, String topSize) {
        return new NikeWindBreaker(kind, brand, topSize);
    }
}
