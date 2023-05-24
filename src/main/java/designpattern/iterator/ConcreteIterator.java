package main.java.designpattern.iterator;

public class ConcreteIterator<E> implements Iterator<E> {
    private ConcreteAggregate ConcreteAggregate;
    private int index;

    public ConcreteIterator(ConcreteAggregate ConcreteAggregate){
        this.ConcreteAggregate = ConcreteAggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext(){
        if(index < ConcreteAggregate.getLength()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public  <E> E next(){
        E e = (E) ConcreteAggregate.getItemAt(index);
        index++;
        return (E)e;
    }
}
