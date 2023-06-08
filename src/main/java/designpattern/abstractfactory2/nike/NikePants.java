package main.java.designpattern.abstractfactory2.nike;

import main.java.designpattern.abstractfactory2.factory.JoggerItem;
import main.java.designpattern.abstractfactory2.factory.Pants;

public class NikePants extends Pants {
    public NikePants(String kind, String brand, String bottomSize) {
        super(kind, brand, bottomSize);
    }
    @Override
    public String toString() {
        return "브랜드: ✌" + brand + "\n" +
                "품목: " + kind + "\n" +
                "사이즈:" + bottomSize +"\n";
    }
}
