package main.java.designpattern.mediator2;

public class ConcreteMediator implements Mediator{
    Colleagues colleagues1;
    Colleagues colleagues2;
    Colleagues colleagues3;



    @Override
    public void createColleagues() {
        colleagues1 = new ColleagueA("철수");
        colleagues2 = new ColleagueB("민수");
        colleagues3 = new ColleagueC("동수");

        colleagues1.setMediator(this);
        colleagues2.setMediator(this);
        colleagues3.setMediator(this);

        colleagues1.changeName("은우");
        colleagues2.changeName("동원");


    }
    @Override
    public void colleagueChanged(Colleagues c) {
        System.out.println("Colleague들의 변화를 확인합니다.");

        if(c instanceof ColleagueA){
            colleagues2.controlColleague(c);
            colleagues3.controlColleague(c);
        }else if(c instanceof ColleagueB){
            colleagues1.controlColleague(c);
            colleagues3.controlColleague(c);

        }else if(c instanceof ColleagueC){
            colleagues1.controlColleague(c);
            colleagues2.controlColleague(c);
        }
    }
}
