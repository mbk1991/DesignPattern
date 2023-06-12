package main.java.designpattern.bridge;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        FunctionClass fc;
        FunctionAddFunc1 fc2;
        FunctionAddFunc2 fc3;
        ImplClass ic;

        System.out.println("모드를 입력하세요.\n" +
                           "반말모드: main.java.designpattern.bridge.ConcreteImplClass1\n" +
                           "존대모드: main.java.designpattern.bridge.ConcreteImplClass2\n");

        String input = sc.nextLine();
        try {
            ic = (ImplClass) Class.forName(input).newInstance();
            fc= new FunctionClass(ic);
            fc2= new FunctionAddFunc1(ic);
            fc3= new FunctionAddFunc2(ic);

            //기능 사용부///////////////////////////////////
            fc.func1();
            fc2.funcRepeat(3);
            fc3.funcNoPrepare();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }





    }
}
