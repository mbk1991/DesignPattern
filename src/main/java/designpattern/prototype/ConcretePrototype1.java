package main.java.designpattern.prototype;

import java.util.*;

public class ConcretePrototype1 implements Prototype {

    private String str="";
    private int n;

    public ConcretePrototype1(String str){
        this.str = str;
    }

    @Override
    public Prototype createPrototype() {
        Prototype p = null;

        try {
            p = (Prototype) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public void prototypeExcute() {
        for(int i=0; i<n; i++){
            System.out.print(str);
        }
        System.out.println();
    }

    @Override
    public void setPrototype(int n) {
        this.n = n;
    }
}
