package main.java.designpattern.bridge;

public class ConcreteImplClass1 implements ImplClass{
    @Override
    public void prepare() {
        System.out.println("\n 반말모드 시작");
        System.out.println("준비했다.");
    }
    @Override
    public void process() {
        System.out.println("처리한다.");
    }
    @Override
    public void complete() {
        System.out.println("완료했다.");
        System.out.println("반말모드 완료\n");
    }
}
