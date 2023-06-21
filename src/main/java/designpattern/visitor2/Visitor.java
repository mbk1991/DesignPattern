package main.java.designpattern.visitor2;

public abstract class Visitor {
    public abstract void visitAndProcess(Branch branch);
    public abstract void visitAndProcess(Leaf leaf);
    public abstract String getName();
}
