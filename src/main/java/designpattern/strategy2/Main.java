package main.java.designpattern.strategy2;

public class Main {
    public static void main(String[] args){

        Strategist sorter;
        Strategy strategy;

        Comparable[] paramArr;
        Integer[] intArr = {10,21,32,4,15,62,7};
        String[] strArr = {"홍길동","김민수","박철수","안정수"};
        Double[] doubleArr = {23.1,423.0,2.1,44.4};

        String str;
        int rand = (int)(Math.random()*10.0);
        if(rand % 3 == 0){
            paramArr = intArr;
            str = "main.java.designpattern.strategy2.ConcreteStrategy1";
        }else if(rand % 3 == 1){
            paramArr = strArr;
            str = "main.java.designpattern.strategy2.ConcreteStrategy2";
        }else{
            paramArr = doubleArr;
            str = "main.java.designpattern.strategy2.ConcreteStrategy3";
        }
        try {
            strategy = (Strategy)Class.forName(str).newInstance();
            sorter = new Strategist(strategy,paramArr);
            sorter.doSortAlgorithm();
            sorter.printArray();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
