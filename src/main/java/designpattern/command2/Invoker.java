package main.java.designpattern.command2;

import java.util.Random;

public class Invoker {
    public static void main(String[] args){
        Random random = new Random();
        Receiver receiver = new ConcreteReceiver();
        MacroCommand macroCommand = new MacroCommand();

        for(int i=0; i<20; i++){
            System.out.println();
            int rand = random.nextInt(10) + 1;
            System.out.println("클라이언트의 요청 숫자 : " + rand);
            System.out.println("Command 객체를 생성합니다.");
            Command c = new ConcreteCommand(receiver, rand);
            macroCommand.add(c);
            macroCommand.execute();

            if(i%3 == 0){
                macroCommand.undo();
            }
            if(i==15){
                macroCommand.clear();
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
