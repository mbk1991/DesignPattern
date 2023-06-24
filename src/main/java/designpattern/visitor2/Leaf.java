package main.java.designpattern.visitor2;

public class Leaf extends BranchorLeaf {
    private String name;

    public Leaf(String name){
        this.name = name;
    }
    @Override
    public int getCountLeaf() {
        return 1;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void accept(Visitor v) {
        v.visitAndProcess(this);
    }
}
