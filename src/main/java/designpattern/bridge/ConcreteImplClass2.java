package main.java.designpattern.bridge;

public class ConcreteImplClass2 implements ImplClass{
    @Override
    public void prepare() {
        System.out.println("\n 존대모드 시작");
        System.out.println("준비했습니다.!");
    }
    @Override
    public void process() {
        System.out.println("처리합니다!.");
    }
    @Override
    public void complete() {
        System.out.println("완료했습니다!.");
        System.out.println("존대모드 완료\n");
    }
}
