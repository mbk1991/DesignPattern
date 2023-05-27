package main.java.designpattern.factorymethod.concretefactory;

import main.java.designpattern.factorymethod.abstractfactory.Instance;

public class ConcreteInstance2 extends Instance {

    private String needData;

    ConcreteInstance2(String needData){
        this.needData = needData;
        System.out.println(needData + "를 가진 인스턴스2객체가 생성됩니다.");
    }

    @Override
    public void instanceRun() {
        System.out.println("!!!!인스턴스2가 " + needData + "로 동작합니다.!!!!");
    }
}
