package main.java.designpattern.abstractfactory1.listfactory;


import main.java.designpattern.abstractfactory1.factory.*;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }
    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}

