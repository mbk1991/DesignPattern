package main.java.designpattern.visitor2;

public class Main {
    public static void main(String[] args){
        Branch root = new Branch("root");
        Branch branchA = new Branch("branchA");
        Branch branchB = new Branch("branchB");
        Branch branchA1 = new Branch("branchA1");
        Branch branchA2 = new Branch("branchA2");

        Leaf l1 = new Leaf("leaf1");
        Leaf l2 = new Leaf("leaf2");
        Leaf l3 = new Leaf("leaf3");
        Leaf l4 = new Leaf("leaf4");
        Leaf l5 = new Leaf("leaf5");
        Leaf l6 = new Leaf("leaf6");

        root.add(branchA);
        root.add(branchB);
        branchA.add(l1);
        branchA.add(branchA1);
        branchA.add(branchA2);

        branchA1.add(l2);
        branchA1.add(l3);
        branchB.add(l4);
        branchB.add(l5);
        branchB.add(l6);

        root.printCountLeaf();
        branchA.printCountLeaf();
        branchA1.printCountLeaf();
        branchA2.printCountLeaf();
        branchB.printCountLeaf();


        /////////////////
        System.out.println("==============================");

        Visitor wind = new ConcreteVisitor("wind");
        root.accept(wind);
    }
}
