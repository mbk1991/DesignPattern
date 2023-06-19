package main.java.designpattern.decorator2;

public class Reader extends Component{
    String str;
    public Reader(String str){
        this.str = str;
    }
    @Override
    protected String getStr() {
        return str;
    }
    @Override
    protected void excute() {
    }
}
