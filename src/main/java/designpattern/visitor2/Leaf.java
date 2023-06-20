package main.java.designpattern.visitor2;

public class Leaf extends BranchorLeaf {

    @Override
    public int getCountLeaf() {
        return 1;
    }

    @Override
    public String getName() {
        return null;
    }
}
