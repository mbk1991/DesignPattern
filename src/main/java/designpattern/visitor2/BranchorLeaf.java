package main.java.designpattern.visitor2;

public abstract class BranchorLeaf implements Visitable{
    public abstract int getCountLeaf();

    public String getName(){
        return null;
    }
    protected BranchorLeaf add(BranchorLeaf bol) throws Exception {
        throw new Exception();
    }

    public void printCountLeaf(){
        System.out.println(getName() + "가지의 잎파리의 개수는 " + getCountLeaf());
    }

}
