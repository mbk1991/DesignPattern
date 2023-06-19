package main.java.designpattern.strategy2;

public class ConcreteStrategy1 implements Strategy{
    @Override
    public <T extends Comparable> void sortAlgorithm(T[] array){
        //selectionSort
        System.out.println("선택정렬 실행");
        int min;
        for(int i=0; i<array.length; i++){
            min = i;
            for(int j=i+1; j<array.length; j++){
                if(array[j].compareTo(array[min]) < 0){
                    min = j;
                }
            }
            T tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
    }
}
