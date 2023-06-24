package main.java.designpattern.decorator2;

public abstract class Decorator extends Component{
    protected Component component;
    protected Decorator(Component component){
        this.component = component;
    }
}
