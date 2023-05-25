package main.java.designpattern.adapter2;

public class AdapterOfUsefulFunction extends A {

    private UsefulFunction usefulFunction;

    public AdapterOfUsefulFunction(){
        this.usefulFunction = new UsefulFunction();
    }

    @Override
    public void a(){
        //a() 기능이지만 내부에서는 b()기능이 동작하도록 기능을 '위임'한다.
        usefulFunction.b();
    }
}
