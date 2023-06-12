package main.java.designpattern.bridge;

public class FunctionClass {
    private ImplClass implClass; // 이 필드가 <기능의 클래스 계층>과 <구현의 클래스계층> 을 연결하는 Bridge..!

    public FunctionClass(ImplClass implClass){
        this.implClass = implClass;
    }
    public void func1(){
        System.out.println("====기능 수행====");
        wrapPrepare();
        wrapProcess();
        wrapComplete();
    }
    protected void wrapPrepare(){
        implClass.prepare();
    }
    protected void wrapProcess(){
        implClass.process();
    }
    protected void wrapComplete(){
        implClass.complete();
    }
}
