package main.java.designpattern.decorator2;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요");
        String input = sc.nextLine();

        Component basic = new Reader(input);
        Component slow = new SlowReader(basic);
        Component beautiful = new BeautifulReader(basic);
        Component slowAndBeautiful = new BeautifulReader(slow);

        basic.read();
        slow.read();
        beautiful.read();
        slowAndBeautiful.read();

    }
}
