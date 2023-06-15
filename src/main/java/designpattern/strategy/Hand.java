package main.java.designpattern.strategy;

public class Hand {
    public static final int HANDVALUE_GUU = 0; // 바위
    public static final int HANDVALUE_CHO = 1; // 가위
    public static final int HANDVALUE_PAA = 2; // 보
    public static final Hand[] hand = {new Hand(HANDVALUE_GUU),
                                       new Hand(HANDVALUE_CHO),
                                       new Hand(HANDVALUE_PAA)};
    private static final String[] name = {"주먹", "가위", "보"};
    private int handValue;
    private Hand(int handValue){
        this.handValue = handValue;
    }
    public static Hand getHand(int handValue){
        return hand[handValue];
    }
    public boolean isStrongerThan(Hand h){
        return fight(h) == 1;
    }
    public boolean isWeakerThan(Hand h){
        return fight(h) == -1;
    }
    private int fight(Hand h){
        if(this == h){ // 비김
            return 0;
        }else if((this.handValue + 1)%3 == h.handValue){ // 이김
            return 1;
        }else{ // 짐
            return -1;
        }
    }
    public String toString(){
        return name[handValue];
    }
}
