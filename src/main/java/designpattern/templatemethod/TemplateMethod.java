package main.java.designpattern.templatemethod;

public interface TemplateMethod {

    public default void templateMethod(){
        //step1()을 동작하고
        //step2()를 3번 동작시키고
        //step3()을 동작하는 것이 공통적인 로직, 흐름, 뼈대이다.

        System.out.println("\n\n<<템플릿 메소드의 로직>>");
        System.out.println("가장 먼저 step1을 실행!");
        step1();

        System.out.println("step2를 세 번 실행!");
        for(int i=0; i<3; i++){
            step2();
        }

        System.out.println("마지막으로 step3을 실행!");
        step3();
    }

    //추상 메소드는 템플릿메소드의 공통적인 로직, 흐름, 뺘대를 잡아주는 역할을 하며
    //구체적인 기능은 하위 클래스에서 정의한다.
    public abstract void step1();
    public abstract void step2();
    public abstract void step3();

}
