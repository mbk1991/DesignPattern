package main.java.designpattern.prototype;

public interface Prototype extends Cloneable{
    public abstract Prototype createPrototype();
    public abstract void prototypeExcute();
    public abstract void setPrototype(int n);
}
