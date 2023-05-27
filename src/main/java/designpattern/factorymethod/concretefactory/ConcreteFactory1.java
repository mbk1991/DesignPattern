package main.java.designpattern.factorymethod.concretefactory;

import main.java.designpattern.factorymethod.abstractfactory.Factory;
import main.java.designpattern.factorymethod.abstractfactory.Instance;

public class ConcreteFactory1 extends Factory {

    @Override
    protected String getDataForCreateInstance() {
        return "<<인스턴스1 생성을 위한 데이터>>";
    }

    @Override
    protected Instance createInstance(String dataForCreateInstance) {
        return new ConcreteInstance1( getDataForCreateInstance() );
    }

}
