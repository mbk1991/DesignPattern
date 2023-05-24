package main.java.designpattern.iterator;

import java.util.ArrayList;

public class ConcreteAggregate<E> implements Aggregate<E> {
//    private Item[] items;
    private ArrayList<E> e;
    private int last = 0;

//    public ConcreteAggregate(int maxSize){
//        this.items = new Item[maxSize];
//    }

    public ConcreteAggregate(int maxSize){
        this.e = new ArrayList<E>(maxSize);
    }

    @Override
    public Iterator iterator(){
        return new ConcreteIterator(this);
    }


//    public Item getItemAt(int index){
//        return items[index];
//    }

    public E getItemAt(int index){
        return e.get(index);
    }

//    public void appendItem(Item item){
//        this.items[last] = item;
//        last ++;
//    }

    public void appendItem(E e){
        this.e.add(e);
        last ++;
    }

    public int getLength(){
        return last;
    }

}
