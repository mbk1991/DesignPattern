package main.java.designpattern.iterator;

public class Main {

    public static void main(String[] args){
        ConcreteAggregate concreteAggregate = new ConcreteAggregate(3);
        concreteAggregate.appendItem(new Item("1번 아이템"));
        concreteAggregate.appendItem(new Item("2번 아이템"));
        concreteAggregate.appendItem(new Item("3번 아이템"));

        Iterator it = concreteAggregate.iterator();

        while(it.hasNext()){
            Item item = (Item) it.next();
            System.out.println("요소에 대한 처리, item이름 출력  :  " + item.getItemName());
        }


    }
}
