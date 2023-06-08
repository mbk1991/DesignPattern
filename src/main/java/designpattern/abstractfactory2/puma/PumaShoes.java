package main.java.designpattern.abstractfactory2.puma;

import main.java.designpattern.abstractfactory2.factory.JoggerItem;
import main.java.designpattern.abstractfactory2.factory.Shoes;

public class PumaShoes extends Shoes {
    public PumaShoes(String kind, String brand, String shoesSize) {
        super(kind, brand, shoesSize);
    }
    @Override
    public String toString() {

        return "브랜드: 🐆" + brand + "\n" +
                "품목: " + kind + "\n" +
                "사이즈:" + shoesSize +"\n";
    }
}
