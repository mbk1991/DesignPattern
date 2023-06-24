package main.java.designpattern.flyweight;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자열을 입력해주세요.");
        String input = sc.nextLine();

        BigString bs;
        bs = new BigString(input,true);
        bs.print();

        bs = new BigString(input, false);
        bs.print();


    }
}
