package main.java.designpattern.strategy2;

public class ConcreteStrategy2 implements Strategy{
    @Override
    public <T extends Comparable> void sortAlgorithm(T[] array){
        //insertionSort
        System.out.println("삽입정렬 실행");
        for(int i = 1; i< array.length; i++){
            T tmp = array[i];
            int aux = i - 1;
            while( (aux >= 0) && (array[aux].compareTo(tmp) > 0)){
                array[aux + 1] = array[aux];
                aux --;
            }
            array[aux + 1] = tmp;
        }
    }
}
