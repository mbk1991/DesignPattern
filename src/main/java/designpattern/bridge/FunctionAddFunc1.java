package main.java.designpattern.bridge;

public class FunctionAddFunc1 extends FunctionClass{
    public FunctionAddFunc1(ImplClass implClass) {
        super(implClass);
    }
    public void funcRepeat(int num){
        System.out.println("====반복 기능 수행====");
        wrapPrepare();
        for(int i=0; i<num; i++){
            wrapProcess();
        }
        wrapComplete();
    }
}
