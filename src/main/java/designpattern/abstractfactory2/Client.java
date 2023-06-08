package main.java.designpattern.abstractfactory2;

import main.java.designpattern.abstractfactory2.factory.*;

import java.util.*;

public class Client {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("생산을 원하는 조거 세트 공장을 입력해주세요.\n" +
                "▶나이키 공장\n" +
                "main.java.designpattern.abstractfactory2.nike.NikeFactory\n" +
                "▶아디다스 공장\n" +
                "main.java.designpattern.abstractfactory2.adidas.AdidasFactory\n" +
                "▶퓨마 공장\n" +
                "main.java.designpattern.abstractfactory2.puma.PumaFactory\n");
        String factoryName = scanner.nextLine();
        String brandName = factoryName.substring(factoryName.lastIndexOf('.')+1).replace("Factory","");

        Factory factory = Factory.getFactory(factoryName);
        JoggerItem shoes = factory.produceShoes("런닝화", brandName,"285");
        JoggerItem pants = factory.producePants("팬츠", brandName, "32");
        JoggerItem windBreaker = factory.produceWindBreaker("바람막이", brandName, "110");

        System.out.println("=======생산한 조거 세트=======");
        System.out.println("====런닝화 정보====");
        System.out.println(shoes.toString());
        System.out.println("====팬츠 정보====");
        System.out.println(pants.toString());
        System.out.println("====바람막이 정보====");
        System.out.println(windBreaker.toString());
    }
}
