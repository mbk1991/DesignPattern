package main.java.designpattern.prototype;

import java.util.*;

public class PrototypeFactory{
    private Map<String,Prototype> prototypeMap = new HashMap<>();

    public void registerPrototype(String name, Prototype p){
        prototypeMap.put(name,p);
    }

    public Prototype create(String name){
        Prototype p = (Prototype) prototypeMap.get(name).createPrototype();
        return p;
    }
}
