package main.java.designpattern.strategy;

import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("seed1 입력");
        int seed1 = sc.nextInt();
        System.out.println("seed2 입력");
        int seed2 = sc.nextInt();
        Player player1 = new Player("철수", new WinningStrategy(seed1));
        Player player2 = new Player("민수", new ProbStrategy(seed2));

        for(int i = 0; i < 5000; i++){
            Hand nextHand1 = player1.nextHand();
            Hand nexthand2 = player2.nextHand();
            if(nextHand1.isStrongerThan(nexthand2)){
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            }else if(nextHand1.isWeakerThan(nexthand2)){
                System.out.println("Winner" + player2);
                player1.lose();
                player2.win();
            }else{
                System.out.println("Even");
                player1.even();
                player2.even();
            }
        }

        System.out.println("Total result: ");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
