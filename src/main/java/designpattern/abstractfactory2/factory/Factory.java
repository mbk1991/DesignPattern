package main.java.designpattern.abstractfactory2.factory;

public abstract class Factory {
    public static Factory getFactory(String factoryName){
        try {
            Factory factory = null;
            factory = (Factory) Class.forName(factoryName).newInstance();
            return factory;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println("클래스 이름을 다시 입력해주세요.");
            throw new RuntimeException(e);
        }
    }
    public abstract JoggerItem produceShoes(String kind, String brand, String shoesSize);
    public abstract JoggerItem producePants(String kind, String brand, String bottomSize);
    public abstract JoggerItem produceWindBreaker(String kind, String brand, String topSize);
}
