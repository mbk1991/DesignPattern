package main.java.designpattern.iterator;

public class ConcreteAggregate implements Aggregate {
    private Item[] items;
    private int last = 0;

    public ConcreteAggregate(int maxSize){
        this.items = new Item[maxSize];
    }

    @Override
    public Iterator iterator(){
        return new ConcreteIterator(this);
    }


    public Item getItemAt(int index){
        return items[index];
    }

    public void appendItem(Item item){
        this.items[last] = item;
        last ++;
    }

    public int getLength(){
        return last;
    }

}
