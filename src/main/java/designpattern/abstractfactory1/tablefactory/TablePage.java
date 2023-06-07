package main.java.designpattern.abstractfactory1.tablefactory;

import main.java.designpattern.abstractfactory1.factory.*;

public class TablePage extends Page {
    public TablePage(String title, String author){
        super(title, author);
    }
    @Override
    public String makeHTML() {
        return null;
    }
}
