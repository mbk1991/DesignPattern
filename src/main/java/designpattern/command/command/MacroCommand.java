package main.java.designpattern.command.command;

import java.util.Stack;
import java.util.Iterator;

public class MacroCommand implements Command{
    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        Iterator<Command> it = commands.iterator();
        while(it.hasNext()){
            Command c = it.next();
            c.execute();
        }
    }
    public void append(Command cmd){
        if(cmd != this){
            commands.push(cmd);
        }
    }
    public void undo(){
        if(!commands.empty()){
            commands.pop();
        }
    }
    public void clear(){
        commands.clear();
    }
}
