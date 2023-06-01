package main.java.designpattern.prototype;

public class ConcretePrototype2 implements Prototype {

    public String str;
    public int n;

    public ConcretePrototype2(String str){
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
        System.out.println(str + n);
    }

    @Override
    public void setPrototype(int n) {
        this.n = n;
    }
}
