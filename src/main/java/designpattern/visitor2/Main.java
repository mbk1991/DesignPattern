package main.java.designpattern.visitor2;

public class Main {
    public static void main(String[] args){
        Branch root = new Branch("root");
        Branch branchA = new Branch("A");
        Branch branchB = new Branch("B");
        Branch branchA1 = new Branch("A1");
        Branch branchA2 = new Branch("A2");

        Leaf l1 = new Leaf();
        Leaf l2 = new Leaf();
        Leaf l3 = new Leaf();
        Leaf l4 = new Leaf();
        Leaf l5 = new Leaf();
        Leaf l6 = new Leaf();

        root.add(branchA);
        root.add(branchB);
        branchA.add(branchA1);
        branchA.add(branchA2);

        branchA.add(l5);
        branchA1.add(l1);
        branchA1.add(l2);
        branchA1.add(l6);
        branchB.add(l3);
        branchB.add(l4);

        root.printCountLeaf();
        branchA.printCountLeaf();
        branchB.printCountLeaf();


    }
}
