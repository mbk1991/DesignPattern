package main.java.designpattern.visitor2;

import java.util.Iterator;

public class ConcreteVisitor extends Visitor{
    private String name;

    public ConcreteVisitor(String name){
        this.name = name;
    }

    @Override
    public void visitAndProcess(Branch branch) {
        System.out.println();
        System.out.println("■비지터 " + this.getName() +" 이/가 " + branch.getName() +  " 에 방문합니다.");
        System.out.println(branch.getName() + " 가지가 바람에 흔들립니다.");
        Iterator<BranchorLeaf> it = branch.iterator();
        System.out.println(branch.getName() + " 의 하위 노드에 방문하여 처리합니다↓");
        while(it.hasNext()){
            BranchorLeaf b = it.next();
            b.accept(this);
        }
    }

    @Override
    public void visitAndProcess(Leaf leaf) {
        System.out.println("  " + leaf.getName() + " 나뭇잎이 바람에 흔들립니다.");
    }

    @Override
    public String getName() {
        return name;
    }
}
