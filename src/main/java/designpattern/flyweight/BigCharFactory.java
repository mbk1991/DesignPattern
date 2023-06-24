package main.java.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    private static BigCharFactory bigCharFactory = new BigCharFactory();
    private Map<Object,BigChar> pool = new HashMap<>();
    private BigCharFactory(){}
    public static BigCharFactory getInstance(){
        return bigCharFactory;
    }
    public synchronized  BigChar  getBigChar(char charName){
        BigChar bigChar = pool.get("" + charName);
        if(bigChar == null){
            bigChar = new BigChar(charName);
            pool.put("" + charName,bigChar);
        }else{
        }
        return bigChar;
    }
}
