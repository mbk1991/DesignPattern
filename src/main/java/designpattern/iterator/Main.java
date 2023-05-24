package main.java.designpattern.iterator;

public class Main {

    public static void main(String[] args){
        ConcreteAggregate ConcreteAggregate = new ConcreteAggregate(3);
        ConcreteAggregate.appendItem(new Item("1번 아이템"));
        ConcreteAggregate.appendItem(new Item("2번 아이템"));
        ConcreteAggregate.appendItem(new Item("3번 아이템"));
        ConcreteAggregate.appendItem(new Item("4번 아이템"));
        ConcreteAggregate.appendItem(new Item("5번 아이템"));

        Iterator<Item> it = ConcreteAggregate.iterator();

        while(it.hasNext()){
            Item item = it.next();
            System.out.println("요소에 대한 처리, item이름 출력  :  " + item.getItemName());
        }
    }
}
