package main.java.designpattern.factorymethod.abstractfactory;

public abstract class Factory {


    //create() 메소드는 템플릿메소드패턴으로 인스턴스를 생성하는 (템플릿)팩토리메소드이다.
    //팩토리는 인스턴스를 생성한다.

    public final Instance create(){

        Instance instance;
        String dataForCreateInstance = getDataForCreateInstance();
        instance = createInstance(dataForCreateInstance);

        return instance;
    }

    protected abstract String getDataForCreateInstance();
    protected abstract Instance createInstance(String dataForCreateInstance);

}
