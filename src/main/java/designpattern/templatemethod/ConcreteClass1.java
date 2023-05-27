package main.java.designpattern.templatemethod;

public class ConcreteClass1 implements TemplateMethod{
    @Override
    public void step1() {
        System.out.println("step1단계를 1번 방식으로 구현");
    }

    @Override
    public void step2() {
        System.out.println("step2단계를 1번 방식으로 구현");
    }

    @Override
    public void step3() {
        System.out.println("step3단계를 1번 방식으로 구현");

    }
}
