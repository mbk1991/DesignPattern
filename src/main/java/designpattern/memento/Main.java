package main.java.designpattern.memento;

import main.java.designpattern.memento.game.Gamer;
import main.java.designpattern.memento.game.Memento;
import java.io.*;

public class Main {
    public static final String SAVEFILENAME = "game.dat";
    public static void main(String[] args){
        Gamer gamer = new Gamer(100);
        Memento memento = loadMemento();
        if(memento != null){
            System.out.println("지난 결과에서 시작합니다.");
            gamer.restoreMemento(memento);
        }else{
            System.out.println("새로 시작합니다.");
            memento = gamer.createMemento();
        }
        for(int i=0; i<100; i++){
            System.out.println("=====" + i);
            System.out.println("현재상태: " + gamer );

            gamer.bat();

            System.out.println("소지금은 " + gamer.getMoney() + "원이 되었습니다.");

            //Memento 취급 결정
            if(gamer.getMoney() > memento.getMoney()){
                System.out.println("많이 증가했으므로 현재의 상태를 저장한다.");
                memento = gamer.createMemento();
                saveMemento(memento);
            }else if(gamer.getMoney() < memento.getMoney()){
                System.out.println("많이 감소했으므로 이전의 상태로 복원한다.");
                gamer.restoreMemento(memento);
            }

            //대기
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
            }
            System.out.println();
        }
    }
    public static void saveMemento(Memento memento){
        try{
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(SAVEFILENAME));
            out.writeObject(memento);
            out.close();
        }catch(Exception e){
        }
    }
    public static Memento loadMemento(){
        Memento memento = null;
        try{
            ObjectInput in = new ObjectInputStream(new FileInputStream(SAVEFILENAME));
            memento = (Memento) in.readObject();
            in.close();
        }catch(Exception e){
        }
        return memento;
    }
}
