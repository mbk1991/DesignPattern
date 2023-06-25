package main.java.designpattern.command2;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command{
    private Stack<Command> history = new Stack<>();

    @Override
    public void execute() {
        System.out.println("명령을 실행합니다.");
        Iterator<Command> it = history.iterator();
        while(it.hasNext()){
            Command c = it.next();
            c.execute();
        }
    }
    public void add(Command c){
        if(c != this){
            System.out.println("명령을 이력에 추가합니다.");
            history.push(c);
        }else{
            System.out.println("최근 명령과 같아 추가하지 않았습니다.");
        }
    }
    public void undo(){
        System.out.println("최근 명령을 제거합니다");
        history.pop();
    }
    public void clear(){
        System.out.println("명령 이력을 클리어합니다.");
        history.clear();
    }
}
