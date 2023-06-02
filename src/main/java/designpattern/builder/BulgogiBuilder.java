package main.java.designpattern.builder;

public class BulgogiBuilder extends PizzaBuilder {

    private String   dough;
    private String   sauce;
    private String basicTopping;
    private String   specialTopping;

    @Override
    public void makeDough(String dough) {
        this.dough = dough;
    }

    @Override
    public void addSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public void addBasicTopping() {
        basicTopping = "양파,옥수수,올리브,양송이";
    }

    @Override
    public void addSpecialTopping() {
        specialTopping = "불고기";
    }

    @Override
    public String toString() {
        String pizzaInfo = "[만들어진 피자의 정보]"+
                            "\n도우 : " + dough +
                            "\n소스 : " + sauce +
                            "\n기본토핑 : " + basicTopping +
                            "\n특별토핑 : " + specialTopping;

        return pizzaInfo;
    }
}
