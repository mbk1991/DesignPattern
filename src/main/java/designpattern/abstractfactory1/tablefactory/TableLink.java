package main.java.designpattern.abstractfactory1.tablefactory;

import main.java.designpattern.abstractfactory1.factory.*;

public class TableLink extends Link {
    public TableLink(String caption, String url){
        super(caption,url);
    }
    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
