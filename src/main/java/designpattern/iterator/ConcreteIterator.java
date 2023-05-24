package main.java.designpattern.iterator;

public class ConcreteIterator implements Iterator {
    private ConcreteAggregate concreteAggregate;
    private int index;

    public ConcreteIterator(ConcreteAggregate concreteAggregate){
        this.concreteAggregate = concreteAggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext(){
        if(index < concreteAggregate.getLength()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next(){
        Item item = concreteAggregate.getItemAt(index);
        index++;
        return item;
    }


}
