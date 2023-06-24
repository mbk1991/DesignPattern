package main.java.designpattern.memento.game;

import java.io.Serializable;
import java.util.*;

public class Memento implements Serializable {
    int money;
    ArrayList<String> fruits;
    Memento(int money){
        this.money = money;
        fruits = new ArrayList<>();
    }
    public int getMoney(){
        return money;
    }
    void addFruit(String fruit){
        fruits.add(fruit);
    }
    List getFruits(){
        return (List)fruits.clone();
    }

    @Override
    public String toString(){
        return "메멘토 상태 \n 돈: "+money+", 과일: "+fruits +"";
    }
}
