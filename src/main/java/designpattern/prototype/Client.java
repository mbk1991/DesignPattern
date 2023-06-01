package main.java.designpattern.prototype;

public class Client {
    public static void main(String[] args){
        PrototypeFactory pf = new PrototypeFactory();

        //A를 세 번 반복하는 기능을 수행하는 인스턴스
        //B를 두 번 반복하는 기능을 수행하는 인스턴스
        //A뒤에 3을 붙여서 출력하는 기능을 수행하는 인스턴스
        //B뒤에 2를 붙여서 출력하는 기능을 수행하는 인스턴스

        //각각의 모형을 만들기 위한 각각의 클래스를 만들어야 하나?
        //인스턴스가 필요할 때마다 인스턴스를 만들고 세팅하는 절차를 매번 작성하여야 하나?
        //인스턴스 생성 시 클래스 이름에 의존하여야 하나?

        // -> 프로토타입패턴으로 해결

        //스프링의 bean과 비슷한 느낌이라고 생각
        //bean객체를 만들어 놓고 필요할 때 주입하곤 하는데
        //프로토타입도 다양하고 만들기 번거로운 인스턴스를 미리 만들어 저장해두고
        //필요할 때 직접 클래스로 객체를 생성하는 것이 아니라
        //만들어놓은 인스턴스에서 복사본을 얻어 사용한다.

        //프로토타입패턴을 위한 준비 부분
        Prototype repeatA = new ConcretePrototype1("A");
        repeatA.setPrototype(3);
        Prototype repeatB = new ConcretePrototype1("B");
        repeatB.setPrototype(2);
        Prototype attatchA = new ConcretePrototype2("A");
        attatchA.setPrototype(3);
        Prototype attatchB = new ConcretePrototype2("B");
        attatchB.setPrototype(2);

        pf.registerPrototype("repeatA",repeatA);
        pf.registerPrototype("repeatB",repeatB);
        pf.registerPrototype("attatchA",attatchA);
        pf.registerPrototype("attatchB",attatchB);



        //프로토타입패턴으로 클래스이름에 의존하지 않고 인스턴스를 생성하여 사용하는 부분
        Prototype obj1 = pf.create("repeatA");
        Prototype obj2 = pf.create("repeatB");
        Prototype obj3 = pf.create("attatchA");
        Prototype obj4 = pf.create("attatchB");

        obj1.prototypeExcute();
        obj2.prototypeExcute();
        obj3.prototypeExcute();
        obj4.prototypeExcute();

    }
}
