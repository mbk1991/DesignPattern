package main.java.designpattern.memento.game;

import java.util.*;
import java.io.*;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitsname = {"사과", "배", "바나나", "체리"};

    public Gamer(int money){
        this.money = money;
    }
    public int getMoney(){
        return money;
    }
    public void bat(){
        int dice = random.nextInt(6) + 1;
        switch(dice){
            case 1: money+= 100; System.out.println("소지금이 증가했습니다.");break;
            case 2: money/= 2; System.out.println("소지금이 반으로 줄었습니다.");break;
            case 5: String f = getFruit(); System.out.println("과일" + f + "을 받았습니다.");fruits.add(f);break;
            default: System.out.println("변한 것이 없음");
        }
    }
    public Memento createMemento(){
        Memento m = new Memento(money);
        Iterator it = this.fruits.iterator();
        while(it.hasNext()){
            String f = (String)it.next();
            if(f.startsWith("맛있는")){
                m.addFruit(f);
            }
        }
        System.out.println("생성된 메멘토의 상태 : " +  m.toString() );
        return m;
    }
    public void restoreMemento(Memento memento){
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }
    public String toString(){
        return "[money = " + money + ", fruits = " + fruits + " ]";
    }
    public String getFruit(){
        String prefix = "";
        if(random.nextBoolean()){
            prefix = "맛있는";
            System.out.println("맛있는과일체크");
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}
