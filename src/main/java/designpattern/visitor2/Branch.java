package main.java.designpattern.visitor2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Branch extends BranchorLeaf {
    private String name;
    private int countLeaf;
    private List<BranchorLeaf> childs = new ArrayList<>();

    public Branch(String name){
        this.name = name;
    }

    @Override
    public int getCountLeaf() {
        int tmp = 0;
        Iterator<BranchorLeaf> iterator = childs.iterator();
        while(iterator.hasNext()){
            BranchorLeaf bol = iterator.next();
            tmp += bol.getCountLeaf();
        }
        countLeaf = tmp;
        return countLeaf;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BranchorLeaf add(BranchorLeaf bol){
        childs.add(bol);
        return this;
    }
}
