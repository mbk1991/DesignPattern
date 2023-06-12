package main.java.designpattern.bridge;

public class FunctionAddFunc2 extends FunctionClass{
    public FunctionAddFunc2(ImplClass implClass) {
        super(implClass);
    }
    public void funcNoPrepare(){
        System.out.println("====준비 없이 기능 수행====");
        wrapProcess();
        wrapComplete();
    }
}
