package main.java.designpattern.chainofresponsibility;

public class OddSuport extends Support {
    public OddSuport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() % 2 == 1){
            return true;
        }else{
            return false;
        }
    }
}
