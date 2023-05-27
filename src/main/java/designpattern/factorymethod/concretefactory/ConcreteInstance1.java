package main.java.designpattern.factorymethod.concretefactory;

import main.java.designpattern.factorymethod.abstractfactory.Instance;

public class ConcreteInstance1 extends Instance {

    private String needData;

    ConcreteInstance1(String needData){
        this.needData = needData;
        System.out.println(needData + "를 가진 인스턴스1객체가 생성됩니다.");
    }

    @Override
    public void instanceRun(){
        System.out.println("####인스턴스1이 <" + needData + "> 로 동작하고 있습니다.####");
    }

}
