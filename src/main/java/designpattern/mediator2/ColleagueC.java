package main.java.designpattern.mediator2;

public class ColleagueC implements Colleagues {
    private Mediator mediator;
    private String name;

    public ColleagueC(String name){
        this.name = name;
    }

    @Override
    public void setMediator(Mediator mediator) {

    }

    @Override
    public void controlColleague(Colleagues c) {
        System.out.println(this.name + " : " + c.getName() + "야 이름 바꿨니!?");

    }

    public String getName(){
        return name;
    }
    public void changeName(String name){
        System.out.println(this.name + "의 이름을 변경합니다.");
        System.out.println("변경 사실을 중개자에게 알립니다.");
        this.name = name;
        mediator.colleagueChanged(this);
    }


}
