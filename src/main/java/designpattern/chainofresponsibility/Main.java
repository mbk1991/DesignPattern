package main.java.designpattern.chainofresponsibility;

public class Main {
    public static void main(String[] args){
        Support no = new NoSupport("NoMan");
        Support limit = new LimitSupport("limitMan100",100);
        Support special = new SpecialSupport("specialMan462", 462);
        Support limit2 = new LimitSupport("limitMan200", 200);
        Support odd = new OddSuport("oddMan");
        Support limit3 = new LimitSupport("limitMan300", 300);

        no.setNext(limit).setNext(special).setNext(limit2).setNext(odd).setNext(limit3);

        for(int i=0; i<500; i+=33){
            no.support(new Trouble(i));
        }
    }
}
