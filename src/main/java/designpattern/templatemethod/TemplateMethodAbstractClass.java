package main.java.designpattern.templatemethod;

public abstract class TemplateMethodAbstractClass {

    public final void templateMethod(){

        step1();
        step2();
        step3();

    }

    protected abstract void step1();
    protected abstract void step2();
    protected abstract void step3();

}
