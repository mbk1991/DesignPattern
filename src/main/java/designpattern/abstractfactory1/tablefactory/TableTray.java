package main.java.designpattern.abstractfactory1.tablefactory;

import main.java.designpattern.abstractfactory1.factory.*;

public class TableTray extends Tray {
    public TableTray(String caption){
        super(caption);
    }
    @Override
    public String makeHTML() {
        return null;
    }
}
