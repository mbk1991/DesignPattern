package main.java.designpattern.strategy2;

public class ConcreteStrategy3 implements Strategy{
    @Override
    public <T extends Comparable> void sortAlgorithm(T[] array) {
        //BubbleSort
        System.out.println("버블정렬 실행");
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length - i; j++){
                if(array[j].compareTo(array[j-1]) < 0){
                    T tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
    }
}
