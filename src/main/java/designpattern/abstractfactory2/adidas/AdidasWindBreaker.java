package main.java.designpattern.abstractfactory2.adidas;

import main.java.designpattern.abstractfactory2.factory.JoggerItem;
import main.java.designpattern.abstractfactory2.factory.WindBreaker;

public class AdidasWindBreaker extends WindBreaker {
    public AdidasWindBreaker(String kind, String brand, String topSize) {
        super(kind, brand, topSize);
    }
    @Override
    public String toString() {

        return "브랜드: 🔥" + brand + "\n" +
                "품목: " + kind + "\n" +
                "사이즈:" + topSize +"\n";
    }
}
