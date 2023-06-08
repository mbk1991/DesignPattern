package main.java.designpattern.abstractfactory2.adidas;

import main.java.designpattern.abstractfactory2.factory.*;

public class AdidasFactory extends Factory {
    @Override
    public JoggerItem produceShoes(String kind, String brand, String shoesSize) {
        return new AdidasShoes(kind, brand, shoesSize);
    }

    @Override
    public JoggerItem producePants(String kind, String brand, String bottomSize) {
        return new AdidasPants(kind, brand, bottomSize);
    }

    @Override
    public JoggerItem produceWindBreaker(String kind, String brand, String topSize) {
        return new AdidasWindBreaker(kind, brand, topSize);
    }
}
